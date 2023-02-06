package chapter06

object Test13 {
  def main(args: Array[String]): Unit = {
    val student1 = Student12.getInstance()
    student1.printInfo()

    val student2 = Student12.getInstance()
    student2.printInfo()

    print(student1.hashCode(), student2.hashCode())
  }
}

// 定义类
class Student12 private (val name:String, val age:Int){
  def printInfo(): Unit ={
    println(s"$name, $age")
    //    println(s"$name, $age, $Student11.school")

    /*
    想让构造器私有化,在参数列表前面加private;此时需要在伴生对象中定义一个类的对象实例的创建方法
     */
  }
}

//// 伴生对象
//// 饿汉式单例模式
//object Student12 {
//  private val student12:Student12 = new Student12("zhang", 18)
//
//  // 定义一个类的对象实例的创建方法
//  def getInstance(): Student12 ={
//    return student12
//  }
//}

// 懒汉式
object Student12 {
  private var student12:Student12 = _

  // 定义一个类的对象实例的创建方法
  def getInstance(): Student12 ={
    if (student12 == null){
      student12 = new Student12("zhang", 128)
      student12
    }else{
      student12
    }
  }
}