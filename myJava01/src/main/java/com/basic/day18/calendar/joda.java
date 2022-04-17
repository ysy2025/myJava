package com.basic.day18.calendar;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * LocalDate, LocalTime, LocalDateTime
 *
 * LocalDateTime 更常用
 */
public class joda {
    @Test
    public void test1(){
        // LocalDate 的实例化,now()方法获取当前的时间
        LocalDate now = LocalDate.now();
        System.out.println(now);

        // of方法实例化,指定日期,时分秒
        LocalDateTime of = LocalDateTime.of(2020, 1, 1, 1, 1, 1);
        System.out.println(of);

        // get相关操作
        System.out.println(of.getDayOfMonth());

        // with相关操作,设置
        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = localDate.withDayOfMonth(22);
        System.out.println(localDate);
        System.out.println(localDate1);
    }
}
