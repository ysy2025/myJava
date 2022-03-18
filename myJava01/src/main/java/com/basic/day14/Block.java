package com.basic.day14;

/*
代码块=初始化块

1,作用,通常用来初始化类或者对象
2,只能使用static来修饰;
3,根据有没有static分为静态和非静态

4,静态代码块
    内部可以有输出语句
    随着类加载而执行
    静态代码块只执行一次
    作用:初始化类的信息
    多个静态代码块,按照先后顺序执行
    静态代码块的执行优先非静态代码块
    只可以调用静态的方法和属性

5,非静态代码块
    内部可以有输出语句
    随着对象的创建而执行
    非静态代码块随着对象创建就执行,每创建一个,就执行一次;可以执行多次;
    作用:可以在创建对象的时候给对象的属性进行初始化
    多个非静态代码块,按照先后顺序执行
    可以执行静态和非静态的方法和属性

对属性赋值位置:默认初始化,显式初始化,构造器初始化,对象.属性或者对象.方法,代码块中赋值

属性不能在属性的位置进行其他操作.

先父类后子类
静态先行
 */
public class Block {
    public static void main(String[] args) {
//        Person person = new Person();
//        String desc = Person.desc;
//        System.out.println(desc);
        Person person = new Person();
    }
}

class Person{
    String name;
    int age;
    static String desc = "zhangsan niubi!";

    //构造器
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //代码块
    {
        System.out.println("=====================");
    }
    //static 代码块
    static{
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!");
    }
    // 方法
    public static void eat(String food) {
        System.out.println("Human need to eat " +food);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}