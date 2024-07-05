package com.design.patterns.decorator.chocolate;

import com.design.patterns.decorator.deco.Decorator;
import com.design.patterns.decorator.drink.Drink;

// 具体的decorator,调味品
public class Milk extends Decorator {

    public Milk(Drink drink) {
        super(drink);
        setDes("牛奶");
        setPrice(5.0f);
    }

}
