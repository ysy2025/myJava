package org.ysy.chapter03.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*
如果一个个的bean使用注解@Bean注入,很麻烦
直接用扫描装配的方法注入容器
@Component和@ComponentScan
这里的Component注解表名类被 ioc 容器扫描 并装配 userEntity2作为bean的名称
可以不填写,但是容器会默认将第一个字母小写,其他不变
@value是指定具体的值

此时ioc想装配的话要调整

 */
@Component("userEntity2")
public class UserEntity2 {

    @Value("1")
    private Long id;

    @Value("zhangsan2")
    private String userName;

    @Value("note2")
    private String note;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
