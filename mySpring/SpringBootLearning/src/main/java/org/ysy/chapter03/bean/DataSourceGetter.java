package org.ysy.chapter03.bean;


import org.apache.commons.dbcp2.BasicDataSourceFactory;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import java.util.Properties;

public class DataSourceGetter {

    @Bean(name = "dataSource")
    public DataSource getDataSource(){
        Properties properties = new Properties();
        properties.setProperty("driver","com.mysql.cj.jdbc.Driver");
        properties.setProperty("url", "jdbc:mysql://192.168.1.101:3306/lease?useUnicode=true&characterEncoding=utf-8&useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=GMT%2b8");
        properties.setProperty("username", "root");
        properties.setProperty("password", "123456");

        DataSource dataSource = null;

        try{
            dataSource = BasicDataSourceFactory.createDataSource(properties);
        } catch (Exception e){
            e.printStackTrace();
        }

        return dataSource;
    }

}
