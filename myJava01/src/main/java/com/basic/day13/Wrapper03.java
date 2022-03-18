package com.basic.day13;

import org.junit.Test;

/*
*
*
 */
public class Wrapper03 {
    public static void main(String[] args) {

        /*
        三元运算符的结果,需要是否两个结果的类型保持一致;因此会强行统一类型
         */
        Object o1 = true ? new Integer(1) : new Double(2.0);
        System.out.println(o1);

        Object o2;
        if (true){
            o2 = new Integer(1);
        }else{
            o2 = new Double(2.0);
        }

        System.out.println(o2);
    }

    @Test
    public void method1(){
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);

        Integer m = 1;
        Integer n = 1;
        System.out.println(m == n);

        // IntegerCache
        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y);
        System.out.println(x);
        System.out.println(y);
    }
}
