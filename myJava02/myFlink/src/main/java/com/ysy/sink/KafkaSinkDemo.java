package com.ysy.sink;

import org.apache.flink.api.common.eventtime.WatermarkStrategy;
import org.apache.flink.api.common.serialization.SimpleStringSchema;
import org.apache.flink.connector.base.DeliveryGuarantee;
import org.apache.flink.connector.file.src.FileSource;
import org.apache.flink.connector.file.src.reader.TextLineInputFormat;
import org.apache.flink.connector.kafka.sink.KafkaRecordSerializationSchema;
import org.apache.flink.connector.kafka.sink.KafkaSink;
import org.apache.flink.core.fs.Path;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

import static org.apache.flink.streaming.api.functions.sink.filesystem.rollingpolicies.OnCheckpointRollingPolicy.build;

public class KafkaSinkDemo {
    public static void main(String[] args) throws Exception {

        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();

        env.setParallelism(1);

        String rootPath = System.getProperty("user.dir");
//        System.out.println(rootPath);
        String relativePath = "myFlink/src/main/resources/demo.txt";
        String absPath = (rootPath + "/" + relativePath).replace("/", "\\");
//        System.out.println(path);

        // create source
        FileSource<String> fileSource = FileSource.forRecordStreamFormat(
                new TextLineInputFormat(),
                new Path(absPath)
        ).build();

        DataStreamSource<String> source = env.fromSource(fileSource, WatermarkStrategy.noWatermarks(), "filesource");

        KafkaSink<String> kafkaSink = KafkaSink.<String>builder()
                .setBootstrapServers("hadoop101:9092, hadoop102:9092, hadoop103:9092")
                .setRecordSerializer(KafkaRecordSerializationSchema.<String>builder()
                        .setTopic("first")
                        .setValueSerializationSchema(new SimpleStringSchema())
                        .build()
                )
                .setDeliveryGuarantee(DeliveryGuarantee.AT_LEAST_ONCE)
                .setTransactionalIdPrefix("test-")
                .build();

        source.sinkTo(kafkaSink);

        env.execute();

    }
}
