package chapter02

/**
 * 标识符的命名规范
 * 以字母或者下划线开头,后接字母,数字,下划线
 * 以操作符开头,而且只包含操作符;操作符组合可以,比如+-*
 * 用反引号 `` 包起来的任意字符串,即使是scala的39个关键字也可以
 */
object Test03 {
  def main(args: Array[String]): Unit = {

    val _a = 1

    val hello1 = 1

    val _ = 10

    val `a-b` = 1
    println(`a-b`)


  }
}
