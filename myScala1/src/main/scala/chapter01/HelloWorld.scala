package chapter01

/*
object :关键字,是一个单例对象(伴生对象)
 */
object HelloWorld {

  /*
  main方法可以从外部直接调用执行的
  def 方法名称(参数名称:参数类型):返回值类型 = {方法体}
   */
  def main(args: Array[String]): Unit = {
    println("hello world!")
    
    System.out.println("zhangsan!")
  }

}
