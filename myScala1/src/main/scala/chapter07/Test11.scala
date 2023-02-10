package chapter07

object Test11 {

  def main(args: Array[String]): Unit = {

    // 直接利用预先统计好的数据
    val tupleList = List(("Hello Scala Spark World ", 4), ("Hello Scala Spark", 3), ("Hello Scala", 2), ("Hello", 1))

    val tupleListExpand = tupleList.flatMap(
      tuple => {
        val strings = (tuple._1).split(" ")
        strings.map(word => (word, tuple._2))
      }
    )

    println(tupleListExpand) // List((Hello,4), (Scala,4), (Spark,4), (World,4), (Hello,3), (Scala,3), (Spark,3), (Hello,2), (Scala,2), (Hello,1))

    val wordsCountGroup = tupleListExpand.groupBy(x=>x._1)
    println(wordsCountGroup)

    val wordsCount = wordsCountGroup.mapValues(
      x => x.map(t => t._2).sum
    )

    println(wordsCount)

    val wc = wordsCount.toList.sortWith((left, right) => left._2 > right._2)
    println(wc.take(3))

  }
}
