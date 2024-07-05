package com.ysy.design.patterns.decorator.client;

import com.ysy.design.patterns.decorator.chocolate.Chocolate;
import com.ysy.design.patterns.decorator.chocolate.Milk;
import com.ysy.design.patterns.decorator.coffee.BlackCoffee;
import com.ysy.design.patterns.decorator.drink.Drink;

public class Client {
    public static void main(String[] args) {

        // 1 点一份blackcoffee
        Drink blackCoffee = new BlackCoffee();
        System.out.println(blackCoffee.cost());
        System.out.println(blackCoffee.getDes());

        // 加菜
        blackCoffee = new Milk(blackCoffee);
        System.out.println(blackCoffee.cost());
        System.out.println(blackCoffee.getDes());

        // 加巧克力
        blackCoffee = new Chocolate(blackCoffee);
        System.out.println(blackCoffee.cost());
        System.out.println(blackCoffee.getDes());

    }
}
