package chapter06

object Test06 {

  def main(args: Array[String]): Unit = {
    val a = new StudentA

    println(a.age, a.name)

    a.name = "alice"
    a.age = 18
    println(a.age, a.name)


    println("=" * 20)
    val b = new StudentB("zhang", 22)
    println(b.age, b.name)

    println("=" * 20)
    val c = new StudentC("hh", 23)
    c.printInfo()

    println("=" * 20)
    val d = new StudentD("zhangsi", 18)
//    d.age = 21

    println("=" * 20)
    val e = new StudentE("hhhhh", 21)
    println(e.age, e.name, e.school)
    e.printInfo()
  }
}

// 无参构造
class StudentA{
  var name:String = _
  var age:Int = _
}

class StudentB(var name:String, var age:Int){}


class StudentC(name:String, age:Int){

  def printInfo(): Unit ={
    println(age, name)
  }

}

class StudentD(val name:String, val age:Int){}


class StudentE(var name:String, var age:Int){
  var school :String = _

  def this(name:String, age:Int, school:String){
    this(name, age)
    this.school = school
  }

  def printInfo(): Unit ={
    println(age, name, school)
  }
}