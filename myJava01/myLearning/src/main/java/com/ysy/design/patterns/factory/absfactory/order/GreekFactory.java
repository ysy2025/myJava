package com.ysy.design.patterns.factory.absfactory.order;

import com.ysy.design.patterns.factory.absfactory.pizza.GreekCheesePizza;
import com.ysy.design.patterns.factory.absfactory.pizza.GreekPepperPizza;
import com.ysy.design.patterns.factory.absfactory.pizza.Pizza;

public class GreekFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("使用的是抽象工厂模式");
        Pizza pizza = null;

        if(orderType == "cheese"){
            pizza = new GreekCheesePizza();
        }else {
            pizza = new GreekPepperPizza();
        }

        return pizza;
    }
}
