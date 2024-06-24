package org.ysy.lease.common.minio;

import io.minio.MinioClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

//@EnableConfigurationProperties(MinioProperties.class)
@Configuration
@ConfigurationPropertiesScan("org.ysy.lease.common.minio")
public class MinioConfiguration {

    // 第一种映射方式
//    @Value("${minio.endpoint}")
//    private String endpoint;

    // 第二种映射
    @Autowired
    private MinioProperties minioProperties;

    public MinioClient minioClient(){
        return MinioClient.builder().endpoint(
                minioProperties.getEndpoint()).credentials(minioProperties.getAccessKey(),
                                                            minioProperties.getSecretKey()).build();


    }
}
