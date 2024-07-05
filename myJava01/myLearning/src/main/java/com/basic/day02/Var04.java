package com.basic.day02;

/*
强制类型转换:自动类型提升运算的逆运算
int b = (int) a
小括号强制转换

变量强制类型的两种特殊情况
long类型的数据,后面可以不加L

float类型必须要加f;

整型常量默认int,浮点常量,默认double

parseInt
 */
public class Var04 {
    public static void main(String[] args) {
        double a = 12.3;
        int b = (int) a;
        System.out.println(b);
        System.out.println((char) (b + 55));

        int aa = 128;
        byte bb = (byte) aa;
        System.out.println(bb);

        // long类型的数据,后面可以不加L
        long ll = 1123234234;
        System.out.println(ll);
        long lll = 123123123412341234L;
        System.out.println(lll);

        //float必须加f
        float ff = 1.1f;
        System.out.println(ff);

        //整型常量默认int,浮点常量,默认double
    }
}
