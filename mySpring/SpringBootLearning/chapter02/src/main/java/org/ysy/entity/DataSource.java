package org.ysy.entity;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Slf4j
@Data
//@ConfigurationProperties(prefix = "spring.datasource")
//@ConfigurationProperties(prefix = "datasource.password")
@ConfigurationProperties(prefix = "datasource")
public class DataSource {

//    @Value("${datasource.password}")
//    private String word;
    private String password;

}
