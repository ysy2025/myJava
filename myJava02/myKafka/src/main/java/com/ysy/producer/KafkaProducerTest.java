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

import java.io.*;
import java.util.Properties;

public class KafkaProducerTest {

    public static void main(String[] args) throws IOException, InterruptedException {
        // read file
        String path = "D:\\ALinux\\data\\archive\\finalized_data.json";
        String s = readFile(path);
        // 转换成list
        String[] handle = KafkaProducerTest.handle(s);

        // kafka instance
        KafkaProducer producer = newKP();

//        for (i = 0; i < handle.length; i++){
        // 循环输入到kafka中
        for (int i = 0; i < handle.length; i++){
            System.out.println(handle[i]);

            JSONObject root = new JSONObject().parseObject(handle[i]);// 将json格式的字符串转换成json
            System.out.println(root);

            System.out.println(root.getShort("age"));

            ProducerRecord<String, String> record = new ProducerRecord<>("first", 0, String.valueOf(i), handle[i]);

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

    public static KafkaProducer newKP(){
        Properties props = new Properties();
        props.put("bootstrap.servers", "192.168.1.101:9092");
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        KafkaProducer<String, String> producer = new KafkaProducer<>(props);

        return producer;

    }

    public static String[] handle(String s){
        String temp = s.substring(1,s.length()-1);

        String temp2 = temp.replace("},{", "},,{");

        String[] split = temp2.split(",,");

        return split;
    }

    /**
     * 读取json文件，返回json串
     * @param fileName
     * @return
     */
    public static String readFile(String fileName) {
        String jsonStr = "";
        try {
            File File = new File(fileName);
            FileReader fileReader = new FileReader(File);

            Reader reader = new InputStreamReader(new FileInputStream(File),"utf-8");
            int ch = 0;
            StringBuffer sb = new StringBuffer();
            while ((ch = reader.read()) != -1) {
                sb.append((char) ch);
            }
            fileReader.close();
            reader.close();
            jsonStr = sb.toString();
            return jsonStr;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

}
