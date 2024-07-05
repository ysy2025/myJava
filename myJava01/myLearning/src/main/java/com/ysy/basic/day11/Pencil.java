package com.ysy.basic.day11;

public class Pencil{
    String name;
    int height;
    private int weight;


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Pencil(){

    }

    public Pencil(String name, int height, int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
    public void draw(){
        System.out.println("I am drawing!");
        // 这个talk是调用pencil自己的,因为是private的,所以即使子类调用这个draw方法,也会调用pencil自己的talk方法
        talk();
    }

    public void walk() {
        System.out.println("I am walking on the road!");
    }

    private void talk(){
        System.out.println("caonima");
    }

    public void eat(){
        System.out.println("I like eat food!");
    }
}