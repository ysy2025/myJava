package com.ysy.day14;

/*
static 关键字的使用
static 静态的
可以用来修饰:属性,方法,代码块,内部类

使用static修饰属性:静态变量(或者叫类变量)
    属性:按照是否static,分为静态属性和非静态属性(实例变量)
    实例变量:我们创建了类的多个对象,每个对象都独立拥有一套类中的非静态属性.修改其中一个对象的非静态属性时,不会导致其他对象中同样属性值修改
    静态变量:我们创建了类的多个对象,每个对象共享非静态属性.修改其中一个对象的非静态属性时,会导致其他对象中同样属性值修改

static 修饰属性的其他说明
    随着类的加载而加载,可以通过类.静态变量进行调用
    静态变量的加载早于对象创建
    由于类只会加载一次,因此静态变量在内存中只会存一份

静态属性案例:System.out, Math.PI


static 修饰方法:静态方法
    静态方法,随着类的加载而加载;可以直接用 类.方法 来调用
    静态方法,之所以需要确保调用的field都是static的,就是为了确保能够随着类加载而加载,而不是随着instance而加载.
    非静态方法,可以调用非静态属性或静态属性,或方法.
    这是由生命周期确定的.

static 静态结构中,不能使用this关键字,super也不能使用,因为这两个都是需要先有对象,再调用

 */
public class Static01 {

}


class Chinese{
    int age;
    int id;
    String name;

//    public static void show(){
//        System.out.println("I am " + name + " and I am " + age + " years old ages!");
//    }
}