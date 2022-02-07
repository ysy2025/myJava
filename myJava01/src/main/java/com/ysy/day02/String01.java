package com.ysy.day02;

/*
1,String不是基本数据类型,是引用数据类型
2,双引号;char是单引号
3,字符串可以为空,char不可以为空
4,String可以和8种基本数据类型变量做运算.且只能是连接计算("+")符号,这个和python不同
 */
public class String01 {
    public static void main(String[] args) {
        System.out.println("zhangsan");

        String s1 = "zhangsan lisi wangermazi";
        System.out.println(s1);

        System.out.println("");
        System.out.println('a');

        System.out.println(s1 + true);
        
        int i1 = 10001;
        String s2 = s1 + i1;
        System.out.println(s2);

        // + 什么时候是加号,什么时候是连接?要注意!
        char cc = 'a';
        int nn = 10;
        String str = "hello";
        System.out.println(cc + nn + str);
        System.out.println(cc + str + nn);
        System.out.println(cc + (nn + str));
        System.out.println((cc + nn) + str);
        System.out.println(str + nn + cc);

        //输出 *  *.
        char ccc = '*';
        char ddd = '\t';
        System.out.println(ccc + ddd + ccc);
        System.out.println(ccc);
        //所有想输出string的时候,用string进行连接!
    }
}
