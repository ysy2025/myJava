package chapter04

/**
 * while 循环
 */
object Test05 {

  def main(args: Array[String]): Unit = {
    var i = 10;
    while (i > 0){
      println(i)
      i -= 1
    }
    
    do {
      println(i)
      i -= 1
    }while (i > 0)
  }
}
