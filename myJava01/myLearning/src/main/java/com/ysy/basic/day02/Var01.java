package com.ysy.basic.day02;
/*
1,java变量格式 数据类型 变量名 = 变量值;
2, 变量需要先声明,再使用;
3, 变量需要在作用域内,域外无作用
4, 同一个作用域内不能声明两个同名变量
 */
public class Var01 {
    public static void main(String[] args) {
        System.out.println("This is var 01");

        int myAge = 12;
        System.out.println("my age is " + myAge);

        // 先声明,后赋值
        int height;
        height = 172;
        System.out.println(height);

        //变量可以改变;
        Float weight = 71.1f;
        System.out.println(weight);
        weight = 181.2f;
        System.out.println(weight);

        //直接调用方法,方法里面的变量只能在方法这个域内部进行调用.
        eat("breakfast");
        eat("dinner");
        eat("chicken");

        // 这里直接实现了一个匿名类,没有命名,直接使用
        System.out.println(new Behave().name);
    }

    private static void eat(String input) {
        String name = "zhangsan";
        System.out.println(name + " is eating " + input);
    }
}

class Behave{
    String name = "I am eating fanta!";
}