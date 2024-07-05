package com.design.patterns.factory.basic;

public class SimpleFactory2 {
    // 根据订购的type提供类型
    public static Pizza CreatePizza2(String type){
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
