package com.design.patterns.factory.basic;

public class GreekPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("prepare pizza " + name);
    }
}
