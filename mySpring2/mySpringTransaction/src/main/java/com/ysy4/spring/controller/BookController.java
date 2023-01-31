package com.ysy4.spring.controller;

import com.ysy4.spring.service.BookService;
import com.ysy4.spring.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    private CheckoutService checkoutService;


    public void buyBook(Integer userId, Integer bookId){

        System.out.println("开始买书!");
        bookService.buyBook(userId, bookId);
    }

    public void checkout(Integer userId, Integer[] bookIds){
        System.out.println("开始结账!所有的都结账!");

        checkoutService.checkout(userId, bookIds);
    }
}
