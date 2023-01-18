package com.ysy.service.impl;

import com.ysy.dao.UserDao;
import com.ysy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    /**
     * 保存用户信息
     */
    public void saveUser() {
        userDao.saveUser();
    }
}
