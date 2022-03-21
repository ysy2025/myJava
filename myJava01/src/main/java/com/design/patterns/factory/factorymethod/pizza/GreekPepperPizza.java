package com.design.patterns.factory.factorymethod.pizza;

import com.design.patterns.factory.factorymethod.pizza.Pizza;

public class GreekPepperPizza extends Pizza{
    @Override
    public void prepare() {
        setName("greek pepper");
        System.out.println("prepare pizza " + name);
    }
}
