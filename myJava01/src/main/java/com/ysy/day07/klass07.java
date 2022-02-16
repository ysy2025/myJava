package com.ysy.day07;

import java.util.Arrays;

public class klass07 {

    public static void main(String[] args) {
        int len = 20;

        // 初始化学生类
        // 这里的ss不是Student类,而是数组,引用的学生类
//        Student[] ss = new Student[len];
//
//        // 初始化
//        Student.InitialStudents(ss, len);
//
//        Student.GetStates(ss, 2);
//
//        //获取成绩
//        int[] grades = Student.GetGrades(ss);
//        System.out.println(Arrays.toString(grades));
//
//        // 排序
//        Student.BubbleSort(grades);
//        System.out.println(Arrays.toString(grades));
//
//
//        //talk
//        Student.talk("zhangsan");
//
//        Student sa = new Student();
//        sa.InitialStudent();

        //apartment
        Apartment cc1 = new Apartment();
        cc1.hire("zhangsan");

        Apartment.hr();

        cc1.hr();

    }


}