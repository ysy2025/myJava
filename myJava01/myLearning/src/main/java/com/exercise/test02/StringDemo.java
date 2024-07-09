package com.exercise.test02;

import java.util.Arrays;
import java.util.Date;

public class StringDemo {

    public static void main(String[] args) {
//        char[] a = {'a', 'b'};
//
//        String b = new String(a);
//
//        System.out.println(b);
//
//        String c, d;
//        c = "zhangsan";
//        d = "lisi";
//
//        System.out.println(c);
//        System.out.println(d);
//
//        System.out.println(c + " " + d);
//
//        System.out.println(c.charAt(1));
//
//        System.out.println(c.getBytes().toString());
//
//
//        String str = "Java";
//        byte[] byteArray;
//
//        //将字符串转换为字节数组
//        //使用平台的默认字符集
//        byteArray = str.getBytes();
//        System.out.println(Arrays.toString(byteArray));
//
//        System.out.println(c.indexOf('a'));
//
//        System.out.println(c.lastIndexOf('n'));
//
//        System.out.println(c.indexOf('n'));
//

        String e = "Stack Overflow is the largest, most trusted online community for developers to learn, share their programming knowledge";

//        System.out.println(e.substring(2, 10));
//
//        System.out.println(e.startsWith("z"));
//
//        String a = "zhang";
//        String b = "Zhang";
//
//        System.out.println(a.compareTo(b));
//        System.out.println(a.equalsIgnoreCase(b));
//
//        String[] f = e.split(" ");
//        for (String feach : f){
//            System.out.println(feach);
//        }
//
//        String c = String.format("%te", new Date());
//
//        System.out.println(c);

        String regex = "[a-zA-Z]*+";
        System.out.println(e.matches(regex));

        // 字符串生成器
        long l = System.currentTimeMillis();

        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < 100; i++){
            stringBuilder.append(i);
        }
        System.out.println(stringBuilder);
    }
}
