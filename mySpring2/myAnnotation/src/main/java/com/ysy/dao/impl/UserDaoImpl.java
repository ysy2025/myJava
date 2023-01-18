package com.ysy.dao.impl;

import com.ysy.dao.UserDao;
import org.springframework.stereotype.Repository;


@Repository
public class UserDaoImpl implements UserDao {

    /**
     * 保存用户信息
     */
    public void saveUser() {
        System.out.println("张三牛逼!");
    }
}
