package com.basic.day06;

import java.util.Arrays;

/*
冒泡排序
 */
public class Sort03 {
    public static void main(String[] args) {
        int [] arr = new int[]{34,12,23,435,56,123,1,231};
        System.out.println(Arrays.toString(arr));
        int [] res = BubbleSort(arr);
        System.out.println(Arrays.toString(res));

    }

    private static int[] BubbleSort(int[] arr) {
        //依次比较相邻数据大小;从第一个数开始
        int len = arr.length;
        for (int i = 0; i < len; i++){
            //取第一个数后,从下一个数据开始比较
            for(int j = i + 1; j < len; j++){
                System.out.println("111 "+ " i is " + i + " j is " + j + " arr[i] is " + arr[i] + " arr[j] is " + arr[j]);
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    System.out.println("000 array is "+ Arrays.toString(arr));
                    System.out.println("     ");
                }
            }
        }
        return arr;
    }
}
