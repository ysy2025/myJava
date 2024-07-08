package com.ysy.es;

import com.ysy.utils.AESEncryptUtils;
import com.ysy.utils.ConfigReader;
import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.nio.client.HttpAsyncClientBuilder;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.elasticsearch.client.RestHighLevelClient;

import java.io.IOException;

public class Client {

    public static RestHighLevelClient getClient() throws Exception {
        // config reader and parser
        String path = "config.properties";
        ConfigReader configReader = new ConfigReader(path);

        // decoder
        AESEncryptUtils encryptUtils = new AESEncryptUtils();

        // read config
        String ip = encryptUtils.decrypt(configReader.readProperties("ip"));
        int port = Integer.valueOf(encryptUtils.decrypt(configReader.readProperties("port")));
        String user = encryptUtils.decrypt(configReader.readProperties("user"));
        String pwd = encryptUtils.decrypt(configReader.readProperties("pwd"));

        System.out.println(ip);
        System.out.println(port);
        System.out.println(user);
        System.out.println(pwd);

        // host and client
        HttpHost host = new HttpHost(ip, port, "http");
        RestHighLevelClient client = new RestHighLevelClient(
                RestClient.builder(host)
        );
        return client;
    }

    public static RestHighLevelClient buildClient() throws Exception {
        RestHighLevelClient restHighLevelClient = null;

        // config reader and parser
        String path = "config.properties";
        ConfigReader configReader = new ConfigReader(path);

        // decoder
        AESEncryptUtils encryptUtils = new AESEncryptUtils();

        // read config
        String ip = encryptUtils.decrypt(configReader.readProperties("ip"));
        int port = Integer.valueOf(encryptUtils.decrypt(configReader.readProperties("port")));
        String user = encryptUtils.decrypt(configReader.readProperties("user"));

        String pwd = encryptUtils.decrypt(configReader.readProperties("pwd"));
        

        System.out.println(ip);
        System.out.println(port);
        System.out.println(user);
        System.out.println(pwd);

        try {
            final CredentialsProvider credentialsProvider = new BasicCredentialsProvider();
            credentialsProvider.setCredentials(AuthScope.ANY,
                    new UsernamePasswordCredentials(user, pwd));

            restHighLevelClient = new RestHighLevelClient(
                    RestClient.builder(new HttpHost(ip, port))
                            .setHttpClientConfigCallback(new RestClientBuilder.HttpClientConfigCallback() {
                                @Override
                                public HttpAsyncClientBuilder customizeHttpClient(HttpAsyncClientBuilder httpClientBuilder) {
                                    httpClientBuilder.disableAuthCaching();
                                    return httpClientBuilder.setDefaultCredentialsProvider(credentialsProvider);
                                }
                            }));
        } catch (Exception e) {
            e.printStackTrace();
            //LOG.error(e.getMessage());
        }
        return restHighLevelClient;
    }
}
