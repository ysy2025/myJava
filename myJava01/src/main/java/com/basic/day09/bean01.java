package com.basic.day09;

/*
javabean

java语言写的可重用的组件
三个条件:
1,类是公共的
2,一个无参数的公共的构造器
3,有属性,有setter和getter

用户可以用javabean 将功能,处理,值,数据库访问和其他任何可以用java代码创建的对象进行打包,并且其他开发者
可以通过内部的jsp页面,servlet,其他javabean,applet程序或者应用来使用这些对象.
用户可以认为javabean提供了一种随时随地的复制和粘贴功能,而不用关心任何改变

默认构造器的权限=类的权限


UML类图
 */
public class bean01 {
    public static void main(String[] args) {

        PenBean penBean1 = new PenBean();


    }
}

class PenBean{
    int id;
    int price;
    int length;
    int weight;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }



    PenBean(){

    }

}