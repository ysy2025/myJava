package com.ysy.day15;

public class Inner02 {
    public void method(){

    }

    // 返回一个实现了comparable接口的类的对象
    public Comparable getComparable(){

        // 创建一个comparable的局部内部类即可
//        class MyComparable implements Comparable{
//
//            @Override
//            public int compareTo(Object o) {
//                return 0;
//            }
//        }

//        return new MyComparable();

        // 创建了一个匿名对象
        return new Comparable(){

            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }

}

class AA{

    String name;
    int size;

    public void show(){
        int num = 10;
        class BB{
            /*
            * 局部类中的方法(method方法)中,如果调用局部内部类所声明的方法(show方法)中的局部变量,需要次局部变量是final的
            *
             */
            public void method(){
//                num = 20;
                System.out.println(num);
            }
        }
    }
}