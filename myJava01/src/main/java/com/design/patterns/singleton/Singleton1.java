package com.design.patterns.singleton;


/*
* 单例模式,采取一定的方法,保证在整个软件系统中,对于某个类,只有一个对象实例,并且该类型,只提供一个,取得其对象实例的方法(静态方法)
*
* 单例模式有8种实现
* 饿汉式(静态常量,静态代码块)
* 懒汉式(线程不安全,线程安全同步方法,线程安全同步代码块)
* 双重检查
* 静态内部类
* 枚举
 */
public class Singleton1 {
    public static void main(String[] args) {
        /*
        单例模式,不能通过new来调用;只能通过方法进行调用
        所以必须调用方法
        其次,方法需要是static的,只要初始化类就加载
        第三,返回的person,必须是static的;初始化就加载,并且不会随着多次加载而改变.
         */

        Person person = Person.getter();
        Person person2 = Person.getter();
        System.out.println(person == person2);

        System.out.println(person.hashCode() == person2.hashCode());
    }
}

/*
* 饿汉式
* 优点:
*   写法简单,类加载的时候就完成了实例化;避免了线程同步问题
* 缺点:
*   类加载的时候就完成了实例化,没有lazy loading;可能造成内存浪费
*
* 基于classloader机制,避免了多线程的同步问题;
 */
class Person{
    // 1,私有化类的构造器,避免外界调用 new 调用
    private Person(){}

    // 2,内部创建类对象
    // 4.要求此对象也是静态的
    private final static Person person = new Person();

    //3.提供公共的静态的方法来调用对象
    public static Person getter(){
        return person;
    }
}

/*
* 饿汉式静态代码块
*   静态代码块也是类一加载就调用
*   和饿汉式类似,只是把实例化的过程放在了静态代码块中,没有本质区别,类加载的时候执行静态代码块,初始化类的实例.
*/
class Book{

    // 2, 私有化构造器

    private Book() {
    }

    // 3 初始化一个类,让getInstance调用;但是不初始化完全
    private static Book book;

    // 4, 静态代码块中创建单例对象
    static{
        book = new Book();
    }


    // 1, 静态方法,让外部类可以通过静态方法加载类
    public static Book getInstance() {
        return book;
    }
}


//// 懒汉式
//
//class Bank{
//    //1,私有化类的构造器,避免外界调用
//    private Bank(){}
//
//    // 2,内部创建类对象
//    private static Bank bank = null;
//
//    // 3,提供公共的静态方法来调用对象
//    public static Bank getter(){
//        if(bank == null){
//        bank = new Bank();
//        }
//        return bank;
//    }
//}