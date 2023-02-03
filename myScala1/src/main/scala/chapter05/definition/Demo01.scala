package chapter05.definition

object Demo01 {

  def main(args: Array[String]): Unit = {
    var a1 = 10
    var a2 = 10

    var opt = '+'
    var res = 0;
    if (opt == '+'){
      res = a1 + a2
    }else{
      res = a1 - a2
    }

    println("res is:" + res)


    val res2 =  calc(10, 20, '-')
    println("res2 is: " + res2)
  }

  // 编写一个函数
  def calc(a1: Int, a2: Int, opt:Char):Int = {
    var res = 0;
    if (opt == '+'){
      res = a1 + a2
    }else{
      res = a1 - a2
    }

    println("res is:" + res)
    res
  }
}
