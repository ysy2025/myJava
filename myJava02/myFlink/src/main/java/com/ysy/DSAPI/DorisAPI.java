package com.ysy.DSAPI;

import com.ysy.bean.WaterSensor;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.table.api.Table;
import org.apache.flink.table.api.bridge.java.StreamTableEnvironment;

public class DorisAPI {

    public static void main(String[] args) throws Exception {


        // 1 创建环境
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        StreamTableEnvironment tenv = StreamTableEnvironment.create(env);

        // 并行度和ckpt
        env.setParallelism(1);
        env.enableCheckpointing(10);

        // 2 建表 针对source和sink都建
        String kafkaSourceSql = "CREATE TABLE source (\n" +
                "    `Employee ID` int,\n" +
                "    `Age` int,\n" +
                "    `Gender` string,\n" +
                "    `Years at Company` int,\n" +
                "    `Job Role` string,\n" +
                "    `Monthly Income` int,\n" +
                "    `Work-Life Balance` string,\n" +
                "    `Job Satisfaction` string,\n" +
                "    `Performance Rating` string,\n" +
                "    `Number of Promotions` int,\n" +
                "    `Overtime` string,\n" +
                "    `Distance from Home` int,\n" +
                "    `Education Level` string,\n" +
                "    `Marital Status` string,\n" +
                "    `Number of Dependents` int,\n" +
                "    `Job Level` string,\n" +
                "    `Company Size` string,\n" +
                "    `Company Tenure` int,\n" +
                "    `Remote Work` string,\n" +
                "    `Leadership Opportunities` string,\n" +
                "    `Innovation Opportunities` string,\n" +
                "    `Company Reputation` string,\n" +
                "    `Employee Recognition` string,\n" +
                "    `Attrition` string\n" +
                ") WITH (\n" +
                "  'connector' = 'kafka',\n" +
                "  'topic' = 'first',\n" +
                "  'properties.bootstrap.servers' = '192.168.1.101:9092',\n" +
                "  'properties.group.id' = 'first_consumer',\n" +
                "  'scan.startup.mode' = 'earliest-offset',\n" +
                "  'format' = 'json',\n" +
                "  'json.ignore-parse-errors' = 'true'\n" +
                ")";

        tenv.executeSql(kafkaSourceSql);

        String printSinkSql = "CREATE TABLE sink (\n" +
                "    `Employee ID` int,\n" +
                "    `Age` int,\n" +
                "    `Gender` string,\n" +
                "    `Years at Company` int,\n" +
                "    `Job Role` string,\n" +
                "    `Monthly Income` int,\n" +
                "    `Work-Life Balance` string,\n" +
                "    `Job Satisfaction` string,\n" +
                "    `Performance Rating` string,\n" +
                "    `Number of Promotions` int,\n" +
                "    `Overtime` string,\n" +
                "    `Distance from Home` int,\n" +
                "    `Education Level` string,\n" +
                "    `Marital Status` string,\n" +
                "    `Number of Dependents` int,\n" +
                "    `Job Level` string,\n" +
                "    `Company Size` string,\n" +
                "    `Company Tenure` int,\n" +
                "    `Remote Work` string,\n" +
                "    `Leadership Opportunities` string,\n" +
                "    `Innovation Opportunities` string,\n" +
                "    `Company Reputation` string,\n" +
                "    `Employee Recognition` string,\n" +
                "    `Attrition` string\n" +
                "    ) \n" +
                "    WITH (\n" +
                "      'connector' = 'doris',\n" +
                "      'fenodes' = '10.31.69.24:8030',\n" +
                "      'table.identifier' = 'doris.temp',\n" +
                "      'username' = 'root',\n" +
                "      'password' = '',\n" +
                "      'sink.label-prefix' = 'doris_label'\n" +
                ");\n";

        tenv.executeSql(printSinkSql);

        // 3 执行查询
        // 3.1 使用 sql 进行查询
        Table sourceTable = tenv.sqlQuery("select count(1) as cnt from source;");
        sourceTable.printSchema();
        // 注册成表名
        tenv.createTemporaryView("sourceTable", sourceTable);
        tenv.sqlQuery("select * from sourceTable");

        // 4 输出表
        tenv.executeSql("insert into sink select * from source");
        
        env.execute();
        // sqlapi

    }
}
