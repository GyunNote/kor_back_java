package com.study.ch07.register01;

public class Product01Service {

    boolean isEmptystr(String str){
        if(str == null){
            return true;
        } return  str.isBlank();
    }
    void registerService(Product01 product01){
        Product01Repository product01Repository = new Product01Repository();
        System.out.println("서비스까지 데이터 전달");
        product01Repository.repository01(product01);
    }

}
