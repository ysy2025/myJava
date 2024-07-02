//package com.ysy.myDoris;
//
//import org.apache.doris.flink.cfg.DorisExecutionOptions;
//import org.apache.doris.flink.cfg.DorisOptions;
//import org.apache.doris.flink.cfg.DorisReadOptions;
//import org.apache.doris.flink.sink.DorisSink;
//import org.apache.doris.flink.sink.batch.DorisBatchSink;
//import org.apache.doris.flink.sink.writer.serializer.RowDataSerializer;
//import org.apache.doris.flink.sink.writer.serializer.SimpleStringSerializer;
//import org.apache.flink.api.common.eventtime.WatermarkStrategy;
//import org.apache.flink.api.connector.sink.Sink;
//import org.apache.flink.api.java.utils.ParameterTool;
//import org.apache.flink.connector.file.src.FileSource;
//import org.apache.flink.connector.file.src.reader.TextLineInputFormat;
//import org.apache.flink.core.fs.Path;
//import org.apache.flink.streaming.api.datastream.DataStream;
//import org.apache.flink.streaming.api.datastream.DataStreamSink;
//import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
//import org.apache.flink.streaming.api.functions.sink.SinkFunction;
//import org.apache.flink.table.api.DataTypes;
//import org.apache.flink.table.data.RowData;
//import org.apache.flink.table.types.DataType;
//
//import java.util.Properties;
//
///*
//https://blog.csdn.net/bigdatawcq/article/details/139253060
//
// */
//
//public class CSV2DorisDemo {
//
//    public static void main(String[] args) throws Exception {
//        // env
//        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
//
//        // file
//        String path = "D:\\ALinux\\data\\archive9\\test.csv";
//
//        //file source
//        final FileSource<String> source =
//                FileSource.forRecordStreamFormat(new TextLineInputFormat(), new Path(path))
//                        .build();
//
//        // file source -> datastream
//        final DataStream<String> stream =
//                env.fromSource(source, WatermarkStrategy.noWatermarks(), "file-source");
//        stream.print();
//
//        // 获得Doris Sink
////        DorisSink<RowData> taskDetailSink = getTaskDetailSink();
//
//        DorisBatchSink sink = getSink();
//
//        // 数据分流写入到doris
////        stream.addSink((SinkFunction<String>) taskDetailSink);
//        stream.sinkTo(sink);
//
//        env.execute("newbie_task_online");
//
//        env.execute();
//    }
//
//    private static DorisBatchSink getSink(){
//
//        // DorisOptions
//        DorisOptions dorisOptions = DorisOptions.builder()
//                .setFenodes("192.168.1.100:8030")
//                .setTableIdentifier("doris.transaction_20240701")
//                .setUsername("root")
//                .setPassword("").build();
//
//        // DorisReadOptions
//        DorisReadOptions dorisReadOptions = DorisReadOptions.builder().build();
//
//        // DorisExecutionOptions
//        Properties dproperties = new Properties();
////        properties.put("format", "json"); //默认为json格式插入数据
////        dproperties.put("read_json_by_line", "true");
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
//        return builder.build();
//
//    }
//    private static DorisSink<RowData> getTaskDetailSink() {
//        // doris的连接地址
//        Object Constant;
//        String fenodes = "192.168.1.100:8030";
//        // doris的表
//        String dorisDetailTable = "doris.temp_20240701";
//        // doris连接用户
//        String dorisUser = "root";
//        // doris连接密码
//        String dorisPwd = "";
//
//        DorisSink.Builder<RowData> builder = DorisSink.builder();
//        DorisOptions.Builder optionsBuilder = DorisOptions.builder();
//        optionsBuilder.setFenodes(fenodes)
//                .setTableIdentifier(dorisDetailTable)
//                .setUsername(dorisUser)
//                .setPassword(dorisPwd);
//
//        Properties properties = new Properties();
//        // 指定处理json类型数据
//        properties.setProperty("format", "json");
//        properties.setProperty("read_json_by_line", "true");
//        DorisExecutionOptions.Builder executionBuilder = DorisExecutionOptions.builder();
//        // 这里设定的prefix，每个Flink应用都不能相同
//        executionBuilder.setLabelPrefix("label-task-detail-test2")
//                .setDeletable(false)
//                .setStreamLoadProp(properties);
//
//        // 指定要落入的doris表的字段
//        String[] fields = {"Id", "Temperature", "Humidity", "Wind", "Precipitation", "Cloud Cover",
//                "Atmospheric Pressure", "UV Index", "Season", "Visibility", "Location", "Weather Type"};
//        // 指定doris表字段类型所对应的Flink的类型
//        DataType[] types = {DataTypes.DATE(),
//                DataTypes.INT(),
//                DataTypes.DOUBLE(),
//                DataTypes.INT(),
//                DataTypes.DOUBLE(),
//                DataTypes.DOUBLE(),
//                DataTypes.STRING(),
//                DataTypes.DOUBLE(),
//                DataTypes.INT(),
//                DataTypes.STRING(),
//                DataTypes.DOUBLE(),
//                DataTypes.STRING(),
//                DataTypes.STRING()};
//
//        // 构建sink
//        builder.setDorisReadOptions(DorisReadOptions.builder().build())
//                .setDorisExecutionOptions(executionBuilder.build())
//                .setSerializer(RowDataSerializer.builder()
//                        .setFieldNames(fields)
//                        .setType("json")
//                        .setFieldType(types).build())
//                .setDorisOptions(optionsBuilder.build());
//
//        return builder.build();
//    }
//}
