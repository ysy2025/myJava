package com.ysy.design.patterns.factory.factorymethod.pizza;

public class ChineseCheesePizza extends Pizza {

    @Override
    public void prepare() {
        setName("Chinese cheese");
        System.out.println("prepare pizza " + name);
    }
}
