package com.ysy.basic.day02;

public class String02 {
    public static void main(String[] args) {
        String a = "4";
//        String b = 4; 报错

        byte b = 1;
        short s = 2;
//        short t = s + b; byte类型的数据不能直接做相加减，因为在做相加减的时候，Java会默认将byte类型的数据转换成int类型，所以如果接收的数据还是byte类型的话，会出错。

        float f1 = 12.1f;
        int i1 = 1;
        float f2 = f1 +i1;

        String s1 = 123 + "";
//        int i2 = (int) s1;
        System.out.println(Integer.parseInt(s1));
    }
}
