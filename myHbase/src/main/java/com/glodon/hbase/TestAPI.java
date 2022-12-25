package com.glodon.hbase;

import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.HBaseAdmin;

import java.io.IOException;

/**
 * DDL
 * 1,创建命名空间
 * 2,判断表是否存在;
 * 3,创建表
 * 4,增删改查
 *
 * DML
 * 1,数据增删改查
 * 2,查询数据;get,scan
 *
 */
public class TestAPI {

    // 1,判断表是否存在
    public static boolean isTableExist(String tableName) throws IOException {
        // 获取配置文件
        HBaseConfiguration configuration = new HBaseConfiguration();

        configuration.set("hbase,zookeeper.quorum", "hadoop102, hadoop103, hadoop104");

        // 初始化管理员对象
        HBaseAdmin hBaseAdmin = new HBaseAdmin(configuration);

        // 判断表是否存在
        boolean b = hBaseAdmin.tableExists(tableName);

        // 关闭链接
        hBaseAdmin.close();

        // 返回结果
        return b;
    }

    public static void main(String[] args) throws IOException {

        // 测试表是否存在
        System.out.println(isTableExist("stu"));
    }

}
