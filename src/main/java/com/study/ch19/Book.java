package com.study.ch19;

import lombok.ToString;

@ToString
public class Book {

    private String name;
    private String price;

    public Book(String name, String price) {
        this.name = name;
        this.price = price;
    }
    public static BookBuilder builder(){
        return new BookBuilder();
    }
    public static class BookBuilder {

        private String name;
        private String price;

        public Book build() {
            return new Book(name, price);
        }

        public BookBuilder name(String name) {
            this.name = name;
            return this;
        }

        public BookBuilder price(String price) {
            this.price = price;
            return this;
        }
    }

}
