package chapter06

object Test19 {

  def main(args: Array[String]): Unit = {

    val phone = new iPhone

    println(phone.isInstanceOf[Phone])

    // 类型监测


    // 类型转换 子类型以父类型存储,但是可以转化为子类型
    val phone1:Phone = new iPhone()

    val phone2 = phone1.asInstanceOf[iPhone]

    phone2.Siri()

//    phone1.Siri()
  }
}

 class Phone{
  val brand:String = "phone"
  val price:Int = 1999
}

class iPhone extends Phone{
  override val brand: String = "iPhone"
  override val price: Int = 3999

  def Siri(): Unit ={
    println("Hi I am siri")
  }
}

class MiPhone extends Phone{
  override val brand: String = "Mi"
  override val price: Int = 2999

  def XiaoAi(): Unit ={
    println("xiao ai tongxue")
  }
}

