package org.ysy.myjdbc;


import java.sql.Connection;
import java.sql.DriverManager;

/**
 * JDBC:Java DataBase Connection
 * API :java.sql.*;
 *
 * 连接数据库必须的四个参数
 * a.URL----------确定了连接数据库所在服务器的协议，IP,端口，数据库名等信息
 * b.UserName-----登录数据库需要使用的账户名
 * c.Password-----登录数据库需要使用的密码
 * d.Driver-------连接数据库需要的驱动类 即上一步中添加的驱动包中包含的类名
 *
 * 总结的常见错误如下：
 *  Connection timed out: connect --- 连接超时-检查IP或端口（URL）
 *  Connection Refused----------------mysql服务没有启动
 *  Unknown database 'st'-------------URL中拼写的数据库名字有误
 *  Access denied for user 'root'@'localhost' ----用户名或密码错误
 *
 * jdbc操作hive
    private static String driverName="org.apache.hive.jdbc.HiveDriver";
    private static String url="jdbc:hive2://hadoop102:10000";
    private static String user="xikuang";
    private static String password="000000";
    原文链接：https://blog.csdn.net/qq_34792920/article/details/122280097
 */
public class Test01 {
    public static void main(String[] args) {
        // 1 设置连接信息
        String url = "jdbc:mysql://192.168.10.102:3306/hive";
        String username = "root";
        String password = "";
        String driver = "com.mysql.jdbc.Driver";


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
