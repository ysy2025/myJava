package org.ysy.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "com.didispace")
public class PostInfo {
    private String title;
    private String content;
}
