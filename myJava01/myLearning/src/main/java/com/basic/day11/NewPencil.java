package com.basic.day11;

public class NewPencil {
    String name;
    int height;
    int weight;

    int id;
    public NewPencil(){

    }

    public NewPencil(String name, int height, int weight, int id){
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.id = id;
    }

    public void draw(){
        System.out.println("I am drawing!");
    }

    public void study(){
        System.out.println("I am studying!");
    }
}
