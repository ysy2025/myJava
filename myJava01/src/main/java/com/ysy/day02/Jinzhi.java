package com.ysy.day02;

/*
进制转换
二进制,0b或者0B开头
十进制
八进制,0开头
十六进制,0x或者0X开头

 */
public class Jinzhi {
    public static void main(String[] args) {
        System.out.println("zhangsan");

        int a = 0b111;
        int b = 0111;
        int c = 111;
        int d = 0x111;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        int e = a + b + c + d;
        System.out.println(e);

    }
}
