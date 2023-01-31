package com.ysy4.spring.service.impl;

import com.ysy4.spring.dao.BookDao;
import com.ysy4.spring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Transactional
    public void buyBook(Integer userId, Integer bookId) {

        // 查询图书的价格
        System.out.println("书的价格呢?");
        Integer price = bookDao.getPriceByBookId(bookId);

        // 更新图书的库存
        bookDao.updateStock(bookId);

        // 更新用户的余额
        bookDao.updateBalance(userId, price);

    }
}
