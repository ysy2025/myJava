/**
 * 为了获取海外用户的数据,需要从行为数据抽取符合的gid,然后汇总成sql语句,分批查询
 */

import java.sql.{Connection, DriverManager, ResultSet, Statement}
import java.text.SimpleDateFormat
import java.util.Calendar
import scala.sys.process._
import org.apache.spark.sql.types.{IntegerType, LongType, StringType, StructField, StructType}
import org.apache.spark.sql.{DataFrame, Row, SQLContext, SparkSession}
import org.apache.spark.{SparkConf, SparkContext}


// 0 初始化spark环境, 目标表的schema,处理函数
val spark = org.apache.spark.sql.SparkSession.builder().appName("test06").
  config("spark.sql.parquet.binaryAsString", "true").
  config("spark.serializer", "org.apache.spark.serializer.KryoSerializer").
  config("spark.driver.allowMultipleContexts", "true").
  config("spark.debug.maxToStringFields", "200").
  config("spark.sql.crossJoin.enabled", "true").
  config("hive.exec.dynamic.partition","true").
  config("hive.exec.dynamic.partition.mode","nonstrict").
  config("hive.merge.mapfiles","true").
  config("hive.merge.mapredfiles", "true").
  config("hive.merge.size.per.task", "256000000").
  config("mapred.max.split.size","256000000").
  config("hive.merge.smallfiles.avgsize", "16000000").
  config("mapred.reduce.tasks", "5").
  config("spark.sql.hive.convertMetastoreParquet","false").
  enableHiveSupport().getOrCreate()

val schema = StructType(List(
  StructField("user_id", LongType, nullable=true),
  StructField("user_name", StringType, nullable=true),
  StructField("email", StringType, nullable=true),
  StructField("mobile", StringType, nullable=true),
  StructField("user_type", IntegerType, nullable=true),
  StructField("password", StringType, nullable=true),
  StructField("password_salt", StringType, nullable=true),
  StructField("password_strength", IntegerType, nullable=true),
  StructField("verify_status", IntegerType, nullable=true),
  StructField("gender", StringType, nullable=true),
  StructField("full_name", StringType, nullable=true),
  StructField("birthday", StringType, nullable=true),
  StructField("qq", StringType, nullable=true),
  StructField("company", StringType, nullable=true),
  StructField("create_time", StringType, nullable=true),
  StructField("update_time", StringType, nullable=true),
  StructField("password_mobile", StringType, nullable=true),
  StructField("is_agree_gdpr", StringType, nullable=true),
  StructField("is_agree_agreement", IntegerType, nullable=true),
  StructField("password_email", StringType, nullable=true)
))

def parseResultSet(rs: ResultSet): Row = {
  // 根据rs.getString(0) 的思路,需要循环,然后遍历
  val user_id = rs.getLong(1)
  val user_name = rs.getString(2)
  val email = rs.getString(3)
  val mobile =rs.getString(4)
  val user_type =rs.getInt(5)
  val password =rs.getString(6)
  val password_salt =rs.getString(7)
  val password_strength =rs.getInt(8)
  val verify_status =rs.getInt(9)
  val gender =rs.getString(10)
  val full_name =rs.getString(11)
  val birthday =rs.getString(12)
  val qq =rs.getString(13)
  val company =rs.getString(14)
  val create_time =rs.getString(15)
  val update_time =rs.getString(16)
  val password_mobile =rs.getString(17)
  val is_agree_gdpr =rs.getString(18)
  val is_agree_agreement =rs.getInt(19)
  val password_email =rs.getString(20)
  Row(user_id,user_name,email,mobile,user_type,
    password,password_salt,password_strength,
    verify_status,gender,full_name,birthday,
    qq,company,create_time,update_time,
    password_mobile,is_agree_gdpr,
    is_agree_agreement,password_email)
}

def resultSetToIter(rs: ResultSet)(f: ResultSet => Row): Iterator[Row] =
  new Iterator[Row] {
    def hasNext: Boolean = rs.next()
    def next(): Row = f(rs)
  }

def parallelizeResultSet(rs: ResultSet, spark: SparkSession): DataFrame = {
  val rdd = spark.sparkContext.parallelize(resultSetToIter(rs)(parseResultSet).toSeq)
  spark.createDataFrame(rdd, schema) // use the schema you defined in step 1
}

