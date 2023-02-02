package chapter02

/**
 * 数据类型
 * java的基本类型 + 引用类型(对象队形)
 * 基本类型 char byte short int long float double boolean
 * 基本类型的包装类:Character,Byte,Short,Integer,Long,Float,Double,Boolean
 * java的基本类型不是真正意义的对象
 * 包装类型都是Object的子类;基本数据类型跟Object无关
 * 基本类型和引用类型没有共同的祖先
 *
 * scala排除了基本数据类型;都是引用类型
 *
 * scala中一切数据都是对象,都是Any的子类
 * 数据类型分2种,数值 AnyVal +引用 AnyRef ;不管是值类型还是引用类型都是对象;
 * scala数据类型依然遵守,隐式转换规则(低精度值类型向高精度类型自动转换);
 *
 * scala中的StringOps是java中的String增强
 * Unit是java的void;表示没有返回值;Unit是一个数据类型,只有一个对象,();void不是数据类型,而是关键字
 * Null是一个额类型,只有一个对象,null;她是所有引用类型的子类
 *
 * AnyRef,所有scala类对应的对象,都是AnyRef;Java类创建的对象也是AnyRef;scala的collections,集合类型,也是AnyRef;Null也是AnyRef
 * Nothing,表示没有东西;值没有,引用没有;在一个函数没有明确返回值的时候使用
 */
object Test07 {

  def main(args: Array[String]): Unit = {
    val a1: Byte = 1
    println(a1)

    val a2: Long = 12123123123123123L
    println(a2)

    val a3 :Byte = 10
    val a4 :Int = 13 + 20

    println(a4)

    val a5 = (a3 + 10).toByte
    println(a5)

    // float & double; 默认是double类型
    val b1:Float = 1.234f
    val b2 = 1.223


    // char
    val c1 = 'a'
    println(c1)

    // 特殊字符
    val c2 = '\t'
    val c3 = '\n'

    // 转义字符
    val c4 = '\\' // 表示反斜杠自身
    val c5 = '\"'

    /**
     * 字符变量本身保存的是ASCII码
     */
    val c6 = '9'
    val c7:Int = c6
    println(c7)


   // unit,是一个空括号

    def sayOk:Unit={}
    println(sayOk)

    val d1 = sayOk
    println(d1)

    // null 值类型不能接受null;引用类型可以接受null
    val d2 :Null = null
    print(d2)

    // Nothing
    def sss(n:Int):Int={
      if (n == 0){
        throw new NullPointerException // 返回异常值是nothing
      }
      else{
        return n
      }

    }
  }
}
