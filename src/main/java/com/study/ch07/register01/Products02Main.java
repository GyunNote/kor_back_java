package com.study.ch07.register01;

import com.study.ch07.register.Product;
import com.study.ch07.register.ProductService;

import java.util.Scanner;

public class Products02Main {
    public static void main(String[] args) {
        // 상품코드, 상품명, 상품 가격을 등록하는 상품등록 프로그램을 만들어라 입력값이 빈칸인지 구별하는 프로그램도
        Scanner scanner = new Scanner(System.in);
        ProductService02 productService02 = new ProductService02();
        String productName = null;
        String productCode = null;
        String productPrice = null;

        System.out.println("상품등록 프로그램 ");

        System.out.print("상품명 : ");
        productName = scanner.nextLine();
        if(productService02.isEmptyString(productName)){
            System.out.println("상품명을 다시 등록하세요");
            return;
        }

        System.out.print("상품코드 : ");
        productCode = scanner.nextLine();
        if(productService02.isEmptyString(productCode)){
            System.out.println("상품코드을 다시 등록하세요");
            return;
        }

        System.out.print("상품가격 : ");
        productCode = scanner.nextLine();

        Product02 product02 = new Product02(productName,productCode, productPrice );

        ProductService02.registerProduct02Service(product02);


    }
}
