package com.ysy.sink;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class pathPrint {
    public static void main(String[] args) throws FileNotFoundException {
        String rootPath = System.getProperty("user.dir");
        System.out.println(rootPath);
        String relativePath = "myFlink/src/main/resources/demo.txt";
        String path = (rootPath + "/" + relativePath).replace("/", "\\");
        System.out.println("path is: " + path);
        System.out.println("E:\\MyGitHub\\myJava\\myJava02\\myFlink\\src\\main\\resources\\demo.txt");

        //设定为当前文件夹
        File directory = new File("");
//获取绝对路径
        String absolutePath = directory.getAbsolutePath();
        System.out.println("absolute is " + absolutePath);


    }
}
