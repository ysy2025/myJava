package chapter06

object Test10 {
  def main(args: Array[String]): Unit = {
    val student = new Student9
    student.eat()
    student.sleep()
  }
}

abstract class Person9{
  //非抽象属性
  val name: String = "zhang"

  // 抽象属性
  var age: Int


  // 非抽象方法
  def eat(): Unit ={
    println("person eat")
  }

  // 抽象方法
  def sleep():Unit
}

class Student9 extends Person9{
  // 实现抽象属性和方法
  var age: Int = 19

  def sleep(): Unit = {
    println("student sleep")
  }

  override val name: String = "lisi"

  override def eat(): Unit = {
    super.eat()
    println("student eat")
  }
}