package com.basic.day18.timetest;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Date java.util.Date类
 *      java.sql.Date类
 *      构造器和方法的使用
 *
 * SimpleDateFormat & Calendar
 * 两个操作
 *  格式化:日期-->字符串 format
 *  解析:逆过程,字符串-->日期 parse
 */
public class DateTimeTest {

    @Test
    public void test1(){
        long l = System.currentTimeMillis();
        System.out.println(l);
    }

    @Test
    public void test2(){
        Date date = new Date();
        System.out.println(date.toString());
        System.out.println(date.getTime());
    }

    @Test
    public void test3() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat();

        //格式化日期
        Date date = new Date();
        System.out.println(date);

        String format = sdf.format(date);
        System.out.println(format);

        //解析字符串->日期
        String str = "2011-11-11";
//        Date parse = sdf.parse(str);
//        System.out.println(parse);

        // 默认格式不灵活,用自定义的构造器,带参数的构造器
        String pattern = "";
        SimpleDateFormat sdf1 = new SimpleDateFormat(pattern);
        sdf1.format(date);
        sdf1.parse("zhangsan");


    }

    @Test
    public void test4() throws ParseException {
        String day = "2020-09-08";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        Date parse = sdf.parse(day);

        System.out.println(parse);

        java.sql.Date day2 = new java.sql.Date(parse.getTime());
        System.out.println(day2);
    }
}
