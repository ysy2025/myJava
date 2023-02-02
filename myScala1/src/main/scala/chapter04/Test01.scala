package chapter04

import scala.io.StdIn

object Test01 {

  def main(args: Array[String]): Unit = {
    val age: Int = StdIn.readInt()

    if (age >= 18){
      println("chengnian")
    }else{
      println("weichengnian")
    }


  }

}
