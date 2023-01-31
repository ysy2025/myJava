package com.ysy4.spring.service;

public interface CheckoutService {

    // 结账
    void checkout(Integer userId, Integer[] bookIds);
}
