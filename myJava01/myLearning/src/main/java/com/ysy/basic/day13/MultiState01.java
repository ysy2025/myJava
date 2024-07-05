package com.ysy.basic.day13;

import java.util.Date;

/*
多态性
父类的引用指向之类的对象

可以直接应用在抽象类和接口上

java引用变量有两个类型:编译时类型和运行时类型
编译时,类型由声明该变量时使用的类型决定
运行时,类型由实际赋值决定

编译时,看左边;运行时,看右边


理解:事物的多种形态
父类的引用->子类的对象
需要的是父类,提供的子类的实例

为什么要这么做?
虚拟方法调用
编译期,只能调用父类中声明的方法;但运行时,实际执行的是子类重写父类的方法
编译看左边,运行看右边

使用前提
类的继承关系
要有方法的重写(运行看右边)

虚拟方法调用
子类重写了父类方法,多态情况下,父类的方法被称为虚拟方法,父类根据赋给它的不同子类对象,动态调用子类方法
这个过程,编译期无法确定
动态绑定!
静态绑定和动态绑定


为什么要有多态性?
    这里的方法,参数是父类,但是为了实现功能,需要采用多态
    如果没有多态,想传递不同类型的参数,需要每种类需要实现一个func
    比如这里 public void func(Dog dog)
    public void func(Cat cat)
    多态性避免了许多重载类!
    多态性确保了方法的通用性!

对象的多态性,只适合方法,不适合属性!属性,编译和运行都看左边!
属性不需要重载


 */
public class MultiState01 {

    public static void main(String[] args) {
        Person person = new Person();
        person.eat();

        Man man = new Man();
        man.age = 15;
        man.earn();

        Woman woman = new Woman();
        woman.age = 14;
        woman.shop();

        System.out.println("******************************");
        //*****************************
        // 多态性:对象的多态性. 这里要的是Person,但是给的是自己或者子类;
        Person person1 = new Man();

        // 当调用父子类同名同参数方法时,实际执行的是子类重写的方法->虚拟方法调用
        // 但是编译的时候,eat是父类的,指向父类;操作的时候,是按照子类重写的方法.
        person1.eat();
        person1.walk();
        System.out.println(person1.id);
        // 能不能通过person1来调用Man特有的方法?不能,因为earn方法没有被定义
        //
//        person1.earn();

        Person person2 = new Man();
        // person2.earn(); // 这里的Man,没有定义earn,编译的时候,是Person类
        //不能调用方法
        //

        // 问题1, 编译时通过,运行时,不通过
//        Person p3 = new Woman();
//        Man m3 = (Man) p3;
        // 编译时通过,运行时不通过
//        Person p4 = new Woman();
//        Man m4 = (Man) p4;


        // 编译时通过,运行时也通过
        Object o3 = new Woman();
        Person p = (Person) o3;

        // 编译不过
        // Man woman1 = new Woman(); //类型不匹配

        // 编译没办法通过
        //String str = new Date();

        // 编译通过,运行不过
        Object o = new Date();
        String str1 = (String) o;// 可以骗过编译器,但是实际执行的时候还是错误的.不相关的类是没办法相互转换的.

    }
}
