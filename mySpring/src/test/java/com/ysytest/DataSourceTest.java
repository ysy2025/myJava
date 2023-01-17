package com.ysytest;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class DataSourceTest {

    @Test
    public void testDataSource() throws SQLException {
        ClassPathXmlApplicationContext cac = new ClassPathXmlApplicationContext("spring-datasource.xml");

        DruidDataSource dds = (DruidDataSource) cac.getBean(DruidDataSource.class);

        System.out.println(dds.getConnection());

        System.out.println("!!!!!!!!!");
    }
}
