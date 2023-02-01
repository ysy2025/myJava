package chapter02

import chapter01.Student

object Test02 {

  def main(args: Array[String]): Unit = {

    /**
     * 声明变量的通用语法;
     * 声明变量的时候类型可以忽略,编译器可以自动推断
     * 变量声明的时候必须有初始值(包括变量和常量)
     * 声明定义一个便令的时候可以使用var或者val来修饰;var修饰的变量可以改变,val修饰的变量不能改
     */
    var a:Int = 10
    println(a)

    val b = 10
    println(b)

    val alice = new Student("alice", b)
    println(alice)

    val bob = new Student("bob", a)
//    bob.age 引用数据类型,如果想改变,需要是var;对var类型的属性可以直接修改
  }
}
