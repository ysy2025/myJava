package chapter04

/**
 * 循环守卫，即循环保护式（也称条件判断式，守卫）。保护式为 true 则进入循环
 * 体内部，为 false 则跳过，类似于 continue。
 * scala认为continue不够面向对象,就干掉了
 */
object Test03 {

  def main(args: Array[String]): Unit = {
    // 循环加上条件判断式
    for(i <- 1 to 3 if i != 2) {
      print(i + " ")
    }
    println()

    // 设置步长
    for (i <- 1 to 10 by 2) {
      println("i=" + i)
    }

    // 嵌套循环
    for(i <- 1 to 3; j <- 1 to 3) {
      println(" i =" + i + " j = " + j)
    }

    // 引入变量
    for(i <- 1 to 3; j = 4 - i) {
      println("i=" + i + " j=" + j)
    }
  }

}
