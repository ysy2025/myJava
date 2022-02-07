package com.ysy.day02;

public class Char01{
    public static void main(String[] args) {
        char a = '中';
        System.out.println(a);
        int a1 = (int) a;
        System.out.println(a1);
        System.out.println(Character.toChars(a1));
        System.out.println((char) a1);
    }
}
