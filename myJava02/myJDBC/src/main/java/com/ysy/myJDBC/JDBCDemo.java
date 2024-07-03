package com.ysy.myJDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCDemo {
    public static void main(String[] args) {
        // 1 设置连接信息
        String url = "jdbc:mysql://192.168.1.101:3306/lease";
        String username = "root";
        String password = "123456";
        String driver = "com.mysql.cj.jdbc.Driver";

        try {
            //加载驱动
            Class.forName(driver);

            //创建连接
            Connection conn = DriverManager.getConnection(url, username, password);

            System.out.println("连接成功！" + conn);

        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
