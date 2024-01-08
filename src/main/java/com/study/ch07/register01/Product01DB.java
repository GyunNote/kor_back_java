package com.study.ch07.register01;

public class Product01DB {
    void insertMessage(Product01 product01){

        System.out.println();
        System.out.println("DB에 Insert 완료");
        System.out.println("Insert 내용");
        System.out.println("name : " + product01.name);
        System.out.println("code : " + product01.code) ;
        System.out.println("price : " + product01.price );
        System.out.println();
    }
}
