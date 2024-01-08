package com.study.ch08.book;

public class Book {
    String number;
    String type;

    public Book(String number, String type) {
        this.number = number;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Book{" +
                "number='" + number + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
