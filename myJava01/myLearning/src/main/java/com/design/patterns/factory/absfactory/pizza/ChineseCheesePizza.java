package com.design.patterns.factory.absfactory.pizza;

public class ChineseCheesePizza extends Pizza {

    @Override
    public void prepare() {
        setName("Chinese cheese");
        System.out.println("prepare pizza " + name);
    }
}
