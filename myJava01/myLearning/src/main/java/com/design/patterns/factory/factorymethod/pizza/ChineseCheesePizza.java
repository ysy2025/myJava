package com.design.patterns.factory.factorymethod.pizza;

import com.design.patterns.factory.factorymethod.pizza.Pizza;

public class ChineseCheesePizza extends Pizza {

    @Override
    public void prepare() {
        setName("Chinese cheese");
        System.out.println("prepare pizza " + name);
    }
}
