package com.design.patterns.adapter.interfaceadapter.absadapter;

public class Client {
    public static void main(String[] args) {
        // 重写想要的接口方法;匿名内部类来实现类
        AbsAdapter absAdapter = new AbsAdapter(){
            @Override
            public void operation1(){
                System.out.println("using operation1");
            }
        };

        absAdapter.operation1();
    }
}
