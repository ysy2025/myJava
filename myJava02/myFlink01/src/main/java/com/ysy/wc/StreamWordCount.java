package com.ysy.wc;

import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.api.java.utils.ParameterTool;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.datastream.SingleOutputStreamOperator;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

/**
 * 流处理
 */
public class StreamWordCount {
    public static void main(String[] args) throws Exception {
        // 创建环境
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();

//        env.setParallelism(4);


        // 读取文件
//        String path = "E:\\GitHub\\myJava\\myJava02\\myFlink01\\src\\main\\resources\\hello.txt";
//        DataStream<String> input = env.readTextFile(path);

        // 用parameter tool 从程序启动参数中提取配置项
        ParameterTool parameterTool = ParameterTool.fromArgs(args);

        String host = parameterTool.get("host");
        int port = parameterTool.getInt("port");

        System.out.println("host is " + host + " port is " + port);

        // 流式数据 从socket文本流读取数据
//        DataStream<String> input = env.socketTextStream("192.168.10.102", 7777);
        DataStream<String> input = env.socketTextStream(host, port);


        // 转件操作;基于数据流进行转换计算
        SingleOutputStreamOperator<Tuple2<String, Integer>> out = input.flatMap(new WordCount.myFlatMapper()).keyBy(0).sum(1);

        out.print();

        // 任务开始执行
        env.execute();
    }
}
