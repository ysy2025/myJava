package com.ysy.day06;

import java.util.Arrays;

/*
最大值最小值平均值总和
 */
public class MultiArray02 {
    public static void main(String[] args) {
        //初始化数组
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random() * 90 + 10) ;
//            System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr));

        //取平均数
        double ave = getAve(arr);
        System.out.println("average is: " + ave);
        // 取max
        int max = getMax(arr);
        System.out.println("max is: " + max);

        // 取最小值
        int min = getMin(arr);
        System.out.println("min is: " + min);

    }

    private static int getMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for(int i:arr){
            if (i < min){
                min = i;
            }
        }
        return min;
    }

    private static int getMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i : arr){
            if (i > max){
                max = i;
            }
        }
        return max;
    }

    private static double getAve(int[] arr) {
        double sum = 0.0;
        for (int i : arr){
            sum += i;
        }
        return sum/(arr.length);
    }
}
