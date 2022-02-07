package com.ysy.day02;

/*
数据类型运算规则
只讨论7种基本数据类型变量的运算,不包含布尔类型

1,自动类型提升
byte -> short -> int -> long -> float -> double
char -> int -> long -> float -> double
char 和 short 什么关系?

经过测试,应该至少是并列关系
char应该是int级别的
 */
public class Var03 {
    public static void main(String[] args) {
        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 10000L;
        float e = 100.0f;
        double f = 100000.0;
        char g = 'a';

        System.out.println(a + g);

        int b1 = a + b;
        System.out.println(b1);

        System.out.println(b + g);

        Object aa = "a";
        String h = aa.getClass().toString();


    }
}
