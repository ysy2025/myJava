package com.ysy.myJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectDemo {
//    private void method2() {
//        try{
//            PreparedStatement preparedStatement2 = connection.prepareStatement("show create table user_pop_info");
//            ResultSet resultSet2 = preparedStatement2.executeQuery();
//            while(resultSet2.next()) {
//                String tableName = resultSet2.getString("Table");
//                String createTable = resultSet2.getString("Create Table");
//                System.out.println(createTable);
//            }
//        } catch (Exception e) {
//            log.error("method2 error ", e);
//        }
//    }

    public static void main(String[] args) {

        // 1 设置连接信息
        String url = "jdbc:mysql://192.168.1.101:3306/lease";
        String username = "root";
        String password = "123456";
        String driver = "com.mysql.cj.jdbc.Driver";

        try {
            // 2 加载驱动
            Class.forName(driver);

            //3 创建连接
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("连接成功！" + conn);

            // 4 创建 statement 和 sql 语句和结果
            Statement statement = conn.createStatement();
            String sql = "show create table lease.city_info";
            String result = "";

            // 5 执行sql 获取结果集
            ResultSet resultSet2 = statement.executeQuery(sql);

            while(resultSet2.next()) {
                String tableName = resultSet2.getString("Table");
                String createTable = resultSet2.getString("Create Table");
                System.out.println(createTable);
            }
            /*使用游标来提取数据,
            默认游标指向结果集的第一条记录之前,所以需要先使用next()下移游标,
            指向记录或根据返回boolean结果来判定是否还有可读取的记录
            */
//            while (rows.next()){
//                /*
//                下面第一句使用的是 int 列位置来获取值.其他使用的是列名.
//                两种方式可以互换.推荐:使用列名方式
//                */
//                String request_id = rows.getString("request_id");
//                if(request_id.length() > 0) {
//                    System.out.println("记录保存成功！");
//                    System.out.println(request_id);
//                    result = result + "'" + request_id + "' ,";
//                    System.out.println(result);
//                }else {
//                    System.out.println("!!!");
//                }
//            }

            // 6 关闭游标
            resultSet2.close();

            // 7 关闭获取sql结果集
            statement.close();

            // 8 关闭connection
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
