package com.study.ch07.register01;

public class ProductDB {

    void insertProduct02(Product02 product02){
        System.out.println();
        System.out.println("db에 insert완료");
        System.out.println("insert 내용");
        System.out.println("name : "  + product02.name);
        System.out.println("code : " + product02.code);
        System.out.println("price : " + product02.price);
        System.out.println();
    }
}
