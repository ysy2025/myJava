package com.basic.day03;

/*
运算符:数据运算,赋值,比较
算术
正负号
+ - * /加减乘除
%,取模

++a,前自增,先增加后调用
a++,后自增,先调用后运算
--a,前自减,先减少后调用
a--,后自减,先调用后减少
+,字符串连接

赋值
比较
逻辑
位运算
三元

 */
public class Calc01 {
    public static void main(String[] args) {
        System.out.println("zhangsan");
        //先后自增减的问题
        int a = 100;
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++a);
        System.out.println(a);
        System.out.println(a--);
        System.out.println(a);
        System.out.println(--a);
        System.out.println(a);

        //除号的问题
        /*
        整型除不尽会略掉
         */
        int num1 = 12;
        int num2 = 5;
        int res1 = num1 / num2;
        System.out.println(res1);

        /*
        想要精确值2.4
         */
        double res2 = num1 / (double)num2;
        System.out.println(res2);

        /*
        其实本质上是运算先后顺序,优先级
         */

        /*
        取余数运算.正负的问题;结果符号和被取模的数的符号保持一致
         */
    }
}
