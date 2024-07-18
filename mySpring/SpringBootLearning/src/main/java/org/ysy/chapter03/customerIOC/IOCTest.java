package org.ysy.chapter03.customerIOC;


import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.ysy.chapter03.bean.DataSourceGetter;
import org.ysy.chapter03.config.AppConfig;
import org.ysy.chapter03.entity.BussinessPerson;
import org.ysy.chapter03.entity.UserEntity;
import org.ysy.chapter03.entity.UserEntity2;
import org.ysy.chapter03.entity.UserServiceEntity;

@Slf4j
public class IOCTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

//        UserEntity userBean = ctx.getBean((UserEntity.class));
//
//        System.out.println(userBean.getUserName());
//
//        UserEntity2 userBean2 = ctx.getBean((UserEntity2.class));
//
//        System.out.println(userBean2.getUserName());

//        UserServiceEntity userServiceEntity = ctx.getBean((UserServiceEntity.class));
//
//        System.out.println(userServiceEntity.getUserName());

//        DataSourceGetter bean = ctx.getBean((DataSourceGetter.class));
//
//        System.out.println(bean);

//        BussinessPerson bean = ctx.getBean(BussinessPerson.class);
//        bean.service();

    }
}
