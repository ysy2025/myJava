package org.ysy.controller;

import org.junit.Test;
import org.ysy.entity.Book;

public class BookTest {

    @Test
    public void testBook01(){
        Book book = new Book();
        System.out.println(book.getName());

    }

}