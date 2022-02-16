package com.ysy.day08;

import java.util.Arrays;

public class klass01 {
    public static void main(String[] args) {
        MyUtil util = new MyUtil();

        int length = 5;
        int[] array = new int[length];
        InitialArray(array, length);
        System.out.println(Arrays.toString(array));

        int max = util.getMax(array);
        System.out.println(max);


        util.reverse(array);
        System.out.println(Arrays.toString(array));
    }

    public static void InitialArray(int[] array, int n){
        for (int i = 0; i < array.length; i++) {
            System.out.println(i);
            array[i] = (int) (Math.random() * 100);
        }

    }
}
