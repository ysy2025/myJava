package com.design.patterns.decorator.deco;

import com.design.patterns.decorator.drink.Drink;

public class Decorator extends Drink {

    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        return super.getPrice() + drink.cost();
    }

    @Override
    public String getDes(){
        return super.des + " " + super.getPrice() + " && " + drink.getDes();
    }
}
