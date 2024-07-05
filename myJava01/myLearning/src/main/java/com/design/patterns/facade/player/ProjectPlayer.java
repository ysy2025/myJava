package com.design.patterns.facade.player;

public class ProjectPlayer {

    private ProjectPlayer() {
    }

    private static ProjectPlayer projectPlayer = new ProjectPlayer();

    public static ProjectPlayer getInstance(){
        return projectPlayer;
    }

    public void on(){
        System.out.println("ProjectPlayer is going to work!");

    }

    public void off(){
        System.out.println("ProjectPlayer is going to off work!");
    }

    public void focus(){
        System.out.println("ProjectPlayer is focusing!");
    }

}
