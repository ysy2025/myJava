package com.basic.day14;

/*
main方法使用
1,main方法是程序入口
2,main方法也是普通的静态方法
3,main方法里面的对象可以调非静态的成员;但是不是对象的就不能.
4,main方法的形参,也可以作为与控制台的交互方式;之前使用scanner



 */
public class MainTest {
    public static void main(String[] args) {
        Main.main(new String[100]);
//        show();
    }

    public static void show(){

    }
}

class Main{
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++){
            args[i] = "args_" + i;
            System.out.println(args[i]);
        }

        SubTest subTest = new SubTest();
        subTest.show();
    }
}

class SubTest {
    public void show(){
        System.out.println("zhangsan niubi!");
    }
}