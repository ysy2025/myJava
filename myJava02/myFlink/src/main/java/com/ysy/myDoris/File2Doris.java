//package com.ysy.myDoris;
//
//import org.apache.doris.flink.cfg.DorisExecutionOptions;
//import org.apache.doris.flink.cfg.DorisOptions;
//import org.apache.doris.flink.cfg.DorisReadOptions;
//import org.apache.doris.flink.sink.batch.DorisBatchSink;
//import org.apache.doris.flink.sink.writer.serializer.SimpleStringSerializer;
//import org.apache.flink.api.common.eventtime.WatermarkStrategy;
//import org.apache.flink.connector.file.src.FileSource;
//import org.apache.flink.connector.file.src.reader.TextLineInputFormat;
//import org.apache.flink.core.fs.Path;
//import org.apache.flink.streaming.api.CheckpointingMode;
//import org.apache.flink.streaming.api.datastream.DataStreamSource;
//import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
//
//import java.util.Properties;
//
//
///*
//AppID                         int64
//name                         object
//release_date                 object
//required_age                  int64
//price                       float64
//dlc_count                     int64
//detailed_description         object
//about_the_game               object
//short_description            object
//reviews                      object
//header_image                 object
//website                      object
//support_url                  object
//support_email                object
//windows                        bool
//mac                            bool
//linux                          bool
//metacritic_score              int64
//metacritic_url               object
//achievements                  int64
//recommendations               int64
//notes                        object
//supported_languages          object
//full_audio_languages         object
//packages                     object
//developers                   object
//publishers                   object
//categories                   object
//genres                       object
//screenshots                  object
//movies                       object
//user_score                    int64
//score_rank                  float64
//positive                      int64
//negative                      int64
//estimated_owners             object
//average_playtime_forever      int64
//average_playtime_2weeks       int64
//median_playtime_forever       int64
//median_playtime_2weeks        int64
//peak_ccu                      int64
//tags                         object
//pct_pos_total                 int64
//num_reviews_total             int64
//pct_pos_recent                int64
//num_reviews_recent            int64
//dtype: object
//
//
// */
//public class File2Doris {
//    public static void main(String[] args) throws Exception {
//
//        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
//        env.setParallelism(1);
//
//        // 如果是精准一次，必须开启checkpoint（后续章节介绍）
//        env.enableCheckpointing(2000, CheckpointingMode.EXACTLY_ONCE);
//
//
//        // TODO 从文件读： 新Source架构
//        FileSource<String> fileSource = FileSource
//                .forRecordStreamFormat(
//                        new TextLineInputFormat(),
//                        new Path("D:\\ALinux\\data\\archive6\\games_may2024_cleaned.csv")
//                )
//                .build();
//
//        DataStreamSource<String> filesource = env.fromSource(
//                fileSource, WatermarkStrategy.noWatermarks(), "filesource");
//
//
//        // DorisOptions
//        DorisOptions dorisOptions = DorisOptions.builder()
//                .setFenodes("192.168.1.100:8030")
//                .setTableIdentifier("doris.steam_20240701")
//                .setUsername("root")
//                .setPassword("").build();
//
//        // DorisReadOptions
//        DorisReadOptions dorisReadOptions = DorisReadOptions.builder().build();
//
//        // DorisExecutionOptions
//        Properties dproperties = new Properties();
////        properties.put("format", "json"); //默认为json格式插入数据
//        dproperties.put("read_json_by_line", "true");
//        dproperties.put("column_separator", ",");
//
//        DorisExecutionOptions dorisExecutionOptions = DorisExecutionOptions
//                .builder().setStreamLoadProp(dproperties)
//                .setBatchMode(true)
//                .setMaxRetries(3)
//                .setDeletable(true)
//                .setBufferFlushMaxRows(5000)
//                .setBufferFlushIntervalMs(5000L).build();
//
//        // builder
//        DorisBatchSink.Builder<String> builder = DorisBatchSink.builder();
//
//        builder.setDorisReadOptions(dorisReadOptions)
//                .setDorisExecutionOptions(dorisExecutionOptions)
//                .setSerializer(new SimpleStringSerializer()) //serialize according to string
//                .setDorisOptions(dorisOptions);
//
//
//        filesource.sinkTo(builder.build()).setParallelism(1);
//
//        env.execute();
//
//    }
//}
