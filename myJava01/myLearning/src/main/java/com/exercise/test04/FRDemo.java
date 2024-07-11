package com.exercise.test04;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/*
throws 的方式会导致reader没能关闭,所以try-catch更合适
 */
public class FRDemo {

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

        File inputFile = new File(inputPath);
        File outputFile = new File(outputPath);

//        System.out.println(inputFile.list());
//        FileReader fr = new FileReader(inputPath);
//        System.out.println(fr.toString());

        System.out.println(inputFile.getAbsoluteFile().getParent());

        // 创建输入型字符流,用于读取数据
        FileReader fr = new FileReader(inputFile);

        // 读取数据,打印
//        int data = fr.read();
//        while(data != -1){
//            System.out.println((char) data);
//            data = fr.read();
//        }

//        char[] cbuffer = new char[5];
//        int len = fr.read(cbuffer);
//        while(len !=-1){
//            // 遍历数组
//            for (int i = 0; i < cbuffer.length; i++){
//                System.out.println(cbuffer[i]);
//            }
//
//            len = fr.read(cbuffer);
//        }

//        fr.close();

        // 输出
        // 默认是覆盖,改成true时,是append模式
//        FileWriter fw = new FileWriter(outputFile);
        FileWriter fw = new FileWriter(outputFile, true);
//        fw.write("only you !\n");
//        fw.write("hhhhh\n");
//        fw.write("bailongma\n");
//
//        fw.close();

        // 从input->output
        // 前面都准备好了

         // 数据的读入和写出流程
//        int length = (int) inputFile.length();
//        System.out.println(length);
        char[] chars = new char[3250];
        int len = fr.read(chars);
        System.out.println(chars);
//        for (int i = 0; i < chars.length; i++){
//            System.out.println(chars[i]);
//            fw.write(chars[i]);
//        }
        fw.write(chars);


//        int num;
//        //判断文件是否读到末尾
//        while((num=fr.read())!=-1){
//            System.out.println("读取到的内容是："+(char)num);
//            fw.write(num);
//        }

    }
}
