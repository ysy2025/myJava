package com.ysy.day02;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/*
java数据类型
1,按照数据类型分
基本数据类型:数值,字符,布尔
引用数据类型:类,接口,数组;字符串在类中

2,按照变量在类中声明的位置
成员变量,局部变量
成员变量,类体内声明的变量:实例变量(不以static修饰),类变量(static修饰)
局部变量,方法体内声明的变量:形式参数(方法,构造器中定义的变量),方法局部变量(方法内部定义),代码块局部变量(代码块中定义)
 */
public class Var02 {
    public static void main(String[] args) {
        System.out.println("zhangsan niubi!");
        byte a = 1;
        short b = 1;
        int c = 2;
        long d = 100L;
        float e = 100.0f;
        double f = 100.0;
        char g = 'g';
        boolean h = true;

        System.out.println(a+b+c+d+e+f+g);
        System.out.println(h);
        System.out.printf("%9.2f",e);

    }
}
