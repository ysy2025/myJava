package com.ysy.basic.day11;

/*
四种权限修饰符

public, protected, default(缺省),private

protected

对于class的权限修饰只能用public和default(缺省)
public类可以再任意地方访问
default可以被同一个包内部的类访问

不同包,子类,可以用protected和public

 */
public class heir04 {
    public static void main(String[] args) {
        Order order = new Order();

        order.orderDefault = 1;
        order.orderProtected = 2;
        order.orderPublic = 3;

        order.methodDefault();
        order.methodPProtected();
        order.methodPublic();;

        //同一个包,不能调用私有的.
//        order.methodPrivate();
//        order.orderPrivate = 4;
    }
}
