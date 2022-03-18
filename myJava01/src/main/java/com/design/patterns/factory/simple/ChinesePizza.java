package com.design.patterns.factory.simple;

public class ChinesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("prepare pizza " + name);
    }
}
