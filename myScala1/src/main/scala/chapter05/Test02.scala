package chapter05

object Test02 {

  def main(args: Array[String]): Unit = {

    val func = (name:String) => {println(name)}

    func("zhangsan")

    // 定义一个函数,以函数作为参数输入
    def func2(func: String => Unit) :Unit ={
      func("zhangsan")
    }

    func2(func)
  }
}
