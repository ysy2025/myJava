package com.ysy.customer;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;

public class myProducer {
    public static void main(String[] args) {

        // 0.提供配置
        Properties properties = new Properties();

        // 0.1 让配置与虚拟机的kafka产生关系
        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,"192.168.10.104:6667");

        properties.put("retries", 1);

        properties.put("linger.ms", 1);

        // 0.2 指定对应key和value的序列化类
        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

        // 1,创建kafka生产者对象
        KafkaProducer<String, String> myKafkaProducer = new KafkaProducer<String, String>(properties);

        // 2.发送数据
        myKafkaProducer.send(new ProducerRecord<>("first", "zhangsan"));
        for (int i = 0; i < 5; i++) {
            myKafkaProducer.send(new ProducerRecord<>("first", "zhangsan" + i));
            System.out.println("========================hhhhhhhhhhhhhh============================");
        }


        System.out.println("!!!!!!!!!!!!");
        // 3.关闭资源
        myKafkaProducer.close();
        System.out.println("12312312312323423423452345");
    }
}
