package chapter02

/**
 * 字符串输出
 * 字符串拼接:+号
 * printf,格式化字符串,用%传值
 * 字符串模板(插值字符串),通过$获取变量值
 */
object Test04 {

  def main(args: Array[String]): Unit = {
    val a = "zhangsan"
    val b = "lisi"
    val c = 18
    println(a + b)

    println(c + "years old " + a)

    println(a * 3)

    /*
    format的写法
     */
    printf("%s is better than %s \n".format(a, b))
    printf("%s is better than %s \n", a, b)

    /*
    插值 s 表示模板字符串
     */
    val d = s"$a is older than $b"
    val e = s"${a} is older than ${b}"
    println(d)
    println(e)

    // 小数点保留的问题
    val f:Double = 3.1415926
    val g = f"pi is ${f}%2.2f"
    println(g)

    // raw 特殊含义都没有了,完全是原汁原味的
    val h = raw"pi is ${f}%2.2f"
    println(h)

    // 三引号字符串,保持多行字符串原格式输出

    val sql =
      s"""
         |select * from a
         |where pate = 20210101
         |and pcode = 1 limit 3
         |""".stripMargin

    println(sql)
  }
}
