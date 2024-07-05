package com.ysy.design.patterns.facade.player;

// 饿汉式,单例模式
public class DVDPlayer {
    // 私有化构造器
    private DVDPlayer() {

    }

    private static DVDPlayer dvdPlayer = new DVDPlayer();

    public static DVDPlayer getInstance(){

        return dvdPlayer;
    }

    public void on(){
        System.out.println("DVD is going to work!");

    }

    public void off(){
        System.out.println("DVD is going to off work!");
    }

    public void play(){
        System.out.println("DVD is playing!");
    }

    public void pause(){
        System.out.println("DVD is going to pause!");
    }
}
