package com.ysy.day07;

import java.util.Arrays;

public class Apartment {
    //学号
    int number;
    //班级
    int state;
    //成绩
    int score;

    public void hire(String name){
        if (name.toLowerCase().startsWith("z")) {
            System.out.println("Hire!");
        }
    }

    public static void hr(){
        System.out.println("Logo!!!!!");
    }

    public void BubbleSort(int[] arr) {
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
