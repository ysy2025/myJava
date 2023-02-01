package chapter01

class Student(name:String, age:Int) {

  def printinfo():Unit = {
    println("jStudent{" +
      "name='" + name + '\'' +
      ", age=" + age + '\'' +
      "," + Student.school +
      '}')
  }
}

// 引入伴生对象,从而实现Student的打印
/*
伴生对象和原生对象相互访问彼此的私有成员
伴生对象是实例化的对象,可以运行
 */
object Student {
  val school:String = "zhangsan"

  def main(args: Array[String]): Unit = {
    val haha = new Student("haha", 20)

    haha.printinfo()

  }
}