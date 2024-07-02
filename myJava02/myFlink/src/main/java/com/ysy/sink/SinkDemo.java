package com.ysy.sink;

import org.apache.flink.api.common.eventtime.WatermarkStrategy;
import org.apache.flink.api.common.serialization.SimpleStringEncoder;
import org.apache.flink.connector.file.sink.FileSink;
import org.apache.flink.connector.file.src.FileSource;
import org.apache.flink.connector.file.src.reader.TextLineInputFormat;
import org.apache.flink.core.fs.Path;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

public class SinkDemo {
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

        // sink
        String relativeSinkPath = "myFlink/src/main/resources";
        String absSinkPath = (rootPath + "/" + relativeSinkPath).replace("/", "\\");
        Path sinkPath = new Path(absSinkPath);

        FileSink sink = FileSink.forRowFormat(
                sinkPath, new SimpleStringEncoder<>("UTF-8")).build();
        // 输出到文件
        source.sinkTo(sink);

        source.print();
        env.execute();
    }
}
