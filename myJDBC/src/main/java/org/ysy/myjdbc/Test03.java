package org.ysy.myjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test03 {
    public static void main(String[] args) {
        // 1 设置连接信息
        String url = "jdbc:hive2://hadoop102:10000";
        String username = "root";
        String password = "";
        String driver = "org.apache.hive.jdbc.HiveDriver";


        try {
            //2 加载驱动
            Class.forName(driver);

            //3 创建连接 和 执行sql的
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement statement = conn.createStatement();

            // 4 创建 statement 发送执行sql
            String sql = "select r_name from ods2.region a";

            // 4.1 设置结果
            String result = "";

            // 5 执行sql 获取结果集
            ResultSet rows = statement.executeQuery(sql);

            //使用游标来提取数据,
            //默认游标指向结果集的第一条记录之前,所以需要先使用next()下移游标,
            //指向记录或根据返回boolean结果来判定是否还有可读取的记录
            while (rows.next()){
                //下面第一句使用的是 int 列位置来获取值.其他使用的是列名.
                //两种方式可以互换.推荐:使用列名方式
                String request_id = rows.getString("r_name");
                if(request_id.length() > 0) {
                    System.out.println("记录保存成功！");
                    System.out.println(request_id);
                    result = result + "'" + request_id + "' ,";
                    System.out.println(result);
                }else {
                    System.out.println("!!!");
                }
            }

            // 关闭游标
            rows.close();
            // 关闭获取sql结果集
            statement.close();
            // 关闭connection
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
