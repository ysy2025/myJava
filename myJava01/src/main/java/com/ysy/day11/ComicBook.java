package com.ysy.day11;

public class ComicBook extends Book{
    String author;
    String name = "包公案";
    public ComicBook(){};

    public ComicBook(String author) {
        super(author);
//        this.author = author;
    }

    public ComicBook(String name, String author) {
//        super(name);
        this.author = author;
    }

    public ComicBook(String name, int id, String author) {
//        super(name);
        this.id = id;
        this.author = author;
    }

    public ComicBook(String name, int id, int pages, String author) {
//        this(author);
        this.id = id;
        this.pages = pages;
//        this.author = author;
    }

    public ComicBook(String name, int id, int pages, double price, String author) {
//        super(name);
        this.id = id;
        this.pages = pages;
        this.price = price;
        this.author = author;
    }

    public void show(){
        super.show();
        System.out.println("The author is " + author);
        System.out.println("the name of super is "+ super.name + " and the name of this is " + this.name);

        this.sale();
    }
}
