package org.ysy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/*
为了简化swagger使用，Spring对swagger进行了整合，并命名Springfox
https://blog.csdn.net/weixin_54232666/article/details/127384258
 */

@SpringBootApplication
public class Chapter32Application {

    public static void main(String[] args) {
        SpringApplication.run(Chapter32Application.class, args);
    }

}
