package com.ysy.source;

import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

/*
Flink1.17.1消费kafka3.5中的数据出现问题Failed to get metadata for topics [flink].

https://blog.csdn.net/weixin_46376562/article/details/132433185

解决方法

# server.properties

listeners=PLAINTEXT://0.0.0.0:9092
advertised.listeners=PLAINTEXT://<your_server_ip>:9092

# your_server_ip 用于和使用flink进行连接时配置时相同

注意 集群kafka 每个host的ip不同


flink程序报错ClassNotFoundException: org.apache.flink.streaming.api.scala.StreamExecutionEnvironment
1，把你的flink安装包解压到本机目录下

2，idea上 file --> project  structure -->dependencies

然后点旁边的+号然后指定你解压的flink目录下的lib为jar包目录

然后再运行程序，如果还不行

打开你的pom文件

把下面这个依赖的scope这一行注释掉，应该就可以了

<dependency>
        <groupId>org.apache.flink</groupId>
        <artifactId>flink-streaming-java_2.11</artifactId>
        <version>${flink.version}</version>
        <!--<scope>provided</scope>-->
    </dependency>

 */
public class KafkaSourceDemo2 {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();

        env.execute();
    }
}
