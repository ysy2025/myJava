package com.basic.day08;

/*
方法的重载
1,定义:同一个类,一个以上,同名方法;参数列表不同

可变形参的方法
方法参数的值传递机制
递归方法

 */
public class klass02 {
    public static void main(String[] args) {
        System.out.println("zhangsan");

        Book book1 = new Book();
        book1.buy("zhangsan lixianji");
        
        Book book2 = new Book();
        book2.buy("zhangsan lixianji", "xiyouji");
        
    }
}

class Book{

    String name;
    int index;
    int pages;
    int price;
    int selling;

    public void buy(String person){
        System.out.println(person + " is buying.");
    }

    public void buy(String book1, String book2) {
        System.out.println("I want to buy " + book1 + " and " + book2);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSelling() {
        return selling;
    }

    public void setSelling(int selling) {
        this.selling = selling;
    }



}