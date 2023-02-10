package chapter07

import scala.collection.mutable

// 可变set
object Test06 {
  def main(args: Array[String]): Unit = {
    val set1 = mutable.Set(1,2,3,4,5)
    println(set1)

    println("=" * 20)

    set1 += 11
    println(set1)

  }
}
