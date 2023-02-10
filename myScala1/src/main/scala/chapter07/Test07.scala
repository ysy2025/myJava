package chapter07

object Test07 {

  def main(args: Array[String]): Unit = {
    val list: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9)

    val nestedList: List[List[Int]] = List(List(1, 2, 3), List(4, 5, 6), List(7, 8, 9))

    val wordList: List[String] = List("hello world", "hello atguigu", "hello scala")

    // filter
    val flt = list.filter(x=>x%2 == 0)

    println(list)
    println(flt)

    // transform & map
    val trans = list.map(x=>x+1)
    println(trans)

    //flatten
    val flat = nestedList.flatten
    println(flat)

    // flatMap
    val flatmap = wordList.flatMap(x=>x.split(" "))
    println(flatmap)

    // group
    val group = list.groupBy(x=>x%2)
    println(group)

    // reduce
    val reduce = list.reduce(_ - _)
    println(reduce)

    val reduce2 = list.reduceRight(_ - _)
    println(reduce2)

    // fold
    val fold = list.foldLeft(1)(_ + _)
    println(fold)
  }
}
