package com.ysy.recommender
import org.apache.spark.sql.{DataFrame, SparkSession}
import org.apache.spark.{SparkConf, SparkContext}



case class Product(productId:Int, name:String, imageUrl:String, categories:String, tags:String)

case class Rating(userId:Int, productId:Int, score:Double, timestamp:Int)

case class MongoConfig(uri:String, db:String)

object DataLoader {
  val PRODUCT_DATA_PATH = "src/main/resources/products.csv"
  val RATTING_DATA_PATH = "src/main/resources/rating.csv"

  val MONGODB_PRODUCT_COLLECTION = "Product"
  val MONGODB_RATING_COLLECTION = "Rating"

  val spark = SparkSession.builder.master("local[4]").getOrCreate
  import spark.implicits._

  def storeDataInMongoDB(productDF: DataFrame, ratingDF: DataFrame) = {}

  def main(args: Array[String]): Unit = {

    // 应用用到的配置参数
    val config = Map(
      "spark.cores" -> "local[*]",
      "mongo.uri" -> "mongodb://192.168.10.200:27017/recommender",
      "mongo.db" -> "recommender"
    )

    println(config.get("spark.cores"))
    //  创建一个sparkConf配置
    val sparkConf = new SparkContext()
    val spark = SparkSession.builder().getOrCreate()

    // 加载数据集
    val productRDD = spark.sparkContext.textFile(PRODUCT_DATA_PATH)
    val ratingRDD = spark.sparkContext.textFile(RATTING_DATA_PATH)

    val productDF = productRDD.map(item => {
      val attr = item.split("\\^")
      Product(attr(0).toInt, attr(1).trim, attr(4).trim, attr(5).trim, attr(6).trim)
    }).toDF("productId", "name", "imageUrl", "categories", "tags")

    val ratingDF = ratingRDD.map(item =>{
      val attr = item.split(",")
      Rating(attr(0).toInt,attr(1).toInt,attr(2).toDouble,attr(3).toInt)
    }).toDF("userId", "productId", "score", "timestamp")

    // 声明一个隐式的配置对象
    implicit val mongoConfig = MongoConfig(config.get("mongo.uri").get,config.get("mongo.db").get)

    storeDataInMongoDB(productDF, ratingDF)

    // 关闭Spark
    spark.stop()

  }
}