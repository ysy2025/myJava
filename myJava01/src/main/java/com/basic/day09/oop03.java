package com.basic.day09;

/*
构造器的使用,又叫构造方法(constructor)

constructor, construct, 构造,建造.
1,构造器的作用
创建对象
初始化属性

2,说明:
没有显式提供的时候,默认提供一个空参数的构造器
想显式定义:权限修饰符 类名(形参列表){}

3,构造器可以重载,这个方面和方法确实很像

4,构造器可以初始化对象

5,如果显式定义了,就以显式定义的方法为准,不再提供默认的空参数构造器.

6,一个类中,至少会有一个构造器(没有显式的,就有默认的);
 */
public class oop03 {

    public static void main(String[] args) {

        /*
        创建类的对象
        这里的 new Dog(),其实是类的同名构造方法
        调用的同名构造方法
        构造方法是最先调用的
        以后都称呼构造器(区别于方法)
         */
        Dog dog = new Dog();
        dog.eat();

        Dog dog1 = new Dog("zhangsan");
        System.out.println(dog1.name);

    }
}

class Dog{

    // 属性
    int age;
    int height;
    int weight;
    String name;
    //方法,构造方法
    public Dog(){
        System.out.println("dog is zhangsan!");
    }

    public Dog(String name){
        this.name = name;
    }

    public void eat(){
        System.out.println("dog is eatting!");
    }
}