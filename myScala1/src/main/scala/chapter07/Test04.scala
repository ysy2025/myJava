package chapter07

import scala.collection.mutable.ListBuffer

object Test04 {

  def main(args: Array[String]): Unit = {

    val list1 = new ListBuffer[Int]()
    val list2 = ListBuffer(1,2,3,4,5,6)

    list1.append(10)
    list2.append(2)

    println(list1)
    println(list2)

    list1.prepend(111)
    list2.prepend(111)

    println(list1)
    println(list2)

    println(list2 ++ list1)
    
    list2(0) = 1111
    println(list2)
  }
}
