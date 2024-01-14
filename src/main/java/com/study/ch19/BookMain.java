package com.study.ch19;

public class BookMain {
    public static void main(String[] args) {


        Book book = Book.builder().name("sdf").build();
        Book book1 = Book.builder().price("1562").name("sdfdf").build();


        System.out.println(book);
        System.out.println(book1);
    }
}
