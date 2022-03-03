package com.ysy.day13;

import java.util.Objects;

public class Book {
    int id = 1;
    double price = 9.99;

    // 自动生成的equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return id == book.id &&
                Double.compare(book.price, price) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, price);
    }
}
