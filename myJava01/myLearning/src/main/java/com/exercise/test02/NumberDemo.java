package com.exercise.test02;

import java.text.DecimalFormat;

public class NumberDemo {

    public static void main(String[] args) {
        SimpleFormat("##.####", 12.23);
        SimpleFormat("##.##kg", 12.2345345);
        SimpleFormat("00.00000", 12.233);

        ApplyPattern("#.##%", 0.871231239);
        // 千分位
        ApplyPattern("0.00\u2030", 1.123123123123);
    }

    public static void SimpleFormat(String pat, double val){
        // instance decimal format
        DecimalFormat format = new DecimalFormat(pat);
        String output = format.format(val);
        System.out.println(output);
    }

    public static void ApplyPattern(String pat, double value){
        DecimalFormat format = new DecimalFormat();
        format.applyPattern(pat);
        String output = format.format(value);
        System.out.println(output);
    }
}
