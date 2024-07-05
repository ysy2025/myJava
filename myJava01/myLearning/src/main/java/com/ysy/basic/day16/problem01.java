package com.ysy.basic.day16;

/*
* 异常的处理
*
* Error和Exception
* Error是java虚拟机都无法解决的严重问题.JVM内部错误,资源耗尽等严重情况,比如StackOverflowError等
* 一般不编写针对性的代码进行处理.
*
* Exception:因为编程错误或者偶然的外在因素导致的一般性问题,可以使用针对性的代码进行处理.
*   空指针访问
*   文件不存在
*   网络连接中断等
*
* 异常情况出现,怎么办?
*   1,遇到错误就终止
*   2,在开始的时候就预计到,然后提供错误处理
*
* 最理想的处理方法:编译期间;但是有的错误是运行时才会发现(例如÷0,下标越界)
*
* 分为非受检异常(运行时才能发现),受检异常(编译时就能发现)
*
*
* 异常体系结构:
*   java.lang.Throwable
*       java.lang.Error
*           不需要处理,
*       java.lang.Exception
*           编译时异常(checked)
*           运行时异常(unchecked) RuntimeError
 */
public class problem01 {
    public static void main(String[] args) {
        int[] arr = null;
//        System.out.println(arr[3]);
    }
}
