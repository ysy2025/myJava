package com.ysy.table;

import com.ysy.bean.WaterSensor;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.table.api.Table;
import org.apache.flink.table.api.bridge.java.StreamTableEnvironment;

public class TableStreamDemo {
    public static void main(String[] args) throws Exception {

        // env
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();

        // datastream
        DataStreamSource<WaterSensor> sensorDS = env.fromElements(
                new WaterSensor("s1", 1L, 1),
                new WaterSensor("s1", 2L, 2),
                new WaterSensor("s2", 2L, 2),
                new WaterSensor("s3", 3L, 3),
                new WaterSensor("s3", 4L, 4)
        );

        // tenv
        StreamTableEnvironment tenv = StreamTableEnvironment.create(env);

        // ds -> table
        Table table = tenv.fromDataStream(sensorDS);

        // 表注册
        tenv.createTemporaryView("sensorTable", table);

        // 写flinksql 生成新的table
        Table filterTable = tenv.sqlQuery("select id,ts,vc from sensorTable where ts >2");
        Table sumTable = tenv.sqlQuery("select id, sum(vc) from sensorTable group by id");

        // 表转流
        // 追加
//        DataStream<WaterSensor> waterSensorDataStream = tenv.toDataStream(filterTable, WaterSensor.class);
//        waterSensorDataStream.print("simplefilter");
        tenv.toDataStream(filterTable, WaterSensor.class).print("filter");

        // 更新表
        /*
        不能直接用toDataStream 否则会报错
        Table sink '*anonymous_datastream_sink$3*' doesn't support consuming update changes
         */
//        tenv.toDataStream(sumTable).print("sum");
        tenv.toChangelogStream(sumTable).print("sum");

        /*
        只要代码中调用了datastream api 就需要execute, 否则不需要
         */
        env.execute();





        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
//
//
//        DataStreamSource<WaterSensor> sensorDS = env.fromElements(
//                new WaterSensor("s1", 1L, 1),
//                new WaterSensor("s1", 2L, 2),
//                new WaterSensor("s2", 2L, 2),
//                new WaterSensor("s3", 3L, 3),
//                new WaterSensor("s3", 4L, 4)
//        );
//
//        StreamTableEnvironment tableEnv = StreamTableEnvironment.create(env);
//
//        // TODO 1. 流转表
//        Table sensorTable = tableEnv.fromDataStream(sensorDS);
//        tableEnv.createTemporaryView("sensor", sensorTable);
//
//        Table filterTable = tableEnv.sqlQuery("select id,ts,vc from sensor where ts>2");
//        Table sumTable = tableEnv.sqlQuery("select id,sum(vc) from sensor group by id");
//
//
//        // TODO 2. 表转流
//        // 2.1 追加流
//        tableEnv.toDataStream(filterTable, WaterSensor.class).print("filter");
//        // 2.2 changelog流(结果需要更新)
//        tableEnv.toChangelogStream(sumTable ).print("sum");
//
//
//        // 只要代码中调用了 DataStreamAPI，就需要 execute，否则不需要
//        env.execute();
    }
}
