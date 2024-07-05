package com.ysy.basic.day14;

/*
设计模式:大量的实践中总结和理论化之后优选的代码结构,编程风格,以及解决问题的思考方式
设计模式就像经典的棋谱,不同的棋局用不同的棋谱
相当于,解决问题的套路

单例模式,就是采取一定的方法保证在整个软件系统中,对某个类只能存在一个对象实例,并且该类只提供一个取得其对象实例的方法
如果要让类在一个虚拟机中只产生一个对象,首先必须将类的构造器的访问权限设置为private,就不会用new操作符在类外部构建新对象了
但是类内部仍然可以产生该类的对象.

类的外部无法得到对象,只能调用该类的某个静态方法以返回类内部创建的对象,静态方法只能访问类中静态成员变量.
所以,指向类内部产生的该类对象的变量的对象必须是静态的.


如何实现?
两种
 */
public class Singleton01 {
    public static void main(String[] args) {
        Bank bank1 = Bank.getBank();

        Bank bank2 = Bank.getBank();

        System.out.println(bank1 == bank2);

        Book book1 = Book.getBook();
        Book book2 = Book.getBook();
        System.out.println(book1 == book2);

    }
}

//饿汉式
class Bank{
    // 1,私有化类的构造器,避免外界调用
    private Bank(){

    }

    // 2,内部创建类对象,4.要求此对象也是静态的
    private static Bank bank = new Bank();

    //3.提供公共的静态的方法来调用对象
    public static Bank getBank(){
        return bank;
    }
}

//懒汉式
class Book{
    //1,创建私有化的构造器,避免外界调用
    private Book(){

    }

    //2,内部声明当前类的变量,但不初始化; 4,此对象必须声明为static的
    private static Book book = null;

    //3, 声明一个获取对象的方法
    public static Book getBook(){
        if (book == null){
            book = new Book();
        }
        return book;
    }
}