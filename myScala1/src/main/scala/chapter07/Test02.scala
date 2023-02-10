package chapter07


//imutable
object Test02 {
  def main(args: Array[String]): Unit = {
    val array = Array.ofDim[Int](3, 4)
    
    array(0)(1) = 11
    array(0)(2) = 11
    array(1)(1) = 11
    
    println(array.mkString(", "))

    for(elem <- 0 until array.length; j <- 0 until array(elem).length){
      println(array(elem)(j))
    }


    for(i <- array.indices; j <- array(i).indices){
      print(array(i)(j) + "\t")

      if (j == array(i).length - 1) println()
    }
    
    array.foreach(line => line.foreach(println))
  }
}
