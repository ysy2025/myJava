package com.ysy.wc;


import org.apache.flink.api.common.functions.FlatMapFunction;
import org.apache.flink.api.java.DataSet;
import org.apache.flink.api.java.ExecutionEnvironment;
import org.apache.flink.api.java.operators.AggregateOperator;
import org.apache.flink.api.java.operators.DataSource;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.util.Collector;

/**
 * 批处理示例
 */
public class WordCount {
    public static void main(String[] args) throws Exception {

        // 1 创建执行环境
        ExecutionEnvironment env = ExecutionEnvironment.getExecutionEnvironment();
        String path = "E:\\GitHub\\myJava\\myJava02\\myFlink01\\src\\main\\resources\\hello.txt";
        DataSet<String> input = env.readTextFile(path);

        // 2 对数据集进行处理 按照空格分词转换成 (word,1)
        DataSet<Tuple2<String, Integer>> res = input.flatMap(new myFlatMapper())
                .groupBy(0) // 按照第一个位置的word进行分组
                .sum(1);// 按照第二个位置的数值进行汇聚

        res.print();
    }

    public static class myFlatMapper implements FlatMapFunction<String, Tuple2<String, Integer>>{

        public void flatMap(String s, Collector<Tuple2<String, Integer>> collector) throws Exception {
            // 按照空格分词
            String[] words = s.split(" ");

            // 遍历word,包装成二元组输出
            for (String word : words){
                collector.collect(new Tuple2<String, Integer>(word, 1));
            }
        }
    }
}
