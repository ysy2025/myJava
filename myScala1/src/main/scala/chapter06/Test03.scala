package chapter06

object Test03 {

  def main(args: Array[String]): Unit = {
    var cat:Cat = new Cat()

    println(cat.name)

    var tiger = new Tiger()
    cat.boss = tiger

    println(cat.boss.name)
  }
}

class Cat{
  // class,那么底层只会有一个类
  var name:String = "zhangsan"
  var age:Int = 18
  var color :String = "yellow"

  var boss:Tiger = _ // 表示给属性一个默认值
}

class Tiger{
  var name:String = "华南虎"
}