package com.ysy.day08;


/*
核心一句话:临时变量就是临时变量,永远成不了变量
数值型实际参数化身形参的时候,会在栈复制1个
引用型实际参数化身形参的时候,复制的是地址!
这是最大的区别
 */
public class klass04 {

    public static void main(String[] args) {

        klass04 klass04 = new klass04();

        klass04.first();

    }

    private void first() {
        int i = 5;
        Value v = new Value();
        v.i = 25;
        second(v, i);
        System.out.println(v.i);
    }

    private void second(Value v, int i) {
        i = 0;
        v.i = 10;
        Value val = new Value();
        v = val;
        System.out.println(v.i +"    " + i);
    }
}

class Value{
    int i = 1000;
}