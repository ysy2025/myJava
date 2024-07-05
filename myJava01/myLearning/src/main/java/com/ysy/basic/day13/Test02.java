package com.ysy.basic.day13;

import java.util.Scanner;
import java.util.Vector;

/*
这里vector是Object对象的集合
遍历的时候,每一个都是Object;然后需要转化成Integer,然后转换成int
 */
public class Test02 {
    public static void main(String[] args) {

        // 实例化scanner
        Scanner scanner = new Scanner(System.in);

        // 创建Vector对象,相当于数组的作用
        Vector vector = new Vector();

        int max = Integer.MIN_VALUE;
        // for循环,给vector中添加数据
        for(;;){
            System.out.println("shuru chengji, shuru -shi jieshu: ");
            int score = scanner.nextInt();

            if (score < 0){
                break;
            }
            if(score > 100){
                System.out.println("Illegal !");
                continue;
            }
            Integer intScore = new Integer(score);
            vector.addElement(intScore);//5.0之后,直接丢score进去,会自动装箱

            if(score > max){
                max = score;
            }
        }
        // 当输入是负数时,退出循环

        // 获取成绩最大值

        //遍历,比较,得到等级
        for(int i = 0; i < vector.size(); i++){
            Object obj = vector.elementAt(i);

            Integer intScore = (Integer) obj;

            int score = intScore.intValue();

            if((max - score ) <= 10){
                System.out.println("A");
            }else{
                System.out.println("B");}

        }

    }
}
