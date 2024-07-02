package com.ysy.myDoris;//package org.ysy.myDoris;
//
//import org.apache.doris.flink.cfg.DorisExecutionOptions;
//import org.apache.doris.flink.cfg.DorisOptions;
//import org.apache.doris.flink.cfg.DorisReadOptions;
//import org.apache.doris.flink.sink.batch.DorisBatchSink;
//import org.apache.doris.flink.sink.writer.serializer.SimpleStringSerializer;
//import org.apache.flink.api.common.serialization.SimpleStringSchema;
//import org.apache.flink.streaming.api.CheckpointingMode;
//import org.apache.flink.streaming.api.datastream.DataStream;
//import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
//import org.apache.flink.streaming.connectors.kafka.FlinkKafkaConsumer;
//
//import java.util.Properties;
//
///*
//https://blog.csdn.net/weixin_45399602/article/details/124614020
//添加 flink-doris-connector 和必要的 Flink Maven 依赖
//此处参考官网的配置
// */
//
//public class SinkDoris {
//    public static void main(String[] args) {
//        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
//        env.setParallelism(1);
//
//        // 如果是精准一次，必须开启checkpoint（后续章节介绍）
//        env.enableCheckpointing(2000, CheckpointingMode.EXACTLY_ONCE);
//
//
//        // TODO 从Kafka读： 新Source架构
//        Properties kproperties = new Properties();
//        kproperties.setProperty("bootstrap.servers", "localhost:9092");
//        kproperties.setProperty("group.id", "test");
//        kproperties.setProperty("auto.offset.reset", "earliest");
//
//        // 创建Kafka消费者
//        FlinkKafkaConsumer<String> consumer = new FlinkKafkaConsumer<>(
//                "your_kafka_topic", // Kafka主题
//                new SimpleStringSchema(), // 数据序列化
//                kproperties // Kafka消费者配置
//        );
//
//        DataStream<String> stream = env.addSource(consumer);
//
//        // DorisOptions
//        DorisOptions dorisOptions = DorisOptions.builder()
//                .setFenodes("192.168.1.100:8030")
//                .setTableIdentifier("dbname.tablename")
//                .setUsername("root")
//                .setPassword("").build();
//
//        // DorisReadOptions
//        DorisReadOptions dorisReadOptions = DorisReadOptions.builder().build();
//
//        // DorisExecutionOptions
//        Properties dproperties = new Properties();
////        properties.put("format", "json"); //默认为json格式插入数据
//        dproperties.put("read_json_by_line", "true");
//        dproperties.put("column_separator", ",");
//
//        DorisExecutionOptions dorisExecutionOptions = DorisExecutionOptions
//                .builder().setStreamLoadProp(dproperties)
//                .setBatchMode(true)
//                .setMaxRetries(3)
//                .setDeletable(true)
//                .setBufferFlushMaxRows(5000)
//                .setBufferFlushIntervalMs(5000L).build();
//
//        // builder
//        DorisBatchSink.Builder<String> builder = DorisBatchSink.builder();
//
//        builder.setDorisReadOptions(dorisReadOptions)
//                .setDorisExecutionOptions(dorisExecutionOptions)
//                .setSerializer(new SimpleStringSerializer()) //serialize according to string
//                .setDorisOptions(dorisOptions);
//
//
//        stream.sinkTo(builder.build()).setParallelism(1);
//    }
//}
