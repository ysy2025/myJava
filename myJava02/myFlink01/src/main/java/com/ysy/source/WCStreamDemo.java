package com.ysy.source;

import org.apache.flink.api.java.operators.DataSource;
import org.apache.flink.streaming.api.scala.DataStream;
import org.apache.flink.streaming.api.scala.StreamExecutionEnvironment;

public class WCStreamDemo {
    public static void main(String[] args) {
        // 执行环境
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();

        // 读取数据
        DataStream<String> source = env.readTextFile("E:\\MyGitHub\\myJava\\myJava02\\myFlink01\\src\\main\\java\\com\\ysy\\input\\word.txt");

        // 切分处理
        //分组
        // 聚合
        // 输出
    }
}
