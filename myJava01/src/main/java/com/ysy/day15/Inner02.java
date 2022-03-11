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

