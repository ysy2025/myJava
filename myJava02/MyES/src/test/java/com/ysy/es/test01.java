package com.ysy.es;

import com.ysy.utils.AESEncryptUtils;
import com.ysy.utils.ConfigReader;
import org.elasticsearch.client.RestHighLevelClient;
import org.junit.Test;

import java.io.IOException;

public class test01 {

    @Test
    public void aesTest01(){
        AESEncryptUtils encryptUtils = new AESEncryptUtils();



    }

    @Test
    public void configReaderTest01() throws Exception {
        String path = "config.properties";
        ConfigReader configReader = new ConfigReader(path);
        String property = "ip";
        String ip = configReader.readProperties(property);
        System.out.println(ip);
    }

    @Test
    public void clientTest01() throws Exception {
        RestHighLevelClient client = Client.getClient();
        client.close();
    }

    @Test
    public void clientTest02() throws Exception {
        RestHighLevelClient client = Client.buildClient();
    }
}
