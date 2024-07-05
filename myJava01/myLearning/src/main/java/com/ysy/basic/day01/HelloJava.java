package com.ysy.basic.day01;

/*
第一个java程序的总结
1.编写->编译->运行
2.一个java源文件中可以声明多个类,但是最多只能有一个声明为public,而且class名称需要和文件名保持一致.
3.程序的入口是main方法,格式是固定的
4.输出语句:
System.out.println();
System.out.print();
 */
public class HelloJava {
    public static void main(String[] args) {
        /*
        单行注释和多行注释:
        1,解释说明,增加可读性,方便自己,方便别人
        2,调试代码
        3,不参与便于

        main 方法是程序入口,调用其他方法进行run

        <!--
        -->是其他语言的单行多行注释格式
        文档注释是java独有的;
         */

        /**
         @author
         @input
         文档注释是可以被javadoc解析的,生成一套以网页文件形式体现的说明文档
         main方法是程序的入口
         */
//        打印材料
        System.out.println("zhangsan");

        PrintJava("caonima");

        PrintZhangsan("zhangsan niubi");
        PrintZhangsan("lisi");
    }

    private static void PrintZhangsan(String input) {
        System.out.println(input);
    }

    public static void PrintJava(String input){
        System.out.println(input);
    }
}
