package com.basic.day02;

public class Person {
    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(human.sex);
        System.out.println(human.age);
        System.out.println(human.name);
        human.setAge(20);
        human.setName("lisi");
        human.setSex("F");
        System.out.println(human.sex);
        System.out.println(human.age);
        System.out.println(human.name);

        Man myMan = new Man();
        System.out.println(myMan.name);

        int number = 10;
        System.out.println(myMan.name + number);
    }


}

class Man{
    String name = "孙悟空";
}