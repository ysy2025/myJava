package com.basic.day15;

/*
* abstract 关键字的使用
* 抽象类和抽象方法
* 子类比父类更具体,父类更加通用
* 把父类设置得更加通用,非常抽象,以至于没有具体的实例->抽象类
* abstract可以用来修饰 类 方法
*
* 抽象类不能实例化;
*   抽象类中的构造器对自己没用,只对子类有用.
*   开发中,都会提供抽象类的子类,让子类实例化
*
* 抽象方法
*   没用方法体;
*   不能调用;因此只能在抽象类中声明;因此,包含抽象方法的类,一定是抽象类;抽象类,可以没有抽象方法.
*   子类重写了父类中所有抽象方法,子类才可以实例化;反之,不能实例化,必须成为abstract类
 */
public class abstract01 {
    public static void main(String[] args) {
//        Person person = new Person(); // 抽象类不能实例化

        Man man = new Man();
    }
}

abstract class Person{
    public abstract void talk();
}

class Man extends Person{
    int age;
    String name;

    public Man() {
    }

    public Man(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void eat(){
        System.out.println("eat food");
    }

    public void talk(){
        System.out.println("BI BI");
    }

}