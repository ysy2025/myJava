// 执行环境
// 读取数据
// 切分处理
//分组
// 聚合
// 输出


（1）log4j日志格式（此方法暂未用过）
在Flink程序中，可以通过设置日志级别来控制控制台输出的信息。要让控制台只打印结果信息，可以将日志级别设置为ERROR。这样，只有错误信息和print()方法输出的结果会显示在控制台上。

要设置日志级别，请在Flink项目的resources目录下创建一个名为log4j.properties的文件（如果已经存在，请修改相应的配置）。将以下内容添加到log4j.properties文件中：
```
log4j.rootLogger=ERROR, console
log4j.appender.console=org.apache.log4j.ConsoleAppender
log4j.appender.console.layout=org.apache.log4j.PatternLayout
log4j.appender.console.layout.ConversionPattern=%d{yyyy-MM-dd HH:mm:ss} %-5p %c{1}:%L - %m%n
```
————————————————

                            版权声明：本文为博主原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接和本声明。

原文链接：https://blog.csdn.net/m0_61813695/article/details/131638547