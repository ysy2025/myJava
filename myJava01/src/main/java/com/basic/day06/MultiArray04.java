package com.basic.day06;

import java.util.Arrays;

/*

 */
public class MultiArray04 {
    public static void main(String[] args) {

        int [] arr1, arr2;
        arr1 = new int[]{1,2,3,4,5};

        for (int ele:arr1){
            System.out.println(ele);
        }

        //不是数组的复制,指向的是一个堆空间中的同一个数组
//        arr2 = arr1;
//
//        arr2[0] = 111;
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));
//
//        //克隆,是真复制
//        arr2 = arr1.clone();
//        arr2[0] = 1111111;
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));

        //真复制,其实是clone
        arr2 = new int[arr1.length];

        for(int i = 0; i < arr1.length; i++){
            arr2[i] = arr1[i];
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        arr2[0] = 111;
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

}
