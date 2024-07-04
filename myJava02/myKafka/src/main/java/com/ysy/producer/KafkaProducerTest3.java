package com.ysy.producer;

import com.alibaba.fastjson.JSONObject;
import com.ysy.util.Json2List;
import com.ysy.util.JsonReader;
import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;

public class KafkaProducerTest3 {

    public static void main(String[] args) throws Exception {

        // path
        String path = "D:\\ALinux\\data\\archive5\\test1line.json";

        // reader instance
        JsonReader jsonReader = new JsonReader();
        String s = jsonReader.readFile1Line(path);
//        System.out.println(s);

//        // kafka instance
        KP kp = new KP();
        KafkaProducer producer = kp.newKP();

        // 转换成list
        Json2List json2List = new Json2List();
        String[] handle = json2List.handle(s, "}, {", "},,{", ",,");
//
        for (int i = 0; i < handle.length; i++){
            String temp = handle[i];
//            System.out.println(temp);

            JSONObject root = new JSONObject().parseObject(temp);// 将json格式的字符串转换成json
//            System.out.println(root);
            System.out.println(root.getShort("Age"));

//            ProducerRecord<String, String> record = new ProducerRecord<>("first", 0, i, temp);

            ProducerRecord<String, String> record = new ProducerRecord<String, String>("first", Integer.valueOf(0), String.valueOf(i), temp);

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

            Thread.sleep(200);
        }

        // close producer
        producer.close();
    }
}
