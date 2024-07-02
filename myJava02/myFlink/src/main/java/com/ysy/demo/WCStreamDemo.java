package com.ysy.demo;

import org.apache.flink.api.common.functions.FlatMapFunction;
import org.apache.flink.api.java.functions.KeySelector;
import org.apache.flink.api.java.tuple.Tuple;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.datastream.KeyedStream;
import org.apache.flink.streaming.api.datastream.SingleOutputStreamOperator;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.util.Collector;

public class WCStreamDemo {
    public static void main(String[] args) throws Exception {
        // 创建执行环境
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();

        // 读取数据
        String path = "D:\\学习\\GitCode\\myJava\\myJava02\\myFlink\\src\\main\\resources\\demo.txt";
        DataStreamSource<String> source = env.readTextFile(path);

        // 处理数据
        SingleOutputStreamOperator<Tuple2<String, Integer>> wordsAndOne = source.flatMap(
                new FlatMapFunction<String, Tuple2<String, Integer>>() {
                    @Override
                    public void flatMap(String s, Collector<Tuple2<String, Integer>> collector) throws Exception {
                        // 切分
                        String[] words = s.split(" ");

                        // 转换
                        for (String word : words) {
                            Tuple2<String, Integer> wordAndOne = Tuple2.of(word, 1);

                            // 发送
                            collector.collect(wordAndOne);
                        }
                    }
                }
        );

        // 分组
        KeyedStream<Tuple2<String, Integer>, String> wordsAndOneKS = wordsAndOne.keyBy(
                new KeySelector<Tuple2<String, Integer>, String>() {
                    @Override
                    public String getKey(Tuple2<String, Integer> value) throws Exception {
                        return value.f0;
                    }
                }
        );

        SingleOutputStreamOperator<Tuple2<String, Integer>> sum = wordsAndOneKS.sum(1);

        // 输出数据
        sum.print();

        // 执行
        env.execute();
    }
}
