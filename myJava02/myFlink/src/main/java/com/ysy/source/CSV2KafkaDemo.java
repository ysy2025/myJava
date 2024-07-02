//package com.ysy.myDoris;
//
//import org.apache.flink.api.common.eventtime.WatermarkStrategy;
//import org.apache.flink.api.common.serialization.SimpleStringSchema;
//import org.apache.flink.connector.base.DeliveryGuarantee;
//import org.apache.flink.connector.file.src.FileSource;
//import org.apache.flink.connector.file.src.reader.TextLineInputFormat;
//import org.apache.flink.connector.kafka.sink.KafkaRecordSerializationSchema;
//import org.apache.flink.connector.kafka.sink.KafkaSink;
//import org.apache.flink.core.fs.Path;
//import org.apache.flink.streaming.api.datastream.DataStream;
//import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
//import org.apache.kafka.clients.producer.ProducerConfig;
//
//public class CSV2KafkaDemo {
//
//    public static void main(String[] args) throws Exception {
//        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
//        String path = "D:\\ALinux\\data\\archive9\\test.csv";
//        final FileSource<String> source =
//                FileSource.forRecordStreamFormat(new TextLineInputFormat(),new Path(path))
//                        .build();
//        final DataStream<String> stream =
//                env.fromSource(source, WatermarkStrategy.noWatermarks(), "file-source");
//        stream.print();
//
//        /**
//         * Kafka Sink:
//         * TODO 注意：如果要使用 精准一次 写入Kafka，需要满足以下条件，缺一不可
//         * 1、开启checkpoint（后续介绍）
//         * 2、设置事务前缀
//         * 3、设置事务超时时间：   checkpoint间隔 <  事务超时时间  < max的15分钟
//         */
//        KafkaSink<String> kafkaSink = KafkaSink.<String>builder()
//                // 指定 kafka 的地址和端口
//                .setBootstrapServers("hadoop101:9092")
//                // 指定序列化器：指定Topic名称、具体的序列化
//                .setRecordSerializer(
//                        KafkaRecordSerializationSchema.<String>builder()
//                                .setTopic("first")
//                                .setValueSerializationSchema(new SimpleStringSchema())
//                                .build()
//                )
//                // 写到kafka的一致性级别： 精准一次、至少一次
//                .setDeliveryGuarantee(DeliveryGuarantee.EXACTLY_ONCE)
//                // 如果是精准一次，必须设置 事务的前缀
//                .setTransactionalIdPrefix("atguigu-")
//                // 如果是精准一次，必须设置 事务超时时间: 大于checkpoint间隔，小于 max 15分钟
//                .setProperty(ProducerConfig.TRANSACTION_TIMEOUT_CONFIG, 10*60*1000+"")
//                .build();
//
//
//        stream.sinkTo(kafkaSink);
//
//        /*
//        成功!
//         */
//        env.execute();
//
//    }
//
//}
