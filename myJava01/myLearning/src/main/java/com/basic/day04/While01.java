package com.basic.day04;

import java.util.Scanner;

/*
while 循环

初始化条件
while(循环条件){
循环体
迭代条件
}

while循环注意迭代条件
避免死循环

for循环和while循环的初始化条件作用域不同.
 */
public class While01 {
    public static void main(String[] args) {
        System.out.println("zhangsan");

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        while(a>0){
            System.out.println(a);
            a--;
        }
    }

}
