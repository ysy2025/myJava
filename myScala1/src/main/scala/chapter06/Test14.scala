package chapter06

object Test14 {

  def main(args: Array[String]): Unit = {
    val student1 = new Student13

    student1.printInfo()
  }
}


class Person13{

  val name:String = "zhjang"
//  var age: Int = 18

  def say(): Unit ={
    println("hello " + name)
  }

}

// 定义一个特质
trait Young {
  // 声明抽象和非抽象属性
  var age:Int
  val name:String = "young guy"

  // 声明方法
  def eat():Unit={
    println("young guy eat much")
  }

  // 抽象方法
  def say():Unit
}

class Student13 extends Person13 with Young {


  //  override val age: Int = 18 // age在继承的抽象类和trait中没有冲突
  override val name: String = "zhangsan" // name在继承的抽象类和trait中冲突了
  override var age: Int = 19

  override def say(): Unit ={
    println("young guy plays much")
  }


  def printInfo(): Unit = {
    println(s"name is $name and age is $age")
  }

}