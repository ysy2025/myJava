package com.design.patterns.factory.factorymethod.pizza;

import com.design.patterns.factory.factorymethod.pizza.Pizza;

public class ChinesePepperPizza extends Pizza {

    @Override
    public void prepare() {
        setName("Chinese pepper");
        System.out.println("prepare pizza " + name);
    }
}
