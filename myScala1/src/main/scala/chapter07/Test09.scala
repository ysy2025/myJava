package chapter07

object Test09 {
  def main(args: Array[String]): Unit = {
    // 单词计数：将集合中出现的相同的单词，进行计数，取计数排名前三的结果
    val stringList = List("Hello Scala Hbase kafka", "Hello Scala Hbase", "Hello Scala", "Hello")
    
    // 字符串转换为单词
    val words = stringList.flatMap(_.split(" "))
    println(words)
    
    // 按照单词分组
    
    val wordsGroup = words.groupBy(a => a)
    println(wordsGroup)

    val wordsGroupCount = wordsGroup.map(x => (x._1, x._2.length))
    println(wordsGroupCount)
    
    val wordsGroupCountSorted = wordsGroupCount.toList.sortWith((left, right) => left._2 > right._2)
    println(wordsGroupCountSorted)

    val res = wordsGroupCountSorted.take(3)
    println(res)
  }
}
