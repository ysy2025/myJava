package chapter06

object Test17 {

  def main(args: Array[String]): Unit = {
    val ball = new MyBall

    println(ball.desc())


  }
}

// 定义球类
trait Ball{
  def desc(): String = "ball"
}

trait Color extends Ball{
  val color:String = "green"

  override def desc(): String = color + "-" + super.desc()
}

trait Category extends Ball{
  val cat:String = "glass"

  override def desc(): String = cat + "-" + super.desc()
}

class MyBall extends Color with Category{
  override def desc(): String = "my ball is a " + super[Category].desc()
}