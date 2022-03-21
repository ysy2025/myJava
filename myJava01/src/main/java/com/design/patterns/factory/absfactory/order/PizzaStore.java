package com.design.patterns.factory.absfactory.order;

import java.util.Calendar;

public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new ChineseFactory());

        Calendar.getInstance();
    }
}
