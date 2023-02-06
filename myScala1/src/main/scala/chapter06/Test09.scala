package chapter06

object Test09 {

  def main(args: Array[String]): Unit = {

    val novel = new Novel

    novel.printName
  }
}


abstract class Book{

  var name:String
  var id:Int
  var price:Float

  def printName: Unit ={
    println(name)
  }
}


class Novel extends Book{
  override var name: String = "harry potter"
  override var id: Int = 1001
  override var price: Float = 110.1f

  override def printName: Unit = super.printName
}
