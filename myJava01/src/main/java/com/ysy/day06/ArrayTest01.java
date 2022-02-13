package com.ysy.day06;

import java.util.Arrays;

/*
复制!=赋值
赋值是同一个堆;复制是不同堆.

反转
 */
public class ArrayTest01 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4,5,6};

        //反转
        int[] arr2 = reverse(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        //遍历
        roundRobin(arr1);


        //字符串的reverse
        String a = "zhangsan";
        
    }

    private static void roundRobin(int[] arr1) {
        for(int ele:arr1){
            System.out.println(ele);
        }
    }


    //反转方法1
//    private static int[] reverse(int[] arr1) {
//        int[] result = new int[arr1.length];
//        for (int i = 0; i < arr1.length; i++){
//            result[i] = arr1[arr1.length - 1 - i];
//        }
//        return result;
//    }

    private static int[] reverse(int[] arr1) {
        for(int i = 0, j = arr1.length-1; i < j; i++, j--){
            int temp = arr1[j];
            arr1[j] = arr1[i];
            arr1[i] = temp;
        }
        return arr1;
    }
}
