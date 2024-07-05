package com.ysy.basic.day04;

import java.util.Scanner;

/*
循环结构
for
while
do-while

初始化条件
循环条件-->boolean类型
循环体
迭代条件

for循环
for(初始化条件;循环条件;迭代部分){
    循环体
}
初始化条件->循环条件->循环体->迭代条件->循环体->迭代条件->...迭代条件破裂
 */
public class Cycle02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 这种是不行的,初始化了之后,for的()里面的初始化条件就应该忽略
//        int i = sc.nextInt();
//        for(int i = 1; i>0; i--){
//            System.out.println(i);
//        }
//
//        int i = sc.nextInt();
//        while(i > 0){
//            System.out.println(i);
//            i--;
//        }

        //for的第一个初始化条件可以忽略
        int a = 10;
        for(;a>0;a--){
            System.out.println(a);
        }
    }
}
