package com.ysy4.spring.dao.impl;

import com.ysy4.spring.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public Integer getPriceByBookId(Integer bookId) {
        String sql = "select price from t_book where book_id = ?";
        System.out.println("The price is !!!!!!!!!!");

        Integer price = jdbcTemplate.queryForObject(sql, Integer.class, bookId);
        return price;
    }

    public void updateStock(Integer bookId) {
        String sql = "update t_book set stock = stock - 1 where book_id = ?";

        jdbcTemplate.update(sql, bookId);
    }

    public void updateBalance(Integer userId, Integer price) {
        String sql = "update t_user set balance = balance - ? where user_id = ?";

        jdbcTemplate.update(sql, price, userId);
    }
}
