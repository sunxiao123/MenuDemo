package com.example;

/**
 * Created by MrSun on 2017/8/24.
 */

public class XMLFormatter extends Formatter {
    @Override
    protected String formating(Book book) {
        String result = "";
        result += "<book_name>" + book.getBookName() + "</book_name>\n";
        result += "<pages>" + book.getPages() + "</pages>\n";
        result += "<price>" + book.getPrice() + "</price>\n";
        result += "<author>" + book.getAuthor() + "</author>\n";
        result += "<isbn>" + book.getIsbn() + "</isbn>\n";
        return result;
    }
}
