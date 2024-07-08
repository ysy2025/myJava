package com.ysy.annotation.reflection;

import java.lang.annotation.ElementType;

public class Demo03 {
    public static void main(String[] args) {
        Class<Object> c1 = Object.class;

        Class<Comparable> c2 = Comparable.class;

        Class<String[]> c3 = String[].class;

        Class<int[][]> c4 = int[][].class;

        Class<Override> c5 = Override.class;

        Class<ElementType> c6 = ElementType.class;

        Class<Integer> c7 = Integer.class;

        Class<Void> c8 = void.class;

        Class<Class> c9 = Class.class;

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);
        System.out.println(c8);
        System.out.println(c9);
    }
}
