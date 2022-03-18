package com.design.patterns.factory.factorymethod.pizza;

import com.design.patterns.factory.basic.Pizza;

public class GreekPepperPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("prepare pizza " + name);
    }
}
