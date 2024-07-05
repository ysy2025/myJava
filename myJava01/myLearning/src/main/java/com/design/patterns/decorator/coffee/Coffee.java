package com.design.patterns.decorator.coffee;

import com.design.patterns.decorator.drink.Drink;

public class Coffee extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
