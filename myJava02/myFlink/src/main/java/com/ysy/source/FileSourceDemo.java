package com.ysy.source;

import org.apache.flink.api.common.eventtime.WatermarkStrategy;
import org.apache.flink.connector.file.src.FileSource;
import org.apache.flink.connector.file.src.reader.TextLineInputFormat;
import org.apache.flink.core.fs.Path;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

public class FileSourceDemo {

    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();

        env.setParallelism(1);

        String rootPath = System.getProperty("user.dir");
//        System.out.println(rootPath);
        String relativePath = "myFlink/src/main/resources/demo.txt";
        String path = (rootPath + "/" + relativePath).replace("/", "\\");
//        System.out.println(path);

        // create source
        FileSource<String> fileSource = FileSource.forRecordStreamFormat(
                new TextLineInputFormat(),
                new Path(path)
        ).build();

        DataStreamSource<String> source = env.fromSource(fileSource, WatermarkStrategy.noWatermarks(), "filesource");

        source.print();

        env.execute();

        /*
        source 写法
        env.fromSource(source实现类, watermark, 名字)
         */
    }
}
