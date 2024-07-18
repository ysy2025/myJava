package org.ysy.chapter03.config;

import org.apache.commons.dbcp2.BasicDataSourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import org.ysy.chapter03.bean.DataSourceGetter;
import org.ysy.chapter03.entity.*;

import javax.sql.DataSource;
import java.util.Properties;

/* Configuration 注解标识这是一个Java配置对象
 spring的容器 会根据它来生成 IOC 容器来装配Bean
 @Bean标识将initUser返回的POJO(plain ordinary java object java简单对象) 装备到 ioc 容器中
 属性name定义这个Bean的名称 如果没有配置,则initUser这个方法名称会作为Bean保存到SpringIOC中


 针对@Component注解,AppConfig需要加上 componentscan 注解符号
 会扫描;但是只会扫描当前包和子包
 此时可以删除bean注解

 componentscan 查询源码,注意参数和配置项 加上这个,bean注解就不用加参数了


依赖注入
目前只讨论了bean的装配
bean的依赖,靠的是依赖注入


bean 的生命周期
bean的定义,初始化,生存期,销毁 4个过程

定义过程:资源定位->解析+保存->bean发布到ioc容器(还没有实例产生)
取出来的时候才做实例化和依赖注入


使用属性文件
application.properties 默认的文件名
 */
@Configuration
@ComponentScan(value = {"org.ysy.chapter03.entity.*"})
// 这个componentscan很重要!!!!!出了问题,很可能是包的目录不对应!
public class AppConfig {

    @Bean(name = "bussinessPerson")
    public BussinessPerson initBussinessPerson(){

        BussinessPerson bussinessPerson = new BussinessPerson();
        return bussinessPerson;
    }



//    @Bean(name = "userEntity")
//    public UserEntity initUserEntity(){
//        UserEntity userEntity = new UserEntity();
//
//        userEntity.setId(1L);
//        userEntity.setUserName("zhangsan");
//        userEntity.setNote("note1");
//
//        return userEntity;
//    }
//
//    @Bean
//    public UserEntity2 initUserEntity2(){
//        UserEntity2 userEntity2 = new UserEntity2();
//
////        System.out.println(userEntity2.getId());
//
//        return userEntity2;
//    }


}
