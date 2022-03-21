package com.design.patterns.prototype.basic.client;

import com.design.patterns.prototype.basic.sheep.Sheep;

public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 1, "white");

        Sheep sheep2 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep3 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep4 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep5 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());

        System.out.println(sheep);
    }
}
