package com.ysy.design.day01.principle.liskov;

public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.func1(10, 9));

        B b = new B();
        System.out.println(b.func2(10, 9));

    }
}

/*
* B继承了A,增加了新功能
* 但是不小心,重写了func1方法
* 导致出现问题,不满足里氏替换原则
* 实际编程中,常常会通过重写父类完成新功能,虽然简单,但是整个继承体系的复用性比较差,特别是运用多态比较频繁的时候
*
* 通常的做法:拆解的更细,原来的父类和子类,都继承一个更加通俗的基类,原有的继承关系,去掉,采用依赖,聚合,组合灯关系替代.
 */
class A{
    public int func1(int a, int b){
        return a - b;
    }
}

class B extends A{
    public int func1(int a, int b){
        return a + b;
    }

    public int func2(int a, int b){
        return func1(a, b) - 9;
    }
}