package chapter03

/**
 * 比较运算符
 * scala 中 == 字符串的 == 相当于equals
 * 如果想判断引用内存地址是不是相同,用eq方法
 */
object Test01 {

  def main(args: Array[String]): Unit = {
    val s1:String  = "hello"
    val s2:String  = new String("hello")

//    println(s1 == s2)
//
//    println(s1.equals(s2))
//    println(s1.eq(s2))

    // 判断是否为空
    def isNotEmpty(str:String):Boolean = {
      return !(str == "")
    }

    val a = null
    println(isNotEmpty(a))
  }

}
