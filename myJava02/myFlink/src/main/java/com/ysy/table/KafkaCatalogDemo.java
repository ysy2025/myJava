package com.ysy.table;

import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.table.api.bridge.java.StreamTableEnvironment;

public class KafkaCatalogDemo {

    public static void main(String[] args) {

        // 1 创建环境
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        StreamTableEnvironment tenv = StreamTableEnvironment.create(env);

        // 2 建表 针对source和sink都建

        // 3 执行查询
        // 3.1 使用 sql 进行查询
        // 3.1.1 把 table 对象，注册成表名
        // 4 输出表
        // sqlapi


    }

}
