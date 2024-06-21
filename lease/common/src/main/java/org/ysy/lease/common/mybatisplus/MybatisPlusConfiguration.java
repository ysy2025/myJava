package org.ysy.lease.common.mybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("org.ysy.lease.web.*.mapper")
public class MybatisPlusConfiguration {

}
