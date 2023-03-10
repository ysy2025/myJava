package com.ysy.statistics
import org.apache.spark.sql.{DataFrame, SparkSession}
import org.apache.spark.{SparkConf, SparkContext}

//case class Rating(userId: Int, productId: Int, score: Double, timestamp: Int)
//
//case class MongoConfig(uri:String, db:String)


  object StatisticRecommender {

    val MONGODB_RATING_COLLECTION = "Rating"

    //统计的表的名称
    val RATE_MORE_PRODUCTS = "RateMoreProducts"
    val RATE_MORE_RECENTLY_PRODUCTS = "RateMoreRecentlyProducts"
    val AVERAGE_PRODUCTS = "AverageProducts"

    def main(args: Array[String]): Unit = {

      val config = Map(
        "spark.cores" -> "local[*]",
        "mongo.uri" -> "mongodb://localhost:27017/recommender",
        "mongo.db" -> "recommender"
      )

      //创建SparkConf配置
//      val sparkConf = new SparkConf().setAppName("StatisticsRecommender").setMaster(config("spark.cores"))

    }
  }

