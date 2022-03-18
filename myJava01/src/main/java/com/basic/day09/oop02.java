package com.basic.day09;

/*
封装性体现的是
4种权限修饰符来修饰类和内部结构,体现类及内部结构在被调用时,可见性的大小.
 */
public class oop02 {
    public static void main(String[] args) {
        Order order = new Order();

//        order.methodDefault();

//        order.orderPrivate = 1;
//        order.orderDefault = 2;
//        order.orderPublic = 3;
//
//
//        System.out.println(order.orderPublic);
//        System.out.println(order.orderDefault);
//        System.out.println(order.orderPrivate);

        order.methodDefault();
        System.out.println(order.orderPublic);


    }
}

