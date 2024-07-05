package com.ysy.design.patterns.factory.absfactory.pizza;

public class ChinesePepperPizza extends Pizza {

    @Override
    public void prepare() {
        setName("Chinese pepper");
        System.out.println("prepare pizza " + name);
    }
}
