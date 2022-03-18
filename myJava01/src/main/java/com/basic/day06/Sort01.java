package com.basic.day06;

import java.util.Arrays;

/*
十大排序算法
选择:
直接选择
堆排序

交换:
冒泡
快排

插入:
直接插入
折半插入
shell

归并:
桶:
基数:
 */
public class Sort01 {


    public static void main(String[] args) {
        System.out.println("zhangsan");

//        int[] arr1 = new int[]{98,12,23,123,45,34};
        int[] arr1 = new int[]{98, 23};
        int a = 1;
        int b = 2;
//        swap(arr1, a, b);
        directInsertSort(arr1);

        System.out.println(Arrays.toString(arr1));
    }

    private static void swapElem(int[] arr1, int a, int b) {
        int temp = arr1[a];
        arr1[a] = arr1[b];
        arr1[b] = temp;
    }

    public static void directInsertSort(int[] elem) {
        int i, j, k;
        int len = elem.length;
        /*
        设数组为a[0…n-1]

        1. 初始时,a[0]自成1个有序区,无序区为a[1..n-1],令i=1
        2. 将a[i]并入当前的有序区a[0…i-1]中形成a[0…i]的有序区间.
        3. i++并重复第二步直到i==n-1,排序完成.
         */
        for (i = 1; i < len; i++) {
            System.out.println("000 i is: " + i);
            for (j = i-1; j>=0; j--){
                System.out.println("111 j is: " + j);
                System.out.println("222 elem[j] is " + elem[j] + " elem[i] is " + elem[i]);
                if (elem[j] < elem[i]) {
                    System.out.println("                          ");
//                    break; //j比i小,数组对应的元素也小,那么说明是顺序排布,不用管
                }
                else{//说明i之前并非顺序排序
                    //针对从0到i-1的数据进行遍历,找到适合i排布的地方;这里我们确定从0到i-1是顺序排布的
                    int index = findIndex(elem, i);
                    System.out.println(Arrays.toString(elem) + " 333 index is: " + index);
                    /*比如 arr = {17, 3, 25, 14, 20, 9}
                    首先i=1,j=0;arr[j]<arr[i]
                    findIndex(arr, 1),找到适合arr[1]放的位置
                    得到0;则arr[0] = arr[1]
                     */
                    int temp = elem[index];
                    System.out.println("temp is: " + temp);
                    for(k = index; k < i; k ++){
                        System.out.println("k is: " + k +  " and 444 elem[k] is: " + elem[k]);
                        elem[k] = elem[k + 1];
                    }
                    elem[k] = temp;
                    System.out.println(Arrays.toString(elem) + " 555");

                    System.out.println("                          ");



                }
            }
        }
    }

    private static int findIndex(int[] elem, int i) {
        int rValue = - 1;
        for(int order = 0; order < i; order ++){
            if (elem[order] >= elem[i]){
                rValue = order;
                //找到一个大于的就break
                break;
            }
        }
        return rValue;
    }
}