/************************************************************************************************************************************/
/************************************************************************************************************************************/

// 1 获取昨天的日期
val calnow = Calendar.getInstance()
val sdf = new SimpleDateFormat("yyyyMMdd")
calnow.add(Calendar.DATE,-1)
val yesterday_date = sdf.format(calnow.getTime).toInt

// 2 获取行为数据的gid
import spark.implicits._
val gid_sql = s"""select distinct gid from test.edw_kafka_behavior_log_foreign_full_gid where pdate = ${yesterday_date}""".stripMargin
val gid_res = spark.sql(gid_sql)
gid_res.persist()


// 处理结果,转化为string
case class Gid(r:Row){
  val gid = r.getAs[String]("gid")
}

// 3 将 org.apache.spark.sql.DataFrame 转换成 Array[String] 然后转换成 string
var gids = gid_res.toDF().rdd.map(x => {
  val temp = Gid(x)
  temp.gid
}).collect()



/************************************************************************************************************************************/
/************************************************************************************************************************************/

// 4 循环切分,取数,避免sql太长了
val length = 2000
val times = (gids.size)/length


// 5 设置connection
val conn_str = "jdbc:mysql://csgab-in-pd-account.mysql.singapore.rds.aliyuncs.com:3306?user=account_ro&password=DerSD7gPGdmsdf234&useUnicode=true&characterEncoding=utf8&rewriteBatchedStatements=true"
// Load the driver
classOf[com.mysql.jdbc.Driver]
// Setup the connection
val conn = DriverManager.getConnection(conn_str)

/************************************************************************************************************************************/
/************************************************************************************************************************************/

// 6 取数
// 取数之前首先需要清除当天的旧数据
val delete_cmd=s"hadoop fs -rm -r /warehouse/test.db/ysy_foreign_users/pdate=${yesterday_date}/*"
s"$delete_cmd"!

for (i <- 0 to times){
  val content_part = gids.take(length)
  gids = gids.drop(length)
  val content_sql = "'" + content_part.mkString("','") + "'"
  println("<================= gids are ===================>")
  println(content_sql)

  val sql = s"""select user_id,user_name,email,mobile,cast(user_type as signed) user_type,password,password_salt,
               |password_strength,verify_status,gender,full_name,birthday,qq,company,create_time,update_time,
               |password_mobile,null as is_agree_gdpr,is_agree_agreement,password_email
               |from paas_account_v2.account_user
               |where user_id in (${content_sql})""".stripMargin
  println("<================= sql is ===================>")
  println(sql)

  val statement = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY)
  // val statement = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY)
  // Execute Query
  val rs = statement.executeQuery(sql)

  val columns = Seq("user_id","user_name","email","mobile","user_type","password",
    "password_salt","password_strength","verify_status","gender","full_name",
    "birthday","qq","company","create_time","update_time","password_mobile",
    "is_agree_gdpr","is_agree_agreement","password_email")

  val df: DataFrame = parallelizeResultSet(rs, spark)

  df.repartition(1).write.mode("append").save(s"/warehouse/test.db/ysy_foreign_users/pdate=${yesterday_date}/part=${i}")
  /**
   * 建表
   * create external table test.ysy_foreign_users(
   * `user_id`bigint,
   * `user_name`string,
   * `email`string,
   * `mobile`string,
   * `user_type`int,
   * `password`string,
   * `password_salt`string,
   * `password_strength`int,
   * `verify_status`int,
   * `gender`string,
   * `full_name`string,
   * `birthday`string,
   * `qq`string,
   * `company`string,
   * `create_time`string,
   * `update_time`string,
   * `password_mobile`string,
   * `is_agree_gdpr`string,
   * `is_agree_agreement`int,
   * `password_email`string)
   * partitioned by (
   * `pdate` string COMMENT '日期',
   * `part` int COMMENT '分区,无意义')
   * ROW format delimited fields terminated by ','
   * STORED AS parquet
   * LOCATION 'hdfs://gbigdata/warehouse/test.db/ysy_foreign_users' ;
   */
}

Seq("hive-shell","-e","msck repair table test.ysy_foreign_users").!

conn.close()
