package chapter07

/**
 * set 数组
 */
object Test05 {
  def main(args: Array[String]): Unit = {
    val set1=  Set(1,2,3,4,5)
    val set2 =  Set(2,2,1,3,4,5)
    println(set1)
    println(set2)

    println(set2.hashCode() + "+" + set1.hashCode())

    val set3 = set1 ++ set2
    println(set3 + "=" + set3.hashCode())

    val set4 = set3 + 22
    println(set4)

    val set5 = set4 - 1
    println(set5)
  }
}
