package com.ysy.source;

import jdk.nashorn.internal.codegen.types.Type;
import org.apache.flink.api.common.eventtime.WatermarkStrategy;
import org.apache.flink.api.common.typeinfo.Types;
import org.apache.flink.api.connector.source.SourceReaderContext;
import org.apache.flink.api.connector.source.util.ratelimit.RateLimiterStrategy;
import org.apache.flink.connector.datagen.source.DataGeneratorSource;
import org.apache.flink.connector.datagen.source.GeneratorFunction;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

/*
data-gen 用来生成一些测数据进行flink测试
 */
public class DataGenDemo {

    public static void main(String[] args) throws Exception {

        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();

        env.setParallelism(1);

        MyGeneratorFunction myGeneratorFunction = new MyGeneratorFunction();

        /*
        初始化数据生成器
         */
        DataGeneratorSource dataGeneratorSource = new DataGeneratorSource<>(myGeneratorFunction, 10,
                RateLimiterStrategy.perSecond(1), Types.STRING);

        DataStreamSource<Object> streamSource = env.fromSource(dataGeneratorSource, WatermarkStrategy.noWatermarks(), "dataGen");

        streamSource.print();

        env.execute();
    }
}


/*
数据构造器函数
 */
class MyGeneratorFunction<Long, String> implements GeneratorFunction<Long, String>{

    @Override
    public String map(Long aLong) throws Exception {
        return (String) ("Num: " + aLong);
    }
}