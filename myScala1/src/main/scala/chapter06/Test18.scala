package chapter06

object Test18 {

  def main(args: Array[String]): Unit = {

    val register = new Register("zhang", "123")
    register.insert()
  }
}

// 定义用户类
class User(val name:String, val password:String)

trait Dao{
  _: User =>

  // 插入数据
  def insert(): Unit ={
    println(s"插入了数据: ${this.name}, ${this.password}")
  }
}

// 定义子类
class Register(name:String, password:String) extends User(name:String, password:String) with Dao {

}