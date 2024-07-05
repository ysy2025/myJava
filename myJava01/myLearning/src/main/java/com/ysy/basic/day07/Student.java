package com.ysy.basic.day07;

import java.util.Arrays;

public class Student {
    //学号
    int number;
    //班级
    int state;
    //成绩
    int score;

    public static void main(String[] args) {
        System.out.println("zhangsan");
    }

    public void InitialStudent(){
            number = (int) (Math.random() * 100);
            score = (int) (Math.random() * 100);
            state = ((number / 6) < 1) ? 0 : (((number / 6) < 2) ? 1 : 2);
    }

    public static void InitialStudents(Student[] ss, int n){
        for (int i = 1; i < n; i++) {
            System.out.println(i);

            ss[i - 1] = new Student();
            ss[i - 1].number = i;
            ss[i - 1].score = (int) (Math.random() * 100);
            ss[i - 1].state = ((i / 6) < 1) ? 0 : (((i / 6) < 2) ? 1 : 2);

        }

    }
    public void GetState(){
        System.out.println(state);
    }

    public static void GetStates(Student[] ss, int condition){
        for (int i = 1; i < ss.length + 1; i++) {
            System.out.println("ss[i-1].state is " + ss[i - 1].state);
            if (ss[i - 1].state == condition) {
                System.out.println(ss[i - 1].number + " " + ss[i - 1].score + " " + ss[i - 1].state);
            }
        }
    }

    public static int[] GetGrades(Student[] ss){
        int len = ss.length;
        int[] result = new int[len];
        for(int i = 0; i < len; i++){
            result[i] = ss[i].score;
        }
        return result;
    }

    public static void talk(String a){
        System.out.println(a);
    }

    public static void BubbleSort(int[] arr) {
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
