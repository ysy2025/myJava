package com.ysy.day10;

import com.ysy.day11.Order;

public class mvc02 {
    public static void main(String[] args) {
        Order order = new Order();

        //跨包的不同类,只能用public了
//        order.orderDefault = 1;
//        order.orderProtected = 2;
        order.orderPublic = 3;

//        order.methodDefault();
//        order.methodPProtected();
        order.methodPublic();;

        //同一个包,不能调用私有的.
//        order.methodPrivate();
//        order.orderPrivate = 4;
    }
}
