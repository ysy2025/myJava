package org.ysy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.ysy.entity.User;
import org.ysy.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private JdbcTemplate jdbcTemplate;

    public UserServiceImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int create(String name, Integer age) {
        return 0;
    }

    @Override
    public List<User> getByName(String name) {
        List<User> users = jdbcTemplate.query("select * from user where NAME = ?", (resultSet, i) -> {
            User user = new User();
            user.setName(resultSet.getString("name"));
            user.setAge(resultSet.getInt("age"));
            return user;
        }, name);
        return users;
    }

    @Override
    public int deleteByName(String name) {
        return 0;
    }

    @Override
    public int getAllUsers() {
        return 0;
    }

    @Override
    public int deleteAllUsers() {
        return 0;
    }
}
