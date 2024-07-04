package com.ysy.producer;

/*
https://www.cnblogs.com/zy-3841/p/15023415.html

[root@hadoop102 kafka]# bin/kafka-topics.sh --zookeeper hadoop102:2181 --list
first
[root@hadoop102 kafka]# bin/kafka-topics.sh --bootstrap-server hadoop102:9092 --list
first

 */

import com.alibaba.fastjson.JSONObject;
import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;

import java.io.IOException;

public class KafkaProducerTest2 {

    public static void main(String[] args) throws IOException, InterruptedException {
        // read file
//        String path = "D:\\ALinux\\data\\archive\\finalized_data.json";
        String path = "D:\\ALinux\\data\\archive5\\train.json";

        JsonReader jsonReader = new JsonReader();
        String s = jsonReader.readFile1Line(path);

        // 转换成list
        Json2List json2List = new Json2List();
        String[] handle = json2List.handle(s, "},{", "},,{", ",,");

        // kafka instance
        KP kp = new KP();
        KafkaProducer producer = kp.newKP();

//        for (i = 0; i < handle.length; i++){
        // 循环输入到kafka中
        for (int i = 0; i < handle.length; i++){
            System.out.println(handle[i]);

            JSONObject root = new JSONObject().parseObject(handle[i]);// 将json格式的字符串转换成json
            System.out.println(root);

            System.out.println(root.getShort("age"));

            ProducerRecord<String, String> record = new ProducerRecord<>("first", Integer.valueOf(0), String.valueOf(i), handle[i]);

            producer.send(record, new Callback() {
                @Override
                public void onCompletion(RecordMetadata recordMetadata, Exception e) {
                    if (e == null){
                        System.out.println("主题是 " + recordMetadata.topic() + "分区是 " + recordMetadata.partition());

                    }else {
                        e.printStackTrace();
                    }
                }
            });

            Thread.sleep(2);
        }

        // close producer
        producer.close();

    }

}
