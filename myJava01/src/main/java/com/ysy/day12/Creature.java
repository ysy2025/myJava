package com.ysy.day12;

public class Creature {
    int age;
    int height;

    int weight;

    // 这里如果没有构造器,则可以不需要空参数的构造器;如果有了构造器,就一定要有空参数构造器.
//    public Creature(){
//        System.out.println("珍爱地球,保护野生动物");
//    }

//    public Creature(int age) {
//        this.age = age;
//    }

    public void eat(String food){
        System.out.println("I need to eat " + food);
    }

    public void play(String thing){
        System.out.println("I need to play " + thing);
    }
}
