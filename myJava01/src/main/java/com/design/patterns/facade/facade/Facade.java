package com.design.patterns.facade.facade;

import com.design.patterns.facade.player.DVDPlayer;
import com.design.patterns.facade.player.PopPlayer;
import com.design.patterns.facade.player.ProjectPlayer;


public class Facade {
    // 定义各个子系统对象
    private DVDPlayer dvdPlayer;
    private PopPlayer popPlayer;
    private ProjectPlayer prjPlayer;

    // 构造器, 但是传入的参数太多不好;直接用单例模式获得
    public Facade() {
        this.dvdPlayer = DVDPlayer.getInstance();
        this.popPlayer = PopPlayer.getInstance();
        this.prjPlayer = ProjectPlayer.getInstance();
    }

    // 操作分4步
    public void ready(){
        dvdPlayer.on();
        popPlayer.on();
        popPlayer.pop();
        prjPlayer.on();
        prjPlayer.focus();
    }

    public void play(){
        dvdPlayer.play();
    }

    public void pause(){
        dvdPlayer.pause();
    }

    public void off(){
        prjPlayer.off();
        popPlayer.off();
        dvdPlayer.off();
    }


}
