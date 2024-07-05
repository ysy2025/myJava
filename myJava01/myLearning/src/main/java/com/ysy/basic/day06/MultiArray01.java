package com.ysy.basic.day06;

import java.util.Arrays;

/*
赋值

int[][] a = new int[2][];//这种情况下,不能用a[0][0] = 1来赋值,因为此时只初始化了一级数组,还没有初始化二级数组;
//需要手动初始化二级数组.
System.out.println(Arrays.toString(a[0]));

最大值最小值平均值总和
赋值反转查找
排序

 */
public class MultiArray01 {
    public static void main(String[] args) {
        //杨辉三角
        //int[][] a1 = yangTriAngle(1);
//        int[][] a1 = yangTriAngle(2);
        int[][] a1 = yangTriAngle(10);
//        for(int[]a : a1){
//            System.out.println(Arrays.toString(a));
//        }



    }

    private static int[][] yangTriAngle(int len) {
        int[][] arr = new int[len][];
        if (len == 1){
            System.out.println(1111);
            int[] temp = new int[len];
            temp[0] = 1;
            arr[0] = temp;
        }else if (len == 2){
            System.out.println(2222);
            arr[0] = yangTriAngle(1)[0];
            int[] temp = new int[len];
            temp[0] = 1;
            temp[1] = 1;
            arr[1] = temp;
        }else {
            //构建n-1的杨辉三角然后每行赋值给n的杨辉三角
            int [][] yangLenMinus1 = yangTriAngle(len - 1);
            for (int i = 0; i < len - 1; i++) {
                arr[i] = yangLenMinus1[i];
                System.out.println(3333);
                System.out.println("zhangsan第" + (i+1) + "层的数据是" + Arrays.toString(arr[i]));
            }
//
            arr[len-1] = new int[len];
            arr[len-1][0] = arr[len-2][0];
            arr[len-1][len-1] = arr[len-2][len-2];
            for (int i = 1;i < len-1; i++){
                arr[len-1][i] = arr[len-2][i-1] + arr[len-2][i];
            }
            System.out.println(4444);
            System.out.println("第" + (len) + "层的数据是" + Arrays.toString(arr[len - 1]));
        }
        return arr;
    }
}