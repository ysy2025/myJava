package com.ysy.design.patterns.factory.basic;

/*
简单工厂类

 */
public class SimpleFactory {

    // 根据订购的type提供类型
    public Pizza CreatePizza(String type){
        System.out.println("使用简单工厂模式");

        Pizza pizza = null;
        if(type.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        }else if(type.equals("chinese")){
            pizza = new ChinesePizza();
            pizza.setName("中国披萨");
        }

        return pizza;
    }

}
