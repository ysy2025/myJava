package com.basic.day09;

/*
属性赋值的先后顺序

属性可以在哪赋值?
1,默认初始化
2,显式初始化
3,构造器

4,方法(setter)(对象.方法或者对象.属性)

先后顺序
1,2,3 负责初始化
4,是最后确定的,也可以反复使用的方法
 */
public class oop04 {
    public static void main(String[] args) {
        Book book1 = new Book();
        System.out.println(book1.id);

        book1.setId(100);
        System.out.println(book1.id);
    }

}

class Book{
    int id = 1;
    int price;
    int pages;

    Book(){
        id = 10;
    }

    public void setId(int id){
        this.id = id;
    }
}