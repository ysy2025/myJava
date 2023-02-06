package chapter06

object Test16 {
  def main(args: Array[String]): Unit = {
    val student1 = new Student16

    student1.drawing()
  }
}

// 定义一个特质
trait Young16 {
  // 声明抽象和非抽象属性
  var age: Int
  val name: String = "young guy"

  // 声明方法
  def eat(): Unit = {
    println("young guy eat much")
  }
}

// 再定义特质
trait Know16{
  var amount:Int = 0

  def increase():Unit
  def drawing(): Unit ={
    println("hahaha")
  }
}

trait Talent16{
  def singing():Unit
  def drawing():Unit = {
    println("hehehe")
  }

}

class Person16{
  def drawing():Unit = {
    println("heng")
  }

}
class Student16 extends Person16 with Young16 with Know16 with Talent16{
  override var age: Int = 111

  override def increase(): Unit = {
    println("奇怪的知识怎么总是增加啊")
  }

  override def singing(): Unit = {
    println("啊b唱歌好难听")
  }

  override def drawing(): Unit = super.drawing()
}