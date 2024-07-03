package com.ysy.myDoris;

/*

CREATE TABLE IF NOT EXISTS id_20240703
(
`Id`                          int NOT NULL COMMENT ''
)
DISTRIBUTED BY HASH(`Id`) BUCKETS 3
PROPERTIES (
"replication_allocation" = "tag.location.default: 1",
"enable_duplicate_without_keys_by_default" = "true"
);


 */

import com.ysy.util.MyGeneratorFunction;
import org.apache.flink.api.common.eventtime.WatermarkStrategy;
import org.apache.flink.api.common.typeinfo.Types;
import org.apache.flink.api.connector.source.util.ratelimit.RateLimiterStrategy;
import org.apache.flink.connector.datagen.source.DataGeneratorSource;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.table.api.Table;
import org.apache.flink.table.api.TableResult;
import org.apache.flink.table.api.bridge.java.StreamTableEnvironment;

public class DataGen2DorisDemo {

    public static void main(String[] args) throws Exception {

        // env
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.setParallelism(1);

        StreamTableEnvironment tEnv = StreamTableEnvironment.create(env);

        // datagen
        MyGeneratorFunction myGeneratorFunction = new MyGeneratorFunction();

        /*
        初始化数据生成器
         */
        DataGeneratorSource dataGeneratorSource = new DataGeneratorSource<>(myGeneratorFunction, 100,
                RateLimiterStrategy.perSecond(5), Types.STRING);

        DataStreamSource<Object> streamSource = env.fromSource(dataGeneratorSource, WatermarkStrategy.noWatermarks(), "dataGen");

        // from datastream to table
        Table sourceTable = tEnv.fromDataStream(streamSource);
        sourceTable.printSchema();
        sourceTable.execute().print();
        tEnv.createTemporaryView("sourceTable", sourceTable);

        // sink, 通过sql ddl
        String createDorisSink = "CREATE TABLE IF NOT EXISTS dorisSink\n" +
                "(`Id` int NOT NULL COMMENT '') \n" +
                "WITH (\n" +
                "  'connector' = 'doris',\n" +
                "  'fenodes' = '192.168.1.100:8030',\n" +
                "  'table.identifier' = 'doris.id_20240703',\n" +
                "  'username' = 'root',\n" +
                "  'password' = ''\n" +
                ");";
        tEnv.executeSql(createDorisSink);

        // sql
        String insertSql = "insert into dorisSink select cast(f0 as int) as Id from sourceTable";
        TableResult tableResult = tEnv.executeSql(insertSql);

        tableResult.print();
        env.execute();
    }
}
