package com.ysy.basic.day05;

import java.util.Arrays;

/*
多维度数组
数组是引用类型数据类型
引用的是数组->多维数组

声明和初始化
调用指定位置元素
获取长度
遍历数组
默认初始化值
内存解析
 */
public class MultiArray01 {
    public static void main(String[] args) {
        //二维数组静态初始化
        int[][] array1 = new int[][]{{1,2,3},{4,5},{6,7,8}};
//        System.out.println(array1.length);

        //动态初始化
        String[][] array2 = new String[2][];
        String[] array201 = new String[3];
        String[] array202 = new String[3];

        array2[0] = array201;
        array2[0] = array202;

        //动态初始化
        //String [][] array3 = new String[][]; 无法编译
        String[][] array3 = new String[3][];
//        String[4][3] = new String[][]; 无法编译

        // 也可以
        int array4[][] = new int[4][];
        int array5[][] = {{},{}};

        //类型推断
        int[] array6 = {1,2,3,4};
        //类型推断不能换行;

        //调用指定位置元素
        System.out.println(array1[0][1]);

        System.out.println(array2[0][1]);
// nullpointerexception
//        System.out.println(array3[2][1]);

        //获取数组长度和遍历
        System.out.println(array1.length);
        for (int i = 0; i < array1.length; i++){
            System.out.println(Arrays.toString(array1[i]));
            for (int j = 0; j < array1[i].length; j++){
                System.out.println(array1[i][j]);
            }
        }
/*
二维数组分为外层数组的元素,内层数组的元素
int[][] arr = new int[4][3];
外层元素,arr[0],arr[1]
内层元素,arr[0][1],arr[1][1];


默认初始化值
int[][] = new int[4][3];
外层元素初始化值为地址值
内层元素初始化值与一位维数组初始化情况保持一致

int[][] = new int[4][];
外层元素初始化值为null
内层元素初始化值无法调用因为内层元素还没有初始化


二维数组的内存解析

*/

        int[][] arr = new int[4][3];
        System.out.println(arr[0]);//返回的是个引用类型,是内存地址,栈的信息
        System.out.println(Arrays.toString(arr[0]));//这里返回的是[0,0,0]
        System.out.println(arr[0][0]);

        System.out.println(arr);//返回的是二维int栈信息

        float[][] arr2 = new float[4][3];
        System.out.println(arr2[0]);

        int[][] arr3 = new int[4][];
        System.out.println(arr3[0]);//返回null,因为还没有初始化
        System.out.println(arr3[0][0]);//报错,NullPointerException,因为没有指针;还没有初始化呢
    }
}
