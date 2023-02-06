package chapter06

// 单例对象
object Test12 {
  def main(args: Array[String]): Unit = {
//    val student1 = new Student11("zhang", 11)

    val student1 = Student11.newStudent("zhang", 11)
    student1.printInfo()

    val student2 = Student11.apply("zhang", 11) // 这里的apply. 可以省略
    student2.printInfo()

  }
}

// 定义类
class Student11 private (val name:String, val age:Int){
  def printInfo(): Unit ={
    println(s"$name, $age, ${Student11.school}")
//    println(s"$name, $age, $Student11.school")

    /*
    想让构造器私有化,在参数列表前面加private;此时需要在伴生对象中定义一个类的对象实例的创建方法
     */
  }
}

// 伴生对象
object Student11 {
  val school:String = "zhang"

  // 定义一个类的对象实例的创建方法
  def newStudent(name:String, age:Int): Student11 ={
    new Student11(name:String, age:Int)
  }

  // apply 方法,可以忽略apply这个名字,直接Student11()
  def apply(name:String, age:Int): Student11 ={
    new Student11(name:String, age:Int)
  }
}