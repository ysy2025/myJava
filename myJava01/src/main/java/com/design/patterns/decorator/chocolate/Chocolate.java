package com.design.patterns.decorator.chocolate;

import com.design.patterns.decorator.deco.Decorator;
import com.design.patterns.decorator.drink.Drink;

// 具体的decorator,调味品
public class Chocolate extends Decorator {

    public Chocolate(Drink drink) {
        super(drink);
        setDes("巧克力");
        setPrice(10.0f);
    }

}
