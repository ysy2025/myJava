package com.design.patterns.factory.factorymethod.order;

import com.design.patterns.factory.factorymethod.pizza.Pizza;
import com.design.patterns.factory.factorymethod.pizza.GreekCheesePizza;
import com.design.patterns.factory.factorymethod.pizza.GreekPepperPizza;

public class GreekOrderPizza extends OrderPizza{
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
