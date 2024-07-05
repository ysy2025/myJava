package com.ysy.basic.day08;

import com.ysy.basic.day09.Order;

public class OrderTest {
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

//        order.methodDefault();

        order.methodPublic();
        System.out.println(order.orderPublic);


    }
}

