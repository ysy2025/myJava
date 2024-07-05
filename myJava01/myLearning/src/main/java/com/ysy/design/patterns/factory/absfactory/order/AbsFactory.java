package com.ysy.design.patterns.factory.absfactory.order;

import com.ysy.design.patterns.factory.absfactory.pizza.Pizza;

// 一个抽象工厂模式的接口,抽象层
public interface AbsFactory {

    // 至少需要一个createPizza方法,让下面的工厂子类来具体实现
    public Pizza createPizza(String orderType);
}
