package com.ysy.day15;

public class CompareB{
    public static void main(String[] args) {
        SubClass subClass = new SubClass();

        subClass.method2();

        CompareA.method1();
    }
}

class SubClass implements CompareA{

}