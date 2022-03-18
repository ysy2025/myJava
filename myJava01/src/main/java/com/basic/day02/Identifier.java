package com.basic.day02;

public class Identifier {

    public static void main(String[] args) {
        Name myName = new Name();
        System.out.println(myName.name);
    }

}

class Name{
    String name = "zhangsan";
}