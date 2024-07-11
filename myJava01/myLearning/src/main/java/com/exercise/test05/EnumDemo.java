package com.exercise.test05;

public class EnumDemo {

    public static void main(String[] args) {
        Name lisi = Name.LISI;

        System.out.println(lisi.toString());

        int a = Constants.A;

        School top = School.TOP;

        System.out.println(top.isLaJi());
    }
}

