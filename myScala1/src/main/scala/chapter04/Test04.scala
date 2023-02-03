package chapter04

object Test04 {

  def main(args: Array[String]): Unit = {
//    val res = for(i <- 1 to 10) yield i
//    println(res)
//
//    // 倒序输出
//    for(i <- 1 to 10 reverse){
//      println(i)
//    }
//
//    for(i <- 1 to 10){
//      val j = i + 1
//      println(j)
//    }


    // 练习
    val a = for(i <- 1 to 100 if i%9 == 0) yield i
    println(a)
    println(a.sum)
    println(a.length)

    for(i <- 0 to 6; j = 6-i){
      println("%d + %d = %d".format(i, j, 6))
    }
  }
}
