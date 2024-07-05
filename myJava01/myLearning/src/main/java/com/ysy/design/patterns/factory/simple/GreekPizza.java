package com.ysy.design.patterns.factory.simple;

public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare pizza " + name);
    }
}
