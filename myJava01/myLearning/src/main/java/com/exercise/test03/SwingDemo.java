package com.exercise.test03;

import javax.swing.*;
import java.awt.*;

public class SwingDemo {

    public static void main(String[] args) {
        // title
        String title = "zhangsan";

        // frame 初始化
        JFrame jf = new JFrame(title);
        Container container = jf.getContentPane();

        // button添加
        container.add(new Button("button"));
        container.setBackground(Color.BLUE);
        container.setBounds(100,100,100,100);
        container.setVisible(true);

        JPanel jp = new JPanel();
        JButton b1 = new JButton("按钮1");
        JButton b2 = new JButton("按钮2");//实例化 jp b1 b2
        jp.add(b1);
        jp.add(b2);
        jp.setVisible(true);



    }
}
