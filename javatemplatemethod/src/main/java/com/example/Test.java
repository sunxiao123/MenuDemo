package com.example;
//Java 设计模式之模板方法
public class Test {

    public static void main(String[] args){
        Book book = new Book();
        book.setBookName("Thinking  in   Java");
        book.setPages(888);
        book.setPrice(99);
        book.setAuthor("Bruce Eckel");
        book.setIsbn("9787111213826");
        XMLFormatter xmlFormatter = new XMLFormatter();
        String result = xmlFormatter.formatBook(book);
        System.out.println(result);

        JSONFormatter jsonFormatter = new JSONFormatter();
        result = jsonFormatter.formatBook(book);
        System.out.println(result);

        YAMLFormat yamlFormat = new YAMLFormat();
        result = yamlFormat.formatBook(book);
        System.out.println(result);
    }
}
