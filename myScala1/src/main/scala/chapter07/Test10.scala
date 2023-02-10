package chapter07

object Test10 {

  def main(args: Array[String]): Unit = {
    // 第一种方式（不通用）
    // List[Tuple]
    val tupleList = List(("Hello Scala Spark World ", 4), ("Hello Scala Spark", 3), ("Hello Scala", 2), ("Hello", 1))
    /*
    完全展开,合在一起
     */

//    println(tupleList(0).getClass) // class scala.Tuple2
    // 展开
    val tupleList2 = tupleList.map(x => (x._1.trim() + " ") * x._2)
    println(tupleList2)

    // 按照之前的思路走一遭
    val tupleListGroup = tupleList2.flatMap(_.split(" "))
    println(tupleListGroup)


    // 按照单词分组

    val wordsGroup = tupleListGroup.groupBy(a => a)
    println(wordsGroup)

    val wordsGroupCount = wordsGroup.map(x => (x._1, x._2.length))
    println(wordsGroupCount)

    val wordsGroupCountSorted = wordsGroupCount.toList.sortWith((left, right) => left._2 > right._2)
    println(wordsGroupCountSorted)

    val res = wordsGroupCountSorted.take(3)
    println(res)
  }
}
