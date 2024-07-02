package com.ysy.source;


import org.apache.flink.api.common.serialization.SimpleStringSchema;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaConsumer;
import org.apache.flink.streaming.connectors.kafka.config.StartupMode;

import java.util.LinkedList;
import java.util.Properties;

public class KafkaSourceDemo {

    public static void main(String[] args) throws Exception {

        //获取执行环境
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();

        //方便测试：设置并行度1，生产环境设置为 kafka 的分区数
        env.setParallelism(1);

        //kafka topic
        String topic = "first";

        //方式1 基本模式
        FlinkKafkaConsumer kafkaConsumer = KafkaSourceDemo.createKafkaConsumer(env, topic);
        env.addSource(kafkaConsumer).print();

        //方式2 自定义消费位置
        //FlinkKafkaConsumer kafkaConsumerSerDe = KafkaSourceDemo.createKafkaConsumerSerDe(env, topic, StartupMode.LATEST);
        //方式3 多 topic 模式
//        FlinkKafkaConsumer kafkaConsumerSerDe = KafkaSourceDemo.mutiTopicKafkaConsumerSerDe(env);
//        env.addSource(kafkaConsumerSerDe).print();
        env.execute();

    }

    /**
     * 默认模式
     *
     * @param env   执行环境
     * @param topic kafka 主题
     * @return
     */
    public static FlinkKafkaConsumer createKafkaConsumer(StreamExecutionEnvironment env, String topic) {
        //配置信息
        Properties prop = new Properties();
        //zk 地址
        prop.setProperty("bootstrap.servers", "192.168.1.101:9092");
        //消费者组
        prop.setProperty("group.id", "consumer-group");
        prop.setProperty("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        prop.setProperty("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        prop.setProperty("auto.offset.reset", "earliest");

        FlinkKafkaConsumer<String> stringFlinkKafkaConsumer =
                new FlinkKafkaConsumer<String>(topic, new SimpleStringSchema(), prop);
        //自动提交 offset
        stringFlinkKafkaConsumer.setCommitOffsetsOnCheckpoints(true);
        return stringFlinkKafkaConsumer;
    }

    /**
     * 设置消费位置
     *
     * @param env
     * @param topic
     * @param sm
     * @return
     */
    public static FlinkKafkaConsumer createKafkaConsumerSerDe(StreamExecutionEnvironment env, String topic, StartupMode sm) {
        //配置信息
        Properties prop = new Properties();
        //zk 地址
        prop.setProperty("bootstrap.servers", "192.168.1.101:9092");
        //消费者组
        prop.setProperty("group.id", "consumer-group");
        prop.setProperty("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        prop.setProperty("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        prop.setProperty("auto.offset.reset", "latest");

        FlinkKafkaConsumer<String> stringFlinkKafkaConsumer = new FlinkKafkaConsumer<>(topic, new SimpleStringSchema(), prop);
        //设置kafka消费位置
        if (sm.equals(StartupMode.EARLIEST)) {
            stringFlinkKafkaConsumer.setStartFromEarliest();
        } else if (sm.equals(StartupMode.LATEST)) {
            stringFlinkKafkaConsumer.setStartFromLatest();
        }

        //自动提交 offset
        stringFlinkKafkaConsumer.setCommitOffsetsOnCheckpoints(true);
        return stringFlinkKafkaConsumer;
    }

    public static FlinkKafkaConsumer mutiTopicKafkaConsumerSerDe(StreamExecutionEnvironment env) {
        //配置信息
        Properties prop = new Properties();
        //zk 地址
        prop.setProperty("bootstrap.servers", "hadoop103:9092");
        //消费者组
        prop.setProperty("group.id", "consumer-group");
        prop.setProperty("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        prop.setProperty("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        prop.setProperty("auto.offset.reset", "latest");

        LinkedList<Object> topics = new LinkedList<>();
        topics.add("first");
//        topics.add("tbg");

        FlinkKafkaConsumer flinkKafkaConsumer = new FlinkKafkaConsumer(topics, new SimpleStringSchema(), prop);


        //自动提交 offset
        flinkKafkaConsumer.setCommitOffsetsOnCheckpoints(true);
        return flinkKafkaConsumer;
    }
}
