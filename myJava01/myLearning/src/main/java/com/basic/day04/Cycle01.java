package com.basic.day04;

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
switch (表达式1){
case 常量1:
    执行语句1;
case 常量2:
    执行语句2;
case 常量3:
    执行语句3;
...
default:
    执行语句n;
    break;
    }
switch找到匹配的case,调用语句
调用完语句后,仍然继续执行后续语句,直到遇到关键字break或者结构末尾才结束

想实现多选一,在case执行语句中加break

switch结构中的表达式只能是以下6种数据类型:byte short char int 枚举 string
case之后只能声明常量
break关键字不加也没问题
default,相当于if-else中的else,备胎;可选的,位置灵活.

分支结构可以用switch-case且ifelse,且取值不多,优先switch-case
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

        int aa = 100;
        switch(aa){
            case 10:
                System.out.println("aa niubi!");
            case 100:
                System.out.println("aa !!!!!");
            default:
                System.out.println("~~~~~~");
            break;
        }
    }
}
