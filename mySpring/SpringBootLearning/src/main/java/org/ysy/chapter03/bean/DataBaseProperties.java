package org.ysy.chapter03.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
public class DataBaseProperties {

    @Value("${database.driver")
    private String driver = null;

    @Value("${database.url}")
    private String url = null;

//    @Value("${database.username")
    private String username = null;

//    @Value("${database.password")
    private String password = null;


    public void setDriver(String driver) {
        System.out.println(driver);
        this.driver = driver;
    }

    public void setUrl(String url) {
        System.out.println(url);
        this.url = url;
    }

    @Value("${database.username")
    public void setUsername(String username) {
        System.out.println(username);
        this.username = username;
    }

    @Value("${database.password")
    public void setPassword(String password) {
        System.out.println(password);
        this.password = password;
    }
}
