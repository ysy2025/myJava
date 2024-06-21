package org.ysy.lease.common.mybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("org.ysy.lease.web.admin.mapper")
@MapperScan("org.ysy.lease.web.app.mapper")
public class MybatisPlusConfiguration {

}
