package com.ysy.day06;

public class ArrayException01 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        // ArrayIndexOutOfBoundsException, 越界
        //System.out.println(arr[4]);

        // NullPointerException 空指针异常
        int[] arr2 = new int[]{1,2,3,4};
        arr2 = null;
        System.out.println(arr2[0]);

        // 二维数组 NullPointerException
        int[][] arr3 = new int[4][];
        System.out.println(arr3[2][0]);
    }
}
