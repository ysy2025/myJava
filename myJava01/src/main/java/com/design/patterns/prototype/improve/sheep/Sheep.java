package com.design.patterns.prototype.improve.sheep;

public class Sheep implements Cloneable{
    private String name;
    private int age;
    private String color;

    public Sheep(String name, int age, String color) {
        super();
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    // 克隆该实例,我使用默认的clone方法来实现
    @Override
    public Object clone(){

        Sheep sheep = null;
        try {
            sheep = (Sheep) super.clone();
            return sheep;
        } catch (Exception e){
            e.printStackTrace();
        }

        return sheep;
    }

}
