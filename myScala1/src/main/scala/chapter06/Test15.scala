package chapter06

object Test15 {

  def main(args: Array[String]): Unit = {

    val student1 = new Student14
    student1.increase()

    // 动态混入 在实例化的时候继承trait
    val student2 = new Student14 with Talent {
      override def singing(): Unit = {
        println("b zhan 唱歌真好听")
      }

      override def drawing(): Unit = {
        println("画画也很好啊")
      }
    }

    student2.increase()
    student2.drawing()
    student2.singing()

  }
}




class Person14{

  val name:String = "zhijiang"
  //  var age: Int = 18

  def say(): Unit ={
    println("hello " + name)
  }

}
// 定义一个特质
trait Young14 {
  // 声明抽象和非抽象属性
  var age: Int
  val name: String = "young guy"

  // 声明方法
  def eat(): Unit = {
    println("young guy eat much")
  }
}

  // 再定义特质
trait Know{
    var amount:Int = 0

    def increase():Unit
  }

trait Talent{
  def singing():Unit
  def drawing():Unit

}

  // 定义类
class Student14 extends Person14 with Young14 with Know{
    override var age: Int = 111

    override val name: String = "Bzhan"

    override def increase(): Unit = {
      println("奇怪的知识又增加了")
    }
  }