package com.exercise.test04;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/*
在写一个需要文本写入的时候使用到了FileWrite写入txt文本，

但是在写完后发现文本是空的；

解决方法：

在每写入一行后，在下一行添加flush（）；
 */
public class FRDemo2 {
    public static void main(String[] args) throws Exception{
        // root dir
        String rootPath = System.getProperty("user.dir");
        //          System.out.println(rootPath);

        // relative dir
        String inputPath = "myLearning/src/main/resources/installClient.log";
        String input = (rootPath + "/" + inputPath).replace("/", "\\");
        //          System.out.println(path);
        String outputPath = "myLearning/src/main/resources/output.log";
        String output = (rootPath + "/" + inputPath).replace("/", "\\");

//        String inputPath = "D:\\学习\\GitCode\\myJava\\myJava01\\myLearning\\src\\main\\java\\com\\exercise\\test04\\input.txt";
//        String outputPath = "D:\\学习\\GitCode\\myJava\\myJava01\\myLearning\\src\\main\\java\\com\\exercise\\test04\\output.txt";

        File inputFile = new File(inputPath);
        File outputFile = new File(outputPath);

        // 创建输入型字符流,用于读取数据
        FileReader fr = new FileReader(inputFile);


        // 输出
        // 默认是覆盖,改成true时,是append模式
//        FileWriter fw = new FileWriter(outputFile);
        FileWriter fw = new FileWriter(outputFile);

        System.out.println(fw.toString());

        fw.write("zhangsan");
        fw.flush();
        // 数据读取
        char[] cbuf = new char[5];
        int len;
        while((len=fr.read(cbuf))!=-1){
//            for (int i = 0; i < cbuf.length; i++){
//                System.out.println(cbuf[i]);
//                fw.write(cbuf[i]);
//            }
            fw.write(cbuf, 0, 5);
            fw.write("zhangsanniubi");
            fw.flush();
        }

//        fw.write("zhangsan");
    }
}
