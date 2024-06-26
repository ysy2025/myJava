package com.ysy.myDoris;

import org.apache.flink.api.common.functions.FlatMapFunction;
import org.apache.flink.api.java.DataSet;
import org.apache.flink.api.java.ExecutionEnvironment;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.util.Collector;


public class HelloWorld {

    public static void main(String[] args) throws Exception {
        // 创建执行环境
        ExecutionEnvironment env = ExecutionEnvironment.getExecutionEnvironment();

        // read file
        String inputPath = "D:\\学习\\GitCode\\myJava\\myJava02\\myFlink\\src\\main\\resources\\demo.txt";
        DataSet<String> inputDataSet = env.readTextFile(inputPath);

        // 空格分词打散之后，对单词进行 groupby 分组，然后用 sum 进行聚合
        DataSet<Tuple2<String, Integer>> wordCountDataSet =
                inputDataSet.flatMap(new MyFlatMapper())
                        .groupBy(0)
                        .sum(1);
        // 打印输出
        wordCountDataSet.print();


    }

    public static class MyFlatMapper implements FlatMapFunction<String, Tuple2<String,
                Integer>> {
        public void flatMap(String value, Collector<Tuple2<String, Integer>> out) throws
                Exception {
            String[] words = value.split(" ");
            for (String word : words) {
                out.collect(new Tuple2<String, Integer>(word, Integer.valueOf(1)));
            }
        }
    }
}
