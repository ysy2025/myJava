package org.ysy.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "com.ysy")
public class FooProperties {

    private String foo;
}
