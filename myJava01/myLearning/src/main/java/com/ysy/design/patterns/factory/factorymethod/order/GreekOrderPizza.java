package com.ysy.design.patterns.factory.factorymethod.order;

import com.ysy.design.patterns.factory.factorymethod.pizza.GreekCheesePizza;
import com.ysy.design.patterns.factory.factorymethod.pizza.GreekPepperPizza;
import com.ysy.design.patterns.factory.factorymethod.pizza.Pizza;

public class GreekOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;

        if (orderType.equals("cheese")){
            pizza = new GreekCheesePizza();
        }else if (orderType.equals("pepper")){
            pizza = new GreekPepperPizza();
        }
        return pizza;
    }
}
