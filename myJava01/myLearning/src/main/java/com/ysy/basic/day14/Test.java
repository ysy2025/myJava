package com.ysy.basic.day14;

public class Test {

    public static void main(String[] args) {
        String[] arr = {"80344", "83582", "13028"};

        String body = new String("zhangsan \"pcode\":\"80344\" ");

        for (String pcode : arr) {
            System.out.println(pcode);
            String condition = String.format("\"pcode\":\"%s\"",pcode);
            System.out.println(condition);
            if (body.contains(condition)) {
//                System.out.println(body);
//                System.out.println("<============================>");
                System.out.println(condition);
            }
        }
    }
}