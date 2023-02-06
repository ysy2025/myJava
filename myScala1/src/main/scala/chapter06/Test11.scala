package chapter06

object Test11 {
  def main(args: Array[String]): Unit = {
    val person:Person10 = new Person10{
      override var name: String = "alice"

      override def eat(): Unit ={
        println("person eat")
      }
    }

    person.eat()
  }
}

  // 定义抽象类
abstract class Person10{
    var name: String

    def eat():Unit
  }
