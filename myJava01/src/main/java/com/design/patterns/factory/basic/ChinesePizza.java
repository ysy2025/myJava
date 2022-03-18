package com.design.patterns.factory.basic;

public class ChinesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("prepare pizza " + name);
    }
}
