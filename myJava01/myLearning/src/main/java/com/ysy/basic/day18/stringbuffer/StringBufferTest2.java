package com.ysy.basic.day18.stringbuffer;

/**
 * 源码分析
 * String str = new String(); // new char[0]
 * String str1 = new String("abc"); // new char[]{}
 *
 * StringBuffer sb1 = new StringBuffer();
 */
public class StringBufferTest2 {
    StringBuffer sb1 = new StringBuffer();//new char[16],底层创建了一个长度是16的数组
}
