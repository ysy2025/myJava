package com.design.day02;


public class design2 {
    public static void main(String[] args) {
    /*
    单例模式,直接通过类的static方法调用,类一加载就初始化此类
     */
        Human human1 = Human.getInstance();
        Human human2 = Human.getInstance();

        System.out.println(human1 == human2);

        Book book1 = Book.getInstance();
        Book book2 = Book.getInstance();
        System.out.println(book1.hashCode() + " " + book2.hashCode());
    }
}


// 懒汉式
class Human{
    // 2, 私有化构造器,避免外部类调用,仅提供内部使用
    private Human() {}

    // 3, 初始化一个类,让 getInstance 返回用
    // 4, 让human static,供static调用
    private static Human human = new Human();
    // 1, 静态方法,让外部类可以通过此调用,获得类
    public static Human getInstance() {
        return human;
    }
}

// 饿汉式静态代码块
// 静态代码块也是类一加载就调用

class Book{

    // 2, 私有化构造器

    private Book() {
    }

    // 3 初始化一个类,让getInstance调用;但是不初始化完全
    private static Book book;
    static{
        book = new Book();
    }


    // 1, 静态方法,让外部类可以通过静态方法加载类
    public static Book getInstance() {
        return book;
    }
}