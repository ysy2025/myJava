package chapter07

/**list
 * 用来创建有序列表
 *
 */
object Test03 {
  def main(args: Array[String]): Unit = {
    val list = List(1,3,5,7,9) // 不能用抽象类,而是用伴生对象的apply

    println(list)

    println(list(0))

    list.foreach(println)

    val list2 = list :+ 111
    val list3 = 11 +: list

    list2.foreach(println)

    list3.foreach(println)

    println("+" * 20)
    val list4 = 1::list
    val list5 = list.::(2)

    println(list4)
    println(list5)

    println("+" * 20)

    val list6 = list4 :: list5
    println(list6)

    val list7 = list4 ::: list5
    println(list7)

    val list8 = list4 ++ list5
    println(list8)
  }
}
