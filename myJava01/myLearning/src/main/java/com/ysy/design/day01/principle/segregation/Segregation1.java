package com.ysy.design.day01.principle.segregation;

public class Segregation1 {

}

interface i1{
    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
}

class A{

    public void depend1(i1 i) {
        i.operation1();
    }

    public void depend2(i1 i) {
        i.operation2();
    }

    public void depend3(i1 i) {
        i.operation3();
    }
}

class B implements i1{

    @Override
    public void operation1() {

    }

    @Override
    public void operation2() {

    }

    @Override
    public void operation3() {

    }

    @Override
    public void operation4() {

    }

    @Override
    public void operation5() {

    }
}

class C{
    public void depend1(i1 i) {
        i.operation1();
    }

    public void depend4(i1 i) {
        i.operation4();
    }

    public void depend5(i1 i) {
        i.operation5();
    }
}

class D implements i1{

    @Override
    public void operation1() {

    }

    @Override
    public void operation2() {

    }

    @Override
    public void operation3() {

    }

    @Override
    public void operation4() {

    }

    @Override
    public void operation5() {

    }
}