package com.exercise.test02;

public class ClazzDemo {
}


class Bird{
    String name;

    double weight;

    static{
        System.out.println("I am a bird! -->");
    }

    public Bird(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }


    public void breath() {};

    public void fly(){
        System.out.println("I can fly");
    }

    public void eat(String food){
        String output = String.format("I like eat %s", food);
        System.out.println(output);

    }
}

class Wuya extends Bird{
    String color;

    public Wuya(String name, double weight, String color) {
        super(name, weight);
        this.color = color;
    }

    public void paint(String city){
        String output = String.format("wuya in %s was painted into %s", city, color);

        System.out.println(output);
    }
}