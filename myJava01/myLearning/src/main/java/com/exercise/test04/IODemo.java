package com.exercise.test04;

/*
输入输出流
InputStream类是字节输入流的抽象泪,是所有字节输入流的父类
InputStream类的具体层次结构

read 方法 从输入流读取数据的下一个字节
mark 在输入流当前位置放一个标记,readlimit参数告知此输入流在标记位置失效前允许读取的字节数
reset 输入指针返回当前标记杵
skip 跳过输入流上的n个字节,并返回实际跳过的字节数
markSupported 如果当前流支持mark reset 操作就返回true
close 关闭输入流,释放相关资源

inputStream 子类很多
     audio,byteArray,stringBuffer,file,filter,object,sequence,pipein
     fileinput 子类
          buffered, data, pushback

Java 中的字符是unicode 编码,双字节;inputstream是用来处理字节的,并不适合处理字符文本
java为字符文本输入,提供了一套单独的类 Reader; reader不能替换inputstream,只是在处理字符串的时候简化了.

reader类是字符输入流的抽象类,所有字符输入流的实现都是它的子类

Reader的子类很多
     CharArray,buffered,filter,inputstream,piped,string
     其中bufferedreader -> lineNumberreader
     filterreader -> pushbackreader
     inputstreamreader -> filereader

输出流类似
outputstream -> inputstream
writer -> reader

首先看File类

java中对于数据的输入输出是以stream的方式进行的,可以看做数据的流动

按照数据的流向,分为输入流+输出流
按照数据单位分为:
    字节流:以字节为单位,inputstream,outputstrema
    字符流:字符为单位,reader,writer
按照IO流的角色不同,分为:
    节点流:直接从数据源或者目的地读写数据
    处理流:不直接连接到数据源或者目的地,而是连接在已经存在的流中,通过数据处理提供服务

4个抽象基础类派生

 */



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class IODemo {

    public static void main(String[] args) throws Exception {
        // root dir
        String rootPath = System.getProperty("user.dir");
        //          System.out.println(rootPath);

        // relative dir
        String inputPath = "myLearning/src/main/resources/installClient.log";
        String input = (rootPath + "/" + inputPath).replace("/", "\\");
        //          System.out.println(path);
        String outputPath = "myLearning/src/main/resources/output.log";
        String output = (rootPath + "/" + inputPath).replace("/", "\\");

        File inputFile = new File(input);
        File outputFile = new File(outputPath);

//        System.out.println(inputFile.exists());
//        System.out.println(inputFile.getName());
//        System.out.println(inputFile.canRead());
//        System.out.println(inputFile.length());
//        System.out.println(inputFile.lastModified());

        /*
        程序运行中,大部分数据都是在内存中操作的.
        程序结束或者关闭的时候,数据会消失;如果需要永久保存,可以使用input和output,与指定文件建立连接
        将需要保存的数据保存下去

        fio 和 foo 都是用来操作磁盘文件的
        foo 和 fio 对应,提供了基本的文件写入能力
        */

        // 构造方法
        FileInputStream fio = new FileInputStream(inputFile);
        FileOutputStream foo = new FileOutputStream(outputFile);
        System.out.println("The content of Example is :");


//        byte[] bytes = "zhangsan".getBytes();
//        foo.write(bytes);
//        foo.close();

        // fio 读取过程
        System.out.println(inputFile.length());
        // 初始化 bytes list
        byte[] bytes=new byte[(int) inputFile.length()];
        // 将数据写入bytes,并返回长度;根上还是bytes,将数据写入bytes list;输出的也是bytes list
        int rs=fio.read(bytes,0,(int) inputFile.length());
        String s=new String (bytes,0,100);
        System.out.println(s);

        System.out.println("hhhhhhhhhhhhhhh");
        System.out.println(fio.available());

        /*
        第一次读取InputStream对象后，第二次再读取时可能已经到Stream的结尾了（EOFException）或者Stream已经close掉了
        一般我们使用inputStream，需要在一次内处理完所有逻辑。
         */
        // 读取过程
//        初始化bytes
//        byte[] bytes1 = new byte[1024];
////        数据写入bytes1
//        int read = fio.read(bytes1, 0, 1000);
//        System.out.println(new String(bytes1, 0, 100));



    }
}
