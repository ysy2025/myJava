package com.design.patterns.factory.factorymethod.pizza;

public abstract class Pizza {
    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    public abstract void prepare();

    public void bake() {
        System.out.println("bake pizza " + name);
    }

    public void cut() {
        System.out.println("cut pizza " + name);
    }

    public void box() {
        System.out.println("boxing  pizza " + name);
    }
}
