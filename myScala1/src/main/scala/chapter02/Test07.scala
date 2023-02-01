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

}
