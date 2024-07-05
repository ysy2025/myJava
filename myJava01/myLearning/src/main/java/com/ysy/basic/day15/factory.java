package com.ysy.basic.day15;

/*
* 工厂模式
*
 */
public class factory extends B implements A{
    public void px(){
        System.out.println(super.x);//父类
        System.out.println(A.x);//接口的
    }

    public static void main(String[] args) {
        new factory().px();
    }
}

interface A{
    int x = 0;
}

class B{
    int x = 1;
}


interface Playable{
    void play();
}

interface Bounceable{
    void play();
}

interface Rollable extends Playable, Bounceable{
    Ball ball = new Ball("zhangsan");
}

class Ball implements Rollable{
    private String name;

    public String getName() {
        return name;
    }

    public Ball(String name) {
        this.name = name;
    }

    public void play(){
//        ball = new Ball("zhangsi");
        System.out.println(ball.getName());
    }
}