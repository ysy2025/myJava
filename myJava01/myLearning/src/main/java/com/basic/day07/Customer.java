package com.basic.day07;

public class Customer {
    String name = "zhangsan";
    int age = 35;
    int sex = 0;

    public void study(){
        System.out.println("I am studying");
    }

    public void showAge(){
        System.out.println(age);
    }
    public int addAge(int i){
        age += i;
        return age;
    }
}
