package com.ysy.test;

/**
 * https://blog.csdn.net/qq_42761569/article/details/135558221
 * kafka-kerberos 配置
 */

import com.ysy.producer.KafkaProducerTest;
import org.apache.kafka.clients.producer.KafkaProducer;

import java.io.*;
import java.util.Properties;

public class PeopleTestKafka {

    public static void main(String[] args) {
        // read file
        String path = "D:\\ALinux\\data\\archive\\finalized_data.json";
        String s = readFile(path);
        // 转换成list
        String[] handle = KafkaProducerTest.handle(s);

        // kafka instance
        KafkaProducer producer = newKP();
    }

    public static KafkaProducer newKP(){
        System.setProperty("java.security.auth.login.config", "/opt/Bigdata/client/Kafka/Kafka/kafka/config/kafka-client-jaas.conf");
        System.setProperty("java.security.krb5.conf", "/etc/krb5.conf");

        Properties props = new Properties();
        props.put("bootstrap.servers", "192.168.1.101:9092");
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        KafkaProducer<String, String> producer = new KafkaProducer<>(props);

        return producer;
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
