package com.ysy.design.patterns.flyweight;

public class Test {
    public static void main(String[] args) {
//        String a = "hello";
//        String b = "hello";

        String a = "Hi~亲爱的小广，早上来了还没打卡吧，沉浸工作也不要忘记打卡喔";
        String b = "Hi~亲爱的小广，早上来了还没打卡吧，沉浸工作也不要忘记打卡喔";

        System.out.println(a == b);
        System.out.println(a.hashCode() + " == " + b.hashCode());
    }
}
