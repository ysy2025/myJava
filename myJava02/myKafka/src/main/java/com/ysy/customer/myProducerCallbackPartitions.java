package com.ysy.customer;

import org.apache.kafka.clients.producer.*;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;

/*
带有callback的,回传

 */
public class myProducerCallbackPartitions {
    public static void main(String[] args) {

        // 0.提供配置
        Properties properties = new Properties();

        // 0.1 让配置与虚拟机的kafka产生关系
        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,"192.168.10.102:9092,192.168.10.103:9092");

        System.out.println("========================11111111111111============================");
        // 0.2 指定对应key和value的序列化类
        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        System.out.println("========================222222222222222============================");

        // 1,创建kafka生产者对象
        KafkaProducer<String, String> myKafkaProducer = new KafkaProducer<String, String>(properties);
        System.out.println("========================333333333333333============================");

        // 2.发送数据
        myKafkaProducer.send(new ProducerRecord<>("first", 0, "", "zhangsan"), new Callback() {
            @Override
            public void onCompletion(RecordMetadata recordMetadata, Exception e) {
                if (e == null){
                    System.out.println("主题:" + recordMetadata.topic() + " 分区:" + recordMetadata.partition());
                }else {
                    System.out.println("Fuck U!");
                }
            }
        });
        System.out.println("========================4444444444444444============================");
//        for (int i = 0; i < 5; i++) {
//            myKafkaProducer.send(new ProducerRecord<>("first", "zhangsan" + i));
//            System.out.println("========================hhhhhhhhhhhhhh============================");
//        }


        System.out.println("!!!!!!!!!!!!");
        // 3.关闭资源
        myKafkaProducer.close();
        System.out.println("12312312312323423423452345");
    }
}
