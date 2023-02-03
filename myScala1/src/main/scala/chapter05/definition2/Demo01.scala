package chapter05.definition2

object Demo01 {

  def main(args: Array[String]): Unit = {
    val n1 = 1
    val n2 = 3

    val res = sum(n1, n2)
  }

  // sum 这个方法,底层是Demo01$sum类的一个方法
  def sum(n1: Int, n2: Int):Int = {
    return n1 + n2
  }
}
