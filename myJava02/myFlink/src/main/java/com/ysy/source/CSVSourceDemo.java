package com.ysy.source;

import org.apache.flink.api.common.eventtime.WatermarkStrategy;
import org.apache.flink.connector.file.src.FileSource;
import org.apache.flink.connector.file.src.reader.TextLineInputFormat;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.core.fs.Path;

public class CSVSourceDemo {

    public static void main(String[] args) throws Exception {

        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();

        String path = "D:\\ALinux\\data\\archive9\\df.csv";

        final FileSource<String> source =
                FileSource.forRecordStreamFormat(new TextLineInputFormat(),new Path(path))
                        .build();

        final DataStream<String> stream =
                env.fromSource(source, WatermarkStrategy.noWatermarks(), "file-source");
        stream.print();

        env.execute();
    }
}
