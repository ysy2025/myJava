package chapter07

object Test01 {

  def main(args: Array[String]): Unit = {
    val a = new Array[Int](10)

    println(a(0))

    println(a.length)

    for (i <- 0 until 10){
      a(i) = i
    }

    a.foreach(println)

    val b = Array("zhangsan")

    println(b.mkString(","))

    b.update(0, "hhh")
    println(b.mkString(","))


    val c = a.iterator
    while (c.hasNext){
      println(c.next())
    }

    def myFunc(n:Int): Double ={
      math.log(math.pow(2, n))
    }

    println(myFunc(2))

  }
}

