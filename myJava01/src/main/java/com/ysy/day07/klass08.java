package com.ysy.day07;

import java.util.Arrays;

public class klass08 {


    public static void main(String[] args) {
        int[] a = generageArray(10, 0, 100);
        System.out.println(Arrays.toString(a));

        BubbleSort(a);

        System.out.println(Arrays.toString(a));
    }

    public static int[] generageArray(int number, int min, int max) {
        int[] result = new int[number];
        for (int i = 0; i < number; i++) {
            int ran2 = (int) (Math.random() * (max - min) + min);
            result[i] = ran2;
        }
        return result;
    }

    public static void BubbleSort(int[] arr) {
        /*
        冒泡排序,从0开始到n-1,先后排序;调换顺序
         */

        int len = arr.length;

        for (int i = 0; i < len - 1; i++) {
            //从0开始到len-2,外围比较len-2次
            for (int j = 0; j <len - i - 1; j++) {
                //比较相邻大小,大的在前,小的在后
                System.out.println("0000 i is " + i + " j is " + j);
                System.out.println("0000 arr[j] is " + arr[j] + " arr[j+1] is " + arr[j+1]);
                int temp = arr[j];
                if (arr[j] > arr[j+1]) {
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                System.out.println(Arrays.toString(arr));
                System.out.println("                  ");
            }

        }
    }

}