package com.design.patterns.factory.absfactory.pizza;

public class GreekPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("greek pepper");
        System.out.println("prepare pizza " + name);
    }
}
