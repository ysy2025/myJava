package com.ysy.ESTable;

import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.table.api.bridge.java.StreamTableEnvironment;

public class ESTableDemo01 {

    public static void main(String[] args) throws Exception {

        // env
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();

        StreamTableEnvironment tenv = StreamTableEnvironment.create(env);

        // create table sql
        String esTableSource = "CREATE TABLE source (\n" +
                "    `arriveDateline` string,\n" +
                "    `changeCheckResultByNext` string,\n" +
                "    `changePreCheckResult` string,\n" +
                "    `checkAdminCompanyType` string,\n" +
                "    `checkAdminId` string,\n" +
                "    `checkAdminName` string,\n" +
                "    `checkDateline` string,\n" +
                "    `checkDayNormal` string,\n" +
                "    `checkDayTask` string,\n" +
                "    `checkResult` string,\n" +
                "    `checkStep` string,\n" +
                "    `distributionAdminId` string,\n" +
                "    `distributionDateline` string,\n" +
                "    `editByNext` string,\n" +
                "    `editFlag` string,\n" +
                "    `id` string,\n" +
                "    `position` string,\n" +
                "    `preCheckStep` string,\n" +
                "    `tid` string,\n" +
                "    `topFid` string\n" +
                ") WITH (\n" +
                "    'connector.type'='elasticsearch',\n" +
                "    'es.resource'='liuyan_threads_full_check_org/_doc',\n" +
                "    'es.nodes'='10.31.68.168:9200',\n" +
                "    'es.port'='9200',\n" +
                "    'es.query'='?q=*',\n" +
                "    'es.nodes.client.only'='false',\n" +
                "    'es.nodes.discovery'='false',\n" +
                "    'es.nodes.wan.only'='true',\n" +
                ");\n";
        tenv.executeSql(esTableSource);

        // create sink table sql
        String sinkCreateSql = "CREATE TABLE sink (\n" +
                "    `arriveDateline` string,\n" +
                "    `changeCheckResultByNext` string,\n" +
                "    `changePreCheckResult` string,\n" +
                "    `checkAdminCompanyType` string,\n" +
                "    `checkAdminId` string,\n" +
                "    `checkAdminName` string,\n" +
                "    `checkDateline` string,\n" +
                "    `checkDayNormal` string,\n" +
                "    `checkDayTask` string,\n" +
                "    `checkResult` string,\n" +
                "    `checkStep` string,\n" +
                "    `distributionAdminId` string,\n" +
                "    `distributionDateline` string,\n" +
                "    `editByNext` string,\n" +
                "    `editFlag` string,\n" +
                "    `id` string,\n" +
                "    `position` string,\n" +
                "    `preCheckStep` string,\n" +
                "    `tid` string,\n" +
                "    `topFid` string\n" +
                ") with (\n" +
                "'connector' = 'print');\n";

        tenv.executeSql(sinkCreateSql);

        // 输出表
        // sql 写法
        tenv.executeSql("insert into sink select * from source");
        // table api写法

        env.execute();
    }
}
