package org.ysy;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.nio.charset.Charset;

//自动配置类ThymeleafProperties
@ConfigurationProperties( prefix = "spring.thymeleaf" )
public class ThymeleafProperties {
    private static final String DEFAULT_ENCODING = "utf-8";
    public static final String DEFAULT_PREFIX = "classpath:/templates/";
    public static final String DEFAULT_SUFFIX = ".html";
    private boolean checkTemplate = true;
    private boolean checkTemplateLocation = true;
    private String prefix = "classpath:/templates/";
    private String suffix = ".html";
    private String mode = "HTML";

}
