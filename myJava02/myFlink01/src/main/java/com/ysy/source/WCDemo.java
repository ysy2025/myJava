package com.ysy.source;

import org.apache.flink.api.common.functions.FlatMapFunction;
import org.apache.flink.api.java.ExecutionEnvironment;
import org.apache.flink.api.java.operators.AggregateOperator;
import org.apache.flink.api.java.operators.DataSource;
import org.apache.flink.api.java.operators.FlatMapOperator;
import org.apache.flink.api.java.operators.UnsortedGrouping;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.util.Collector;

public class WCDemo {
    public static void main(String[] args) throws Exception {
        // 执行环境
        ExecutionEnvironment env = ExecutionEnvironment.getExecutionEnvironment();

        // 读取数据
        DataSource<String> source = env.readTextFile("E:\\MyGitHub\\myJava\\myJava02\\myFlink01\\src\\main\\java\\com\\ysy\\input\\word.txt");

        // 切分处理
        FlatMapOperator<String, Tuple2<String, Integer>> wordAndOne = source.flatMap(new FlatMapFunction<String, Tuple2<String, Integer>>() {

            public void flatMap(String value, Collector<Tuple2<String, Integer>> out) throws Exception {
                // 按照空格切分
                String[] words = value.split(" ");
                // 转换为tuple
                for (String word : words) {
                    Tuple2<String, Integer> wordTuple2 = Tuple2.of(word, 1);
                    // 使用collector 发送数据
                    out.collect(wordTuple2);
                }

            }
        });

        //分组
        UnsortedGrouping<Tuple2<String, Integer>> wordAndOneGroupby = wordAndOne.groupBy(0);

        // 聚合
        AggregateOperator<Tuple2<String, Integer>> sum = wordAndOneGroupby.sum(1);

        // 输出
        sum.print();

        // env.exe
//        env.execute();
    }
}
