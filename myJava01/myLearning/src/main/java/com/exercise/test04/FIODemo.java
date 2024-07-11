package com.exercise.test04;
import java.io.*;

public class FIODemo {

    public static void main(String[] args) throws Exception{

        // root dir
        String rootPath = System.getProperty("user.dir");
        //          System.out.println(rootPath);

        // relative dir
        String inputPath = "myLearning/src/main/resources/installClient.log";
        String input = (rootPath + "/" + inputPath).replace("/", "\\");

        // file 设置
        File f=new File (input);

        // fio 读取
        byte[] bytes=new byte[512];
        FileInputStream fis =new FileInputStream(f);//创建文件文件字节输入流

        int rs=0;
        System.out.println("The content of Example is :");
        rs=fis.read(bytes,0,512);
        String s=new String (bytes,0,rs);
        System.out.println(s);
        System.out.println(bytes.length);
        System.out.println(rs);
        System.out.println(fis.read(bytes, 0, 512));
        System.out.println(new String(bytes, 0, rs));

//        while ((rs=fis.read(bytes,0,512))>0){
//            //再循环中读取输入流的数据
//            String s=new String (bytes,0,rs);
//            System.out.println(s);
//            System.out.println("===============");
//            System.out.println(bytes.length);
//            System.out.println(rs);
//            System.out.println(fis.read(bytes, 0, 512));
//        }
        fis.close();

    }
}
