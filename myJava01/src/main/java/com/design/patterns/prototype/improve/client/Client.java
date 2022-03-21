package com.design.patterns.prototype.improve.client;

import com.design.patterns.prototype.improve.sheep.Sheep;

public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("Tom", 10, "white");

        Sheep sheep2 = (Sheep) sheep.clone();

        Sheep sheep3 = (Sheep) sheep.clone();

        System.out.println(sheep);
        System.out.println();

        System.out.println(sheep2);
    }
}
