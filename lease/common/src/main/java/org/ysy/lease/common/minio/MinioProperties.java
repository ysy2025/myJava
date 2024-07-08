package org.ysy.lease.common.minio;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "minio")
public class MinioProperties {

    private String endpoint;

    private String accessKey;

    private String secretKey;

    private String bucketName;

    public String getEndpoint() {
        return "";
    }

    public String getAccessKey() {
        return "";
    }

    public String getSecretKey() {
        return "";
    }
}
