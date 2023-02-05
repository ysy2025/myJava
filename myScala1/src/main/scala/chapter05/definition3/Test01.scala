package chapter05.definition3

object Test01 {

  def main(args: Array[String]): Unit = {
    println(test(0))
  }

  def test(n:Int):Int = {
    if (n == 0)  return 1

    return n * test(n - 1)

//    else{n * test(n - 1)}
  }
}
