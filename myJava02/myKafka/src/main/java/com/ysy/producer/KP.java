package com.ysy.producer;


import org.apache.kafka.clients.producer.KafkaProducer;

import java.util.Properties;

public class KP {

    public KafkaProducer newKP(){
        Properties props = new Properties();
//        props.put("bootstrap.servers", "10.31.71.125:9092");
        props.put("bootstrap.servers", "hadoop101:9092");
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        KafkaProducer<String, String> producer = new KafkaProducer<>(props);

        return producer;

    }
}
