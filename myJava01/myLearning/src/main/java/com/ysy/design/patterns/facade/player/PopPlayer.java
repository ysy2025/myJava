package com.ysy.design.patterns.facade.player;

public class PopPlayer {

    // 私有化构造器

    private PopPlayer() {
    }

    private static PopPlayer popPlayer = new PopPlayer();

    public static PopPlayer getInstance(){
        return popPlayer;
    }

    public void on(){
        System.out.println("PopPlayer is going to work!");

    }

    public void off(){
        System.out.println("PopPlayer is going to off work!");
    }

    public void pop(){
        System.out.println("PopPlayer is poping!");
    }

}
