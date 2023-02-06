package chapter06

import scala.beans.BeanProperty

object Test08 {

  def main(args: Array[String]): Unit = {
//    val student = new Student7("zhangsan", 18)
//    val student2 = new Student7("zhangsan", 18, "001")
//
////    println(student.age, student.name, student.stdNo) // 这里实际上是调用的_ 和 _
//    student.printInfo()
//    student2.printInfo()

    val teacher = new Teacher
    teacher.printInfo()


    def personInfo(person: Person7): Unit ={
      person.printInfo()
    }
    
    personInfo(teacher)
  }
}

class Person7(){
  var name: String = _
  var age:Int = _

  println("1 父类主构造器")

//  var school:String
  def this(name:String, age:Int){
    this()
    println("2 父类辅助构造器")
    this.name = name
    this.age = age
  }

  def printInfo(): Unit ={
    println(s"person $name, $age")
  }
}

// 定义一个子类
//class Student7(name:String, age:Int) extends Person7(name:String, age:Int){
//class Student7 extends Person7 {
class Student7(name:String, age:Int) extends Person7{
    println("3 子类主构造器")

    var stdNo:String = _

  def this(name:String, age:Int, stdNo:String){
    this(name, age)
    this.stdNo = stdNo
    println("4 子类辅助构造器")
  }

  override def printInfo(): Unit = {
    println(s"person $name, $age $stdNo")
  }
}

class Teacher extends Person7{
  override def printInfo(): Unit = {
    println(s"teacher")
  }
}