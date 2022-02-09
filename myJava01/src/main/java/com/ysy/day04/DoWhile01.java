package com.ysy.day04;

import java.util.Scanner;

/*
do-while 循环

初始化条件
do
{
循环体
迭代条件
}while(循环条件)

do-while至少执行一次循环体!
 */
public class DoWhile01 {
    public static void main(String[] args) {
        System.out.println("zhangsan");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int res = 0;
        do{
            res += a;
            a--;
        }while(a>0);
        System.out.println(res);
    }
}
