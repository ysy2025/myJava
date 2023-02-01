package chapter02

import scala.io.StdIn

/**
 * 控制台输入
 */
object Test05 {

  def main(args: Array[String]): Unit = {
    println("请输入您的大名:")
    val a = StdIn.readLine()
    println(s"欢迎${a}登录三体游戏!")

    println("请输入您的年龄:")
    val b = StdIn.readInt()
    println(s"您今年${b}岁!")
  }

}
