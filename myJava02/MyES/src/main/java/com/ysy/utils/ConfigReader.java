package com.ysy.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/*
通过 java.util.Properties 来读取
https://blog.csdn.net/qq_37586652/article/details/88556101
 */

public class ConfigReader {

    private Properties properties = new Properties();
    private String path;

    /**
     * 构造器,需要输入path
     * @param path
     * @throws IOException
     */
    public ConfigReader(String path) throws IOException {
        this.path = path;
        // 使用ClassLoader加载properties配置文件生成对应的输入流
        InputStream in = Thread.currentThread().
                getContextClassLoader().
                getResourceAsStream(path);
        // 使用properties对象加载输入流
        this.properties.load(in);
    }

    /**
     * 解析器,获取参数
     * @param property
     * @return 读取config数据
     * @throws Exception
     */
    public String readProperties(String property) throws Exception {
        String driver = properties.getProperty(property);
        return driver;
    }
}
