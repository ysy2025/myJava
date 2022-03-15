package com.design.day01.principle.segregation;

public class Segaration2 {
    public static void main(String[] args) {
        A01 a01 = new A01();

        a01.depend3(new B01());
    }
}

interface i01{
    void operation1();
}

interface i02{
    void operation2();
    void operation3();
}

interface i03{
    void operation4();
    void operation5();
}

class B01 implements i01, i02{

    @Override
    public void operation1() {
        System.out.println("001");
    }

    @Override
    public void operation2() {
        System.out.println("002");
    }

    @Override
    public void operation3() {
        System.out.println("003");
    }
}

// 通过接口来使用D类,但是只使用1,4,5方法
class A01{
    public void depend1(i01 i){
        i.operation1();
    }
    public void depend3(i02 i){
        i.operation3();
        i.operation2();
    }
}