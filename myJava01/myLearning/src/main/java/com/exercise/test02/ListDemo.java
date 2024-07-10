package com.exercise.test02;

import java.util.Arrays;

public class ListDemo {
    public static void main(String[] args) {
        // declare
//        int[] a;
//        String[] b;
//
//        // declare
//        int arr[];
//        String arr2[];
//
//
//        String[] strings = new String[3];
//
//        strings[0] = "zhan";
//        strings[1] = "zhan";
//        strings[2] = "zhan";
//
//        for (String string:strings){
//            System.out.println(string);
//
//        }
//
//        int[] ints = {1, 3, 4, 54, 5, 12, 31, 231, 2};
//        int arr3[] = {2,3,545,456,23,423,42,325};
//
//        for (int i:ints){
//            System.out.println(i);
//        }
//
//        for (int ii:arr3){
//            System.out.println(ii);
//        }
//
//        int[][] a = {{1,2,3}, {4,5,6}};
//
//        for (int i = 0; i < a.length; i++){
//            int[] temp = a[i];
//
//            for (int j = 0; j < temp.length; j++){
//                System.out.println(temp[j]);
//            }
//        }

//        int[] a = new int[5];
//
//        Arrays.fill(a, 8);
//
//        for (int ai:a){
//            System.out.println(ai);
//        }
//
        int[] ints = {1, 3, 4, 54, 5, 12, 31, 231, 2};

//        Arrays.sort(ints);
//        for(int i:ints){
//            System.out.println(i);
//        }


        int[] ints1 = Arrays.copyOf(ints, 5);
        for (int i:ints1){
            System.out.println(i);
        }

        int i = Arrays.binarySearch(ints, 11);
        System.out.println(i);
    }
}
