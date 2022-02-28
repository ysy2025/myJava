package com.ysy.day11;

public class Book {
    String name;
    int id;
    int pages;
    double price;

    public Book() {
    }

    public Book(String name) {
        this.name = name;
    }

    public Book(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Book(String name, int id, int pages) {
        this.name = name;
        this.id = id;
        this.pages = pages;
    }

    public Book(String name, int id, int pages, double price) {
        this.name = name;
        this.id = id;
        this.pages = pages;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void show(){
        System.out.println("The book is " + name + " the id is " + id + " and it has " + pages + " pages and the price is " + price);
        System.out.println("Niu bi !!!");
    }

    public void sale(){
        System.out.println("This book is well selling!");
    }
}
