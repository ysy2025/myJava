package chapter04

object Test02 {

  def main(args: Array[String]): Unit = {
    /**
     * scala的范围遍历
     */
    for(i<- 1 to 10){ // for ( i <- 1.to(10)){xxx}
      println("zhangsan" + i)
    }

    println("=" * 20)
    /**
     * 边界问题
     */
    for(i <- new Range(1, 10, 1)){
      println("lisi" + i)
    }

    println("-" * 20)
    for (i <- 1 until 10){
      println("wangwu" +i)
    }

    
    println("^" * 20)
    // 集合遍历
    for (i <- List(1,2,3,4,5)){
      println(i)
    }
  }

}
