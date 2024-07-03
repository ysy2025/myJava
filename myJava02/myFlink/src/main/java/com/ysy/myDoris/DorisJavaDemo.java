package com.ysy.myDoris;

import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.table.api.Table;
import org.apache.flink.table.api.TableResult;
import org.apache.flink.table.api.bridge.java.StreamTableEnvironment;
import org.apache.flink.types.Row;

/*
https://www.bilibili.com/video/BV1qS421d7vt/?p=10&spm_id_from=pageDriver&vd_source=fd1c533877349356d8e44d4efe40b157
hadoop 路径问题
https://blog.csdn.net/weixin_44990104/article/details/117596231?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522171999356016800182161678%2522%252C%2522scm%2522%253A%252220140713.130102334.pc%255Fall.%2522%257D&request_id=171999356016800182161678&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~first_rank_ecpm_v1~rank_v31_ecpm-6-117596231-null-null.142^v100^pc_search_result_base7&utm_term=HADOOP_HOME%20and%20hadoop.home.dir%20are%20unset.&spm=1018.2226.3001.4187
 */
public class DorisJavaDemo {
    public static void main(String[] args) throws Exception {
        // flink sql table 的方式
        // env
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.setParallelism(1);

        StreamTableEnvironment tEnv = StreamTableEnvironment.create(env);

        // 在 Flink SQL 中注册一张 MySQL 表
        String createSourceSql = "CREATE TABLE city_info (\n" +
                "  id int,\n" +
                "  name string,\n" +
                "  province_id int,\n" +
                "  create_time timestamp,\n" +
                "  update_time timestamp,\n" +
                "  is_deleted int\n" +
                ") WITH (\n" +
                "   'connector' = 'jdbc',\n" +
                "   'url' = 'jdbc:mysql://hadoop101:3306/lease',\n" +
                "   'table-name' = 'city_info',\n" +
                "   'username' = 'root',\n" +
                "   'password' = '123456'\n" +
                ");";

        tEnv.executeSql(createSourceSql);
        TableResult tableResult = tEnv.executeSql("select * from city_info a limit 3");

        tableResult.print();


        // sink, 通过sql ddl
        // 好像不能有primary key 这些,好像会报错
        String createSinkSql = "CREATE TABLE city_info_sink (\n" +
                "  id int,\n" +
                "  name string,\n" +
                "  province_id int,\n" +
                "  create_time timestamp,\n" +
                "  update_time timestamp,\n" +
                "  is_deleted int\n" +
                ") \n" +
                "WITH (\n" +
                "  'connector' = 'doris',\n" +
                "  'fenodes' = '192.168.1.100:8030',\n" +
                "  'table.identifier' = 'doris.city_info',\n" +
                "  'username' = 'root',\n" +
                "  'password' = '',\n" +
                "  'sink.label-prefix' = 'doris_label'\n" +
                ");";
        tEnv.executeSql(createSinkSql);

        // 写入
        tEnv.executeSql("INSERT INTO city_info_sink SELECT * FROM city_info");

        // 查询结果
        Table sinkRes = tEnv.sqlQuery("select * from city_info_sink");

        // interpret the insert-only Table as a DataStream again
        DataStream<Row> resultStream = tEnv.toDataStream(sinkRes);

        // add a printing sink and execute in DataStream API
        resultStream.print();
//
        env.execute();
    }

}
