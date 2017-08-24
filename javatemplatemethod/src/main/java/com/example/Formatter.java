package com.example;

/**
 * Created by MrSun on 2017/8/24.
 */

public abstract class Formatter {


    public String formatBook(Book book) {
        beforeFormat();
        String result = formating(book);
        afterFormat();
        return result;
    }


    private void beforeFormat() {
        System.out.println("format begins");
    }

    protected abstract String formating(Book book);

    private void afterFormat() {
        System.out.println("format finished");
    }

}
