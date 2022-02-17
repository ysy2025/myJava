package com.ysy.day08;

import java.util.Arrays;

/*
形参传递机制->值传递

1,形参:方法定义时,声明的小括号内的参数
2,实参:方法调用时,实际传递给形参的数据

值传递机制
if参数是基本数据类型,实参赋值给形参的是实参真实存储的数据值(实际数在栈)
如果参数是引用数据类型,实参赋值给形参的是实参存储的地址(实际数在堆)


 */
public class klass03 {
    public static void main(String[] args) {

        int[] arr = new int[2];
        int a = 10;
        int b = 210;

        arr[0] = a;
        arr[1] = b;

        System.out.println("a is " + a + " b is " + b);
        System.out.println(Arrays.toString(arr));
        swift(arr, 0, 1);
        System.out.println("===================");
        System.out.println("a is " + a + " b is " + b);
        System.out.println(Arrays.toString(arr));

        // 方法是static,只能在实例化的对象中调用,没有对象时无法调用.
        klass03 klass03 = new klass03();
        klass03.eat(a, b);
    }

    //虚假的交换值,因为都是临时的,栈中的,方法结束后,不会返回,而是通过gc丢弃了
    //如果参数是引用值,那么会在堆里面进行交换,然后就真的交换了.
//    public static void swift(int input1, int input2){
//        int temp = input2;
//        input2 = input1;
//        input1 = temp;
//    }
    // 真正的交换值
    public static void swift(int[] arr, int input1, int input2){
        System.out.println(arr[input1] + " " + arr[input2]);
        int temp = arr[input2];
        arr[input2] = arr[input1];
        arr[input1] = temp;
    }


    public void eat(int input1, int input2){
        System.out.println(input1 +input2);
    }
}
