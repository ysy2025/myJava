package chapter06

object Test04 {

  def main(args: Array[String]): Unit = {
    val a = new Employee()

    println(a.sal)

    //
    val e2 = new Employee()
    println(e2.sal)

    //
    val e3:A = new Employee()
    println(e3)
  }
}

class Employee extends A{
  var id:Int = 10
  var name :String = "tom"
  var sal:Double = 10000.0


  override def toString = s"Employee($id, $name, $sal)"
}

class A{

}