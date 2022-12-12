/*
CREATE EXTERNAL TABLE `test`.`ods_fwxgx_user_master_data_all_spid`(
gid string comment ' gid',
spid string comment '产品id',
mobile string comment '手机号',
is_valid string comment '是否有效',
create_time string comment '创建时间',
pr_accnt_num string comment '公司id，关联customer_wid可获得公司名',
company_supply string comment '--补充公司公司名',
product_profession string comment '产品专业',
fwxgx_profession string comment '服务新干线专业',
profession string comment '专业',
gccp_level string comment '计价产品使用等级',
gtj_level string comment '土建产品使用等级',
gqi_level string comment '安装产品使用等级',
decocost_level string comment '装饰产品使用等级',
gma_level string comment '市政产品使用等级',
gjg_level string comment '钢结构产品使用等级')
COMMENT '友商客户信息表'
PARTITIONED BY (
`pdate` int)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY '\t'
STORED AS parquet
LOCATION
'hdfs://gbigdata/warehouse/test.db/fwxgx/ods_fwxgx_user_master_data_all_spid'
TBLPROPERTIES (
'parquet.compress'='snappy');
*/
//import com.alibaba.fastjson.JSON
import java.text.SimpleDateFormat
import java.util.Calendar

import org.apache.spark.sql.SparkSession

import scala.sys.process._


//case class customProfession(product_profession:String, fwxgx_profession:String){}

case class fwxgxProfession(gid:String, spid:String, mobile:String, is_valid:String, create_time:String, pr_accnt_num:String, company_supply:String,
                           product_profession:String, fwxgx_profession:String, profession:String, gccp_level:String, gtj_level:String, gqi_level:String,
                           decocost_level:String, gma_level:String, gjg_level:String, msgAlertObject:String){
//  def get_gid = gid
//  def get_spid = spid
//  def get_mobile = mobile
//  def get_is_valid = is_valid
//  def get_create_time = create_time
//  def get_pr_accnt_num = pr_accnt_num
//  def get_company_supply = company_supply
//  def get_product_profession = product_profession
//  def get_fwxgx_profession = fwxgx_profession
//  def get_profession = profession
//  def get_gccp_level = gccp_level
//  def get_gtj_level = gtj_level
//  def get_gqi_level = gqi_level
//  def get_decocost_level = decocost_level
//  def get_gma_level = gma_level
//  def get_gjg_level = gjg_level
//  def get_msgAlertObject = msgAlertObject
//
//  val customProfessionJson = get_msgAlertObject
//  val key:String = gid + "&" +spid + "&" +mobile + "&" +is_valid + "&" +create_time + "&" +pr_accnt_num + "&" +company_supply + "&" +product_profession + "&" +fwxgx_profession + "&" +profession + "&" +gccp_level + "&" +gtj_level + "&" +gqi_level + "&" +decocost_level + "&" +gma_level + "&" +gjg_level
//
//  override def toString: String = gid + "," +spid + "," +mobile + "," +is_valid + "," +create_time + "," +pr_accnt_num + "," +company_supply + "," +product_profession + "," +fwxgx_profession + "," +profession + "," +gccp_level + "," +gtj_level + "," +gqi_level + "," +decocost_level + "," +gma_level + "," +gjg_level
}


// -----------------------------------------init-----------------------------------------
val spark = SparkSession.builder().
  appName("SZGlodon_hive2hive").
  config("spark.sql.parquet.binaryAsString", "true").
  config("spark.serializer", "org.apache.spark.serializer.KryoSerializer").
  config("spark.driver.allowMultipleContexts", "true").
  config("spark.debug.maxToStringFields", "100").
  config("hive.exec.dynamic.partition", "true").
  config("hive.exec.dynamic.partition.mode", "nonstrict").
  config("hive.merge.mapfiles", "true").
  config("hive.merge.mapredfiles", "true").
  config("hive.merge.size.per.task", "256000000").
  config("mapred.max.split.size", "256000000").
  config("hive.merge.smallfiles.avgsize", "16000000").
  config("mapred.reduce.tasks", "50").
  config("spark.sql.hive.convertMetastoreParquet", "false").
  config("spark.sql.parquet.writeLegacyFormat", true).
//  config("spark.serializer", "org.apache.spark.serializer.KryoSerializer").
  enableHiveSupport().
  getOrCreate()


//val calnow = "20220818"
val calnow = "20221207"
val sdf = new SimpleDateFormat("yyyyMMdd")
val f_date = sdf.parse(calnow)
val today_date = sdf.format(f_date)
var cal = Calendar.getInstance()
cal.setTime(f_date)
cal.add(Calendar.DATE, -1)
val yesterday_date = sdf.format(cal.getTime).toInt

// val yesterday_date = "20221129"

/*


| CREATE EXTERNAL TABLE `ods_fwxgx_user_master_data_all_spid`(                     |
|   `gid` string COMMENT ' gid',                                                   |
|   `spid` string COMMENT '产品id',                                                  |
|   `mobile` string COMMENT '手机号',                                                 |
|   `is_valid` string COMMENT '是否有效',                                              |
|   `create_time` string COMMENT '创建时间',                                           |
|   `pr_accnt_num` string COMMENT '公司id，关联customer_wid可获得公司名',                     |
|   `company_supply` string COMMENT '--补充公司公司名',                                   |
|   `product_profession` string COMMENT '产品专业',                                    |
|   `fwxgx_profession` string COMMENT '服务新干线专业',                                   |
|   `profession` string COMMENT '专业',                                              |
|   `gccp_level` string COMMENT '计价产品使用等级',                                        |
|   `gtj_level` string COMMENT '土建产品使用等级',                                         |
|   `gqi_level` string COMMENT '安装产品使用等级',                                         |
|   `decocost_level` string COMMENT '装饰产品使用等级',                                    |
|   `gma_level` string COMMENT '市政产品使用等级',                                         |
|   `gjg_level` string COMMENT '钢结构产品使用等级',                                        |
|   `customprofessionstr` string COMMENT '专业')                                     |
| COMMENT '友商客户信息表'                                                                |
| PARTITIONED BY (                                                                 |
|   `pdate` int)                                                                   |
| ROW FORMAT SERDE                                                                 |
|   'org.apache.hadoop.hive.ql.io.parquet.serde.ParquetHiveSerDe'                  |
| WITH SERDEPROPERTIES (                                                           |
|   'field.delim'='\t',                                                            |
|   'serialization.format'='\t')                                                   |
| STORED AS INPUTFORMAT                                                            |
|   'org.apache.hadoop.hive.ql.io.parquet.MapredParquetInputFormat'                |
| OUTPUTFORMAT                                                                     |
|   'org.apache.hadoop.hive.ql.io.parquet.MapredParquetOutputFormat'               |
| LOCATION                                                                         |
|   'hdfs://gbigdata/warehouse/test.db/fwxgx/ods_fwxgx_user_master_data_all_spid'  |

 */


val df=spark.read.option("header","true").csv("/tmp/lig-u/user_master_data_all_spid.csv/*")

val df1 = df.where("spid='13030' and gid = '6559951590773326403'")


import spark.implicits._


val df2 = df.rdd.map(x => {
  val gid = x.getAs[String]("gid")
  val spid = x.getAs[String]("spid")
  val mobile = x.getAs[String]("mobile")
  val is_valid = x.getAs[String]("is_valid")
  val create_time = x.getAs[String]("create_time")
  val pr_accnt_num = x.getAs[String]("pr_accnt_num")
  val company_supply = x.getAs[String]("company_supply")
  val product_profession = x.getAs[String]("product_profession")
  val fwxgx_profession = x.getAs[String]("fwxgx_profession")
  val profession = x.getAs[String]("profession")
  val gccp_level = x.getAs[String]("gccp_level")
  val gtj_level = x.getAs[String]("gtj_level")
  val gqi_level = x.getAs[String]("gqi_level")
  val decocost_level = x.getAs[String]("decocost_level")
  val gma_level = x.getAs[String]("gma_level")
  val gjg_level = x.getAs[String]("gjg_level")

  import com.google.gson.JsonObject
  val msgAlertObject = new JsonObject()
  msgAlertObject.addProperty("product_profession", product_profession)
  msgAlertObject.addProperty("fwxgx_profession", fwxgx_profession)
//  val customProfessionStr =
//    s"""
//      |{
//      |"product_profession": $product_profession 专业,
//      |"fwxgx_profession": $fwxgx_profession 专业
//      |}
//      |""".stripMargin
//  val customProfessionJson = new JSONObject(customProfessionStr)
//    val customProfessionJson = JSON.parseFull(customProfessionStr).get.asInstanceOf[Map[String,String]]
//val customProfessionJson = new JsonParser().parse(customProfessionStr).getAsJsonObject
  val fwxgxProfessionInstance = fwxgxProfession(gid, spid, mobile, is_valid, create_time, pr_accnt_num, company_supply,
                                                product_profession, fwxgx_profession, profession, gccp_level, gtj_level,
                                                gqi_level, decocost_level, gma_level, gjg_level, msgAlertObject.toString)
  fwxgxProfessionInstance
  //gid + "&" +spid + "&" +mobile + "&" +is_valid + "&" +create_time + "&" +pr_accnt_num + "&" +company_supply + "&" +product_profession + "&" +fwxgx_profession + "&" +profession + "&" +gccp_level + "&" +gtj_level + "&" +gqi_level + "&" +decocost_level + "&" +gma_level + "&" +gjg_level
}).toDF



/*
import com.google.gson.{JsonObject, JsonParser}
  val stringTest ="""{"product_profession":"zhangsan","fwxgx_profession":"lisi"}""".stripMargin

  val a = JSON.parseFull(stringTest).get.asInstanceOf[Map[String,String]]


  val jsonObj = new JsonParser().parse(stringTest).getAsJsonObject


  22/12/07 14:15:42 ERROR TaskSetManager: Task 0.0 in stage 14.0 (TID 82) had a not serializable result: com.google.gson.JsonObject
Serialization stack:
        - object not serializable (class: com.google.gson.JsonObject, value: {"product_profession":null,"fwxgx_profession":"钢结构+其他+装饰+安装+土建"})
        - field (class: $line112.$read$$iw$$iw$fwxgxProfession, name: customProfessionJson, type: class com.google.gson.JsonObject)
        - object (class $line112.$read$$iw$$iw$fwxgxProfession, 5000000000000001230,-104004,13613278953,1,2006-12-27 21:54:53,1-4BW3ES,沧州大元建业第五分公司,null,钢结构+其他+装饰+安装+土建,钢结构+其他+装饰+安装+土建,null,null,null,null,null,null)
        - element of array (index: 0)
        - array (class [L$line112.$read$$iw$$iw$fwxgxProfession;, size 1); not retrying
org.apache.spark.SparkException: Job aborted due to stage failure: Task 0.0 in stage 14.0 (TID 82) had a not serializable result: com.google.gson.JsonObject
Serialization stack:
        - object not serializable (class: com.google.gson.JsonObject, value: {"product_profession":null,"fwxgx_profession":"钢结构+其他+装饰+安装+土建"})
        - field (class: fwxgxProfession, name: customProfessionJson, type: class com.google.gson.JsonObject)
        - object (class fwxgxProfession, 5000000000000001230,-104004,13613278953,1,2006-12-27 21:54:53,1-4BW3ES,沧州大元建业第五分公司,null,钢结构+其他+装饰+安装+土建,钢结构+其他+装饰+安装+土建,null,null,null,null,null,null)
        - element of array (index: 0)
        - array (class [LfwxgxProfession;, size 1)

 */


val df3 = df2.repartition(20).map(
  each => (each.gid,each.spid,each.mobile,each.is_valid,each.create_time,each.pr_accnt_num,each.company_supply,each.product_profession,
    each.fwxgx_profession,each.profession,each.gccp_level,each.gtj_level,each.gqi_level,each.decocost_level,each.gma_level,each.gjg_level,each.customProfessionJson)
).toDF("gid","spid","mobile","is_valid","create_time","pr_accnt_num","company_supply","product_profession",
                                        "fwxgx_profession","profession","gccp_level","gtj_level","gqi_level","decocost_level","gma_level",
                                        "gjg_level","customProfessionStr")


//按照monthday分区,但是如果有分区就删除
val delete_cmd_for_io10 = s"hadoop fs -rm -r /warehouse/test.db/fwxgx/ods_fwxgx_user_master_data_all_spid/pdate=$yesterday_date"
s"$delete_cmd_for_io10"!

//删除hive内部表中存在的monthday为mday的分区
spark.sql(s"alter table industry_dm.io_10_hive_to_gp drop if exists partition (monthday=${yesterday_date})")

df2.write.mode("append").save(s"/warehouse/test.db/fwxgx/ods_fwxgx_user_master_data_all_spid/pdate=$yesterday_date")

//再重新向内部表中增加monthday=mday的分区
spark.sql(s"alter table test.ods_fwxgx_user_master_data_all_spid add partition (pdate=${yesterday_date}) location '/warehouse/test.db/fwxgx/ods_fwxgx_user_master_data_all_spid/pdate=$yesterday_date'")
