package com.ysy.table;

import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.table.api.EnvironmentSettings;
import org.apache.flink.table.api.Table;
import org.apache.flink.table.api.TableEnvironment;
import org.apache.flink.table.api.bridge.java.StreamTableEnvironment;

import static org.apache.flink.table.api.Expressions.$;

public class CatalogDemo {

    public static void main(String[] args) throws Exception {
        // env
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();

        // create table env
        // 写法1
//        EnvironmentSettings settings = EnvironmentSettings.newInstance()
//                .inStreamingMode()
//                .build();
//        TableEnvironment tEnv = TableEnvironment.create(settings);

        // 写法2
        StreamTableEnvironment tEnv2 = StreamTableEnvironment.create(env);

        // create table
        String sourceCreateSql = "CREATE TABLE source (\n" +
                "id INT,\n" +
                "ts BIGINT,\n" +
                "vc INT\n" +
                ") WITH (\n" +
                "'connector' = 'datagen',\n" +
                "'rows-per-second'='1',\n" +
                "'fields.id.kind'='random',\n" +
                "'fields.id.min'='1',\n" +
                "'fields.id.max'='10',\n" +
                "'fields.ts.kind'='sequence',\n" +
                "'fields.ts.start'='1',\n" +
                "'fields.ts.end'='1000000',\n" +
                "'fields.vc.kind'='random',\n" +
                "'fields.vc.min'='1',\n" +
                "'fields.vc.max'='100');\n";

        tEnv2.executeSql(sourceCreateSql);

        String sinkCreateSql = "CREATE TABLE sink (\n" +
                "id INT,\n" +
                "ts BIGINT,\n" +
                "vc INT) WITH (\n" +
                "'connector' = 'print');";

        tEnv2.executeSql(sinkCreateSql);

        // 执行查询,得到table
        Table table = tEnv2.sqlQuery("select * from source where id > 5;");
        table.printSchema();

        // 把table对象注册成表名
        tEnv2.createTemporaryView("tmp", table);
        tEnv2.sqlQuery("select * from tmp");

        // 用table api 查询, 得到表对象,然后调用api
//        Table source = tEnv2.from("source");
//        source.groupBy($("id")).aggregate($("vc").abs());

        // 输出表
        // sql 写法
        tEnv2.executeSql("insert into sink select * from source");
        // table api写法

        env.execute();
    }
}
