package chapter04

import scala.util.control.Breaks._

object Test06 {

  def main(args: Array[String]): Unit = {
    var i = 10
    println("+" * 20)

    breakable(while(i > 0) {
      println("zhangsan")

      i = i - 1

      if (i == 7) break

    })
    println("asdfasdf")


    breakable{
      for (i <- 0 to 10){
        println("zhangsan 的id是: " + i)
        if (i == 7) break
      }
    }
  }

}
