package com.ysy.day04;

import java.util.Scanner;

/*
程序流程控制

顺序

分支
if-else 条件判断
if
if-else
if-else if-else
switch-case
循环
 */
public class Cycle01 {
    public static void main(String[] args) {
        String a = "zhangsan";
        if (a == "lisi"){
            System.out.println("lisi niubi");
        }else if(a == "wangwu"){
            System.out.println("wangwu niubi");
        }else{
            System.out.println("zhangsan niubi!");
            System.out.println("hello world!");
        }

        /*
        使用Scanner从键盘输入,获取不同变量
         */
         Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int full = sc.nextInt();
        System.out.println(i + "" + full);
        if (i >= 0.9 * full){
            System.out.println("Brilliant");
        }else if(i >= 0.8 * full){
            System.out.println("Pretty");
        }else {
            System.out.println("Bad!");
        }
    }
}
