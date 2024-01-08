package com.study.ch07.register01;

import java.rmi.Naming;
import java.util.Scanner;

public class Product01Main {

    //상품명, 상품코드, 상품 가격을 등록하는 상품등록 프로그램을 만들어라 공백검사
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product01Service product01Service = new Product01Service();
        String productName = null;
        String productCode = null;
        String productPrice = null;

        System.out.println("상품등록 프로그램 시작");
        System.out.println();
        System.out.print("상품명 : ");
        productName = scanner.nextLine();
        if(product01Service.isEmptystr(productName)){
            System.out.println();
            System.out.println("다시 등록하세요");
        }
        System.out.println();
        System.out.print("상품코드 : ");
        productCode = scanner.nextLine();
        if(product01Service.isEmptystr(productCode)){
            System.out.println();
            System.out.println("다시 등록하세요");
        }
        System.out.println();
        System.out.print("상품가격 : ");
        productPrice = scanner.nextLine();

        Product01 product01 = new Product01(productName, productCode, productPrice);

        product01Service.registerService(product01);

    }
}
