package com.basic.day05;

import java.util.Arrays;
import java.util.Scanner;

/*
数组内存解析
 */
public class Array03 {
    public static void main(String[] args) {
        System.out.println("zhangsan");
        //scanner
        Scanner sc = new Scanner(System.in);

        //确定学生数目
        System.out.println("请输入学生的数目!");
        int cnt = sc.nextInt();

        System.out.println("请输入" + cnt + "个学生的成绩!");
        //创建数组
        int[] scores = new int[cnt];

        for(int i = 0; i < cnt; i++){
            scores[i] = sc.nextInt();
            System.out.println("第" + i +"个学生成绩是:" +scores[i]);
        }

        System.out.println("学生成绩是:" + Arrays.toString(scores));
        //获取最大值
        int max = getMaxValue(scores);
        System.out.println("学生成绩最高分是:" + max);

        //获取每个等级
        printScore(scores, max);

    }

    private static void printScore(int[] scores, int max) {
        for(int score:scores){
            System.out.println("成绩是:" + score);
            int dif = max - score;
            if(dif < 10) {System.out.println("A");}
            else if (dif < 20){
                System.out.println("B");
            }else{
                System.out.println("shit!");
            }
        }
    }

    private static int getMaxValue(int[] a) {
        int max = 0;
        for(int ai:a){
            if (ai > max){
                max = ai;
            }
        }
        return max;
    }
}
