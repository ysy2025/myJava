package com.ysy.design.patterns.factory.absfactory.order;

import com.ysy.design.patterns.factory.absfactory.pizza.ChineseCheesePizza;
import com.ysy.design.patterns.factory.absfactory.pizza.ChinesePepperPizza;
import com.ysy.design.patterns.factory.absfactory.pizza.Pizza;

public class ChineseFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("使用的是抽象工厂模式");
        Pizza pizza = null;

        if(orderType == "cheese"){
            pizza = new ChineseCheesePizza();
        }else {
            pizza = new ChinesePepperPizza();
        }
        return pizza;
    }
}
