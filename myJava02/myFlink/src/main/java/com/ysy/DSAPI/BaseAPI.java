package com.ysy.DSAPI;

import com.ysy.bean.WaterSensor;
import org.apache.flink.api.common.functions.FilterFunction;
import org.apache.flink.api.common.functions.FlatMapFunction;
import org.apache.flink.api.common.functions.MapFunction;
import org.apache.flink.api.java.functions.KeySelector;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.datastream.KeyedStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.util.Collector;

public class BaseAPI {

    public static void main(String[] args) throws Exception {

        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.setParallelism(1);

        // datastream
        DataStreamSource<WaterSensor> sensorDS = env.fromElements(
                new WaterSensor("s1", 1L, 1),
                new WaterSensor("s1", 2L, 2),
                new WaterSensor("s2", 2L, 2),
                new WaterSensor("s3", 3L, 3),
                new WaterSensor("s3", 4L, 4)
        );

//        sensorDS.map(new MapFunction<WaterSensor, String>() {
//            @Override
//            public String map(WaterSensor ws) throws Exception {
//                return ws.id;
//            }
//        }).print("map-func");
//
//        sensorDS.filter(new FilterFunction<WaterSensor>() {
//            @Override
//            public boolean filter(WaterSensor ws) throws Exception {
//                return ws.ts > 2L;
//            }
//        }).print("filter-func");
//
//        sensorDS.flatMap(new FlatMapFunction<WaterSensor, String>() {
//            @Override
//            public void flatMap(WaterSensor value, Collector<String> out) throws Exception {
//                if (value.id.equals("sensor_1")) {
//                    out.collect(String.valueOf(value.vc));
//                } else if (value.id.equals("sensor_2")) {
//                    out.collect(String.valueOf(value.ts));
//                    out.collect(String.valueOf(value.vc));
//                }
//            }
//        }).print("flatmap-func");
//
//        sensorDS.flatMap(new MyFlatMapFunction()).print("flatmap-func");

//        sensorDS.keyBy(new KeySelector<WaterSensor, Object>() {
//            @Override
//            public Object getKey(WaterSensor ws) throws Exception {
//                return ws.id;
//            }
//        }).print("keyby-func");

//        KeyedStream<WaterSensor, String> wsKeyedStream = sensorDS.keyBy(e -> e.id);
//        wsKeyedStream.print("keyby-func");

        sensorDS.keyBy(e->e.id).min("vc").print("key-agg");
        env.execute();
    }

    public static class UserMap implements MapFunction<WaterSensor,
            String> {
        @Override
        public String map(WaterSensor e) throws Exception {
            return e.id;
        }
    }

    public static class UserFilter implements
            FilterFunction<WaterSensor> {
        @Override
        public boolean filter(WaterSensor e) throws Exception {
            return e.id.equals("sensor_1");
        }
    }

    public static class MyFlatMapFunction implements FlatMapFunction<WaterSensor, String> {

        @Override
        public void flatMap(WaterSensor value, Collector<String> out) throws Exception {
            if (value.id.equals("sensor_1")) {
                out.collect(java.lang.String.valueOf(value.vc));
            } else if (value.id.equals("sensor_2")) {
                out.collect(java.lang.String.valueOf(value.ts));
                out.collect(java.lang.String.valueOf(value.vc));
            }
        }
    }
}