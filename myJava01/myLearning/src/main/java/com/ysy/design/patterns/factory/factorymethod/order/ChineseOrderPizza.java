package com.ysy.design.patterns.factory.factorymethod.order;

import com.ysy.design.patterns.factory.factorymethod.pizza.ChineseCheesePizza;
import com.ysy.design.patterns.factory.factorymethod.pizza.ChinesePepperPizza;
import com.ysy.design.patterns.factory.factorymethod.pizza.Pizza;

public class ChineseOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;

        if (orderType.equals("cheese")){
            pizza = new ChineseCheesePizza();
        }else if (orderType.equals("pepper")){
            pizza = new ChinesePepperPizza();
        }
        return pizza;
    }
}
