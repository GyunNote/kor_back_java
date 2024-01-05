package com.study.ch07.register;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {


        ProductService productservice = new ProductService();
        Scanner scanner = new Scanner(System.in);
        String productName = null;
        String productCode = null;
        long productPrice = 0;

        System.out.println("상품 등록 프로그램");

        System.out.print("상품명>>>> ");
        productName = scanner.nextLine();
        if (productservice.isEmptyString(productName)) {
            System.out.println("상품명을 다시 입력하세요!");
            return;
        }

        System.out.print("상품코드 : ");
        productCode = scanner.nextLine();
        if (productservice.isEmptyString(productCode)) {
            System.out.println("상품코드를 다시 입력하세요!");
            return;
        }
        System.out.println("상품가격>>>> ");
        productPrice = scanner.nextLong();

        Product product = new Product(productName,productCode,productPrice);

        productservice.registerProductService(product);
    }
}
