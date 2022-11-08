import org.apache.spark.mllib.linalg.Vectors
import org.apache.spark.sql.SQLContext
import org.apache.spark.{SparkConf, SparkContext}

val conf = new SparkConf()

val sc = new SparkContext(conf)

val sqlContext = new SQLContext(sc)

val train1 = sqlContext.createDataFrame(Seq(
    (1.0, Vectors.dense(0.4, 4.3, -3.4)),
    (1.0, Vectors.dense(1.2, 9.8, -9.5)),
    (0.0, Vectors.dense(-0.1, 12.4, -2.3)),
    (0.0, Vectors.dense(-1.9, 8.7, -4.6))
))