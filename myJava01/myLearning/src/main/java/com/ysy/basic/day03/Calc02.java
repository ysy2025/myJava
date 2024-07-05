package com.ysy.basic.day03;

/*
赋值运算符
=
两侧数据类型不一致时,自动类型转换或者强制类型转换进行处理
支持连续赋值

+=
-=
*=
/=
%=

+= 和 = x+是不一样的,+= 不会改变数据类型,= x+ 可能会改变数据类型
==是判断符号
 */
public class Calc02 {
    public static void main(String[] args) {
        System.out.println("zhangsan");
        int a, b;
        a = b = 2;
        System.out.printf(String.format("Hi,%d, %d", a, b));

        /*
        核心是从右往左运算
         */

        a *= b;
        System.out.println(a);
        a += b;
        System.out.println(a);
        a -= b;
        System.out.println(a);
        a /= b;
        System.out.println(a);

        /*开发中,希望变量实现+2操作,几种方法?
        a = a + 2
        a += 2
        System.out.println((a++) ++);
        上面的方式是不行的,因为 a++ 需要赋值给一个变量才可以实现++

        * */

        int i = 1;
        i *= 0.1;
        System.out.println(i);

        //恶心测试题
        int n = 10;
        n += (n++) + (++n);
        System.out.println(n);//32 = 10 + 10 + 12
    }
}
