package com.ysy.design.patterns.decorator.coffee;

import com.ysy.design.patterns.decorator.drink.Drink;

public class Coffee extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
