package org.ysy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.ysy.entity.Book;

@RestController
public class BookController {

    @Autowired
    Book book = null;

    @RequestMapping("/printBook")
    public String printBook(){
        System.out.println(" let us print book!");
        return (book.getName() + book.getAuthor() + book.getDesc());
    }

}
