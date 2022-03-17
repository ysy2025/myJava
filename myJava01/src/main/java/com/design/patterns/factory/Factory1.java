package com.design.patterns.factory;

/*
实际需求

pizza工厂
1,便于种类扩展,便于维护
2,pizza种类很多,例如greek,chinese类型的pizza
3,制作过程:prepare,bake,cut,box
4,pizza店的订购模式

现在自己的思路
 */
public class Factory1 {
}

abstract class Pizza {
    public abstract void prepare();

    public abstract void bake();
    public abstract void cut();
    public abstract void box();
}

class ChinesePizza extends Pizza {

    @Override
    public void prepare() {

    }

    @Override
    public void bake() {

    }

    @Override
    public void cut() {

    }

    @Override
    public void box() {

    }
}

class GreekPizza extends Pizza{

    @Override
    public void prepare() {

    }

    @Override
    public void bake() {

    }

    @Override
    public void cut() {

    }

    @Override
    public void box() {

    }
}

class Factory{

    public void order(Pizza pizza){

    }
}