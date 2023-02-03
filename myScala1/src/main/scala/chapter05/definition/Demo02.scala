package chapter05.definition

object Demo02 {

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
  }
}
