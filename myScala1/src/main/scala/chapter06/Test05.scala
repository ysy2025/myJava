package chapter06

object Test05 {

  def main(args: Array[String]): Unit = {
    val a = new Idea()
    a.name = "zhang"
    val b = a
    println(a.name)
    println(b.name)

    println(a == b)
    println(a.equals(b))
    println(a.eq(b))

    println("=" * 30)

    println(a.hashCode() + " " + b.hashCode())
  }
}

class Idea{
  var name :String = _
  var age:Int = _

}