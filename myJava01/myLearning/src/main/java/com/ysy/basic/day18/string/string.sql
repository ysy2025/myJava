string 特性
    string类,代表字符串
    string是一个final,代表不可变的字符序列
    字符串是常量,双引号,创建后不能更改
    string对象的字符内容是存储在一个字符数组的value[]中

String的赋值
    字面量
    new 方法
    两种


字符串对象,JVM中如何存储的

String 和基本数据类型的转换
字符串 -> 基本数据类型、包装类
    parseInt(String s)可以将由"数字"字符组成的字符串转换为整型
    基本数据类型,包装类 -> 字符串

String与字符数组转换
    string -> char[]
        public char[] toCharArray();

    char[] -> string
        getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)


    字节数组 -> 字符串
    byte[] -> string
        String(byte[])

    字符串 -> 字节数组
    string -> byte[]
        getBytes(String charsetName)

可变字符串 StringBuffer;StringBuilder
