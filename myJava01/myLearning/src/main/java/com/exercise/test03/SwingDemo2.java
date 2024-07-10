package com.exercise.test03;

import javax.swing.*;

/*
https://www.cnblogs.com/yuhanghzsd/p/4421858.html
 */
public class SwingDemo2 extends JFrame {

    private JPanel jp,jp1;    //声明面板，面板功能：可添加按钮文本等，方便管理界面。
    private  JButton b1;   //声明 按钮
    private JButton b2,b3;

    public SwingDemo2() {
        jp = new JPanel();
        b1 = new JButton("按钮1");
        b2 = new JButton("按钮2");//实例化 jp b1 b2
        jp.add(b1);
        jp.add(b2);


        this.add(jp);   //按钮添加到面板，面板添加到界面。
        this.setSize(300,200);   //设定 窗口宽度300，高度200
        this.setLocation(100,100);  //设定窗口左上角坐标，窗口打开时的位置。以左上定点为0.0
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingDemo2 frame = new SwingDemo2();
        frame.setVisible(true);
    }
}
