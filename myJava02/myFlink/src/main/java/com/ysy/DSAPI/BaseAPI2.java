package com.ysy.DSAPI;

import com.ysy.bean.WaterSensor;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.table.api.Schema;
import org.apache.flink.table.api.Table;
import org.apache.flink.table.api.bridge.java.StreamTableEnvironment;

public class BaseAPI2 {

    public static void main(String[] args) throws Exception {
        // 创建环境
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();

        env.setParallelism(1);

        StreamTableEnvironment tenv = StreamTableEnvironment.create(env);

        // datastream
        DataStreamSource<WaterSensor> sensorDS = env.fromElements(
                new WaterSensor("s1", 1L, 1),
                new WaterSensor("s1", 2L, 2),
                new WaterSensor("s2", 2L, 2),
                new WaterSensor("s3", 3L, 3),
                new WaterSensor("s3", 4L, 4)
        );

        // ds -> table,建表
        Table table = tenv.fromDataStream(sensorDS);
//        tenv.fromDataStream(sensorDS, Schema.newBuilder().build());

        // 表注册
        tenv.createTemporaryView("sensorTable", table);
        Table table1 = tenv.sqlQuery("select * from sensorTable");

        sensorDS.print();

        env.execute();


    }
}
