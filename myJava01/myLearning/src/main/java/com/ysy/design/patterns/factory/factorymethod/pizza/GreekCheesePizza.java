package com.ysy.design.patterns.factory.factorymethod.pizza;

public class GreekCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("greek pepper");
        System.out.println("prepare pizza " + name);
    }
}
