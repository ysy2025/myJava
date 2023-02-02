package chapter02

object Test09 {

  def main(args: Array[String]): Unit = {
    val b: Int = 130
    val a = b.toByte // 溢出了

    println(a)
  }
}
