package chapter06

object Test02 {

  def main(args: Array[String]): Unit = {
    val student = new Student()
    println(student.age)
  }
}

// 定义一个类
class Student{

  // 定义属性
  var name:String = "Alice"
  var age:Int = _
  val sex:String = "male"
}