package chapter03

/**
 * scala 运算符的本质
 * 都是对象的方法的调用
 *
 */
object Test02 {

  def main(args: Array[String]): Unit = {
    val a = 60
    val b = 13
    println(a | b)

    println(a.+(b))
  }
}
