package com.example;

/**
 * Created by MrSun on 2017/8/24.
 */

public class Book {

    private String bookName;
    private int pages;
    private double price;
    private String author;
    private String isbn;

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getBookName() {
        return bookName;
    }

    public int getPages() {
        return pages;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }
}
