package com.ysy.design.patterns.factory.basic;


/*
实际需求

pizza工厂
1,便于种类扩展,便于维护
2,pizza种类很多,例如greek,chinese类型的pizza
3,制作过程:prepare,bake,cut,box
4,pizza店的订购模式

现在自己的思路
 */
public class PizzaStore {

    public static void main(String[] args) {

        // 使用简单工厂模式
        new OrderPizza(new SimpleFactory());
        System.out.println("exit!");

    }
}

