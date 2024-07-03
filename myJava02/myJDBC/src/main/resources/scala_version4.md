/**
* 为了获取海外用户的数据,需要从行为数据抽取符合的gid,然后汇总成sql语句,分批查询
  */

import java.sql.{Connection, DriverManager, ResultSet, Statement}
import java.text.SimpleDateFormat
import java.util.Calendar
import org.apache.spark.sql.{Row, SQLContext}
import org.apache.spark.{SparkConf, SparkContext}

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

// 1 获取昨天的日期
val calnow = Calendar.getInstance()
val sdf = new SimpleDateFormat("yyyyMMdd")
calnow.add(Calendar.DATE,-1)
val yesterday_date = sdf.format(calnow.getTime).toInt

// 2 获取行为数据的gid
import spark.implicits._

val gid_sql = s"""select distinct gid from dim.dim_behavior_base_dgd_full where pdate = ${yesterday_date}
|    and spid in ('11502','1419','1503','11530') limit 310""".stripMargin

val gid_res = spark.sql(gid_sql)

gid_res.persist()


//gid_res.show(30)
/**
*
+-------------------+
|                gid|
+-------------------+
|6703678812780020425|
|6409387453917942168|
...
|6857513389045179239|
+-------------------+

scala> gid_res.first()(0)
res29: Any = 6584675412952125708


想针对gid_res 进行处理就需要
https://spark.apache.org/docs/2.1.0/api/java/org/apache/spark/sql/Row.html
https://spark.apache.org/docs/2.1.0/sql-programming-guide.html
val namesDF = spark.sql("SELECT name FROM parquetFile WHERE age BETWEEN 13 AND 19")
namesDF.map(attributes => "Name: " + attributes(0)).show()

将 Array[String] 然后转换成 string
https://www.cnblogs.com/v5captain/p/14956223.html

*
*/

case class Gid(r:Row){
val gid = r.getAs[String]("gid")
}

// 3 将 org.apache.spark.sql.DataFrame 转换成 Array[String] 然后转换成 string
val gids = gid_res.toDF().rdd.map(x => {
val temp = Gid(x)
temp.gid
}).collect()

// 这里可以设置一次性填充多少gid作为下一步的sql
/**
val length = 1000
val d = c.take(10)
val c = c.drop(10)
可以不断更新
*
*/

// 4 循环切分,取数,避免sql太长了
val length = 100
val times = (gids.size)/length



val conn_str = "jdbc:mysql://csgab-in-pd-account.mysql.singapore.rds.aliyuncs.com:3306?user=account_ro&password=DerSD7gPGdmsdf234&useUnicode=true&characterEncoding=utf8&rewriteBatchedStatements=true"
// Load the driver
classOf[com.mysql.jdbc.Driver]
// Setup the connection
val conn = DriverManager.getConnection(conn_str)

/**
* val prop = new java.util.Properties
*     prop.put("url", "jdbc:mysql://10.37.140.228:3306/dam?characterEncoding=UTF-8")
*     prop.put("dbtable", "(select * from tableA where  meta_create_time =  str_to_date('2019-01-20','%Y-%m-%d') ) as tempViewName")
*     prop.put("user", "fabu")
*     prop.put("password", "73R4_h8td6fE")
*     prop.put("fetchsize","100000")
*
*
* var df2 = sparkSession.read.jdbc( prop.getProperty("url"),prop.getProperty("dbtable"), prop)
* https://blog.csdn.net/xiaoxiaohacker/article/details/86520790
*
*/
for (i <- 0 to times){
val content_part = gids.take(length)
val content_left = gids.drop(length)
val content_sql = "'" + content_part.mkString("','") + "'"
println("<================= gids are ===================>")
println(content_sql)

//  val sql = s"""select user_id,user_name,email,mobile,cast(user_type as signed) user_type,password,password_salt,
//               |password_strength,verify_status,gender,full_name,birthday,qq,company,create_time,update_time,
//               |password_mobile,null as is_agree_gdpr,is_agree_agreement,password_email
//               |from paas_account_v2.account_user
//               |where user_id in (${content_sql})""".stripMargin


val sql = s"""select user_id,user_name,email,mobile,cast(user_type as signed) user_type,password,password_salt,
|password_strength,verify_status,gender,full_name,birthday,qq,company,create_time,update_time,
|password_mobile,null as is_agree_gdpr,is_agree_agreement,password_email
|from paas_account_v2.account_user limit 3""".stripMargin
println("<================= sql is ===================>")
println(sql)
val statement = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY)
// Execute Query
val rs = statement.executeQuery(sql)


val sql = s"""select user_id
|from paas_account_v2.account_user
|limit 3""".stripMargin
println("<================= sql is ===================>")
println(sql)

//  jdbc:mysql://csgab-in-pd-account.mysql.singapore.rds.aliyuncs.com:3306?user=account_ro&password=DerSD7gPGdmsdf234&useUnicode=true&characterEncoding=utf8&rewriteBatchedStatements=true
//  option("url", "jdbc:mysql://csgab-in-pd-account.mysql.singapore.rds.aliyuncs.com:3306/paas_account_v2").

//  https://www.cnblogs.com/wwxbi/p/6978774.html


//5 定义 用户中心 mysql连接信息
val df = spark.read.
format("jdbc").
option("driver","com.mysql.cj.jdbc.Driver").
option("url", "jdbc:mysql://csgab-in-pd-account.mysql.singapore.rds.aliyuncs.com:3306/paas_account_v2?user=account_ro&password=DerSD7gPGdmsdf234&useUnicode=true&characterEncoding=utf8&rewriteBatchedStatements=true").
option("dbtable", "account_user").
option("user", "account_ro").
option("password", "DerSD7gPGdmsdf234").
option("query", sql).load()

}
