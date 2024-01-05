package com.study.ch07.carstatus;

public class CarDB {
    void insertProduct(Products product){
        System.out.println();
        System.out.println("DB에 insert 완료" );
        System.out.println("Insert 내용");
        System.out.println("number : " + product.number);
        System.out.println("size : " + product.size);
        System.out.println("status : " + product.status);
        System.out.println();
    }
}
