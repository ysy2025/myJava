package com.ysy.table;

import org.apache.flink.connector.datagen.table.DataGenConnectorOptions;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.table.api.*;
import org.apache.flink.table.api.bridge.java.StreamTableEnvironment;


public class TableAPIDemo {

    public static void main(String[] args) throws Exception {
        // env
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.setParallelism(1);
        StreamTableEnvironment tEnv = StreamTableEnvironment.create(env);

        // 指定catalog和db
//        tEnv.useCatalog("testCT");
//        tEnv.useDatabase("testDB");

        // data gen 创建sourcetable
        tEnv.createTemporaryTable("sourceTable",
                TableDescriptor.forConnector("datagen").schema(
                        Schema.newBuilder().column("f0", DataTypes.STRING()).build()
                ).option(DataGenConnectorOptions.ROWS_PER_SECOND, 10L)
                        .build()
                );

        // 创建sinktable
        String sinkTableCreate = "create table sinkTable(\n" +
                "f0 string\n" +
                ") with (\n" +
                "'connector' = 'print'\n" +
                ")";

        // 使用table api, 将 sourcetable sinktable 构造出来
        tEnv.executeSql(sinkTableCreate);

        Table sourceTable = tEnv.from("sourceTable");

        // print schema
        sourceTable.printSchema();


        // 查询sourcetable
        tEnv.sqlQuery("select * from sourceTable");
//        tEnv.sqlQuery("select * from sinkTable");

        // insert to sinktable
//        sourceTable.executeInsert("sinkTable");

        // sql 的方式将数据写入sinkTable
        tEnv.executeSql("insert into sinkTable select f0 from sourceTable");


//        env.execute();
    }
}
