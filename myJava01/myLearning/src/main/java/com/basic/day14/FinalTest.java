package com.basic.day14;

/*
*final
*可以用来修饰类;变量,属性;方法;
* 不可变.
* final 修饰类,类是绝后类,没有子类了;用就用,不用就算了.
*       String,System,等都是final类
* final 修饰变量
*       属性属于变量
*       变量->常量了
*       属性->常量
*   final修饰的属性,可以初始化的地方
*       显式初始化
*       代码块中初始化
*       构造器中初始化
*
*   final 修饰局部变量
*       表示成常量
*       尤其是final修饰形参时,表示此形参是常量,当我们调用此方法时,给常量形参赋值
*       赋值后只能在方法体内部使用此形参但不能重新赋值.
*
*
* final 修饰方法,最终的,不能重写了
 *       Object中的getClass方法
 *
 *   static final 用来修饰 属性,方法
 *      static final 修饰属性,全局常量
 *      static final 修饰方法,全局方法,类不能重写
 */
public class FinalTest {
    int num = 1;
    public static void main(String[] args) {
//        num = 19;
    }
}

final class FinalA{
    String a = "zhangsan";

    public void eat(){
        final int num = 10;
        System.out.println(num);
    }
    public void show(final int num){
        System.out.println(num);
    }
}

//class FinalB extends FinalA{
//}