package com.study.ch07.register01;

public class Product01Repository {
    void repository01(Product01 product01){
        Product01DB product01DB = new Product01DB();
        product01DB.insertMessage(product01);

    }
}
