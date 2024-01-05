package com.study.ch07.carstatus;

import com.study.ch07.register.Product;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {

        CarService carservice = new CarService();
        Scanner scanner = new Scanner(System.in);

        String carNumber = null;
        String carSize = null;
        String carStatus = null;

        System.out.println("차 등록 프로그램");
        System.out.println();

        System.out.println("차 넘버");
        carNumber = scanner.nextLine();
        if(carservice.isEmptyString(carNumber)){
            System.out.println("차번호를 다시 입력하세요!");
            return;
        }
        System.out.println("차 크기");
        carSize = scanner.nextLine();
        if(carservice.isEmptyString(carSize)){
            System.out.println("차번호를 다시 입력하세요!");
            return;
        }
        System.out.println("차 상태");
        carStatus = scanner.nextLine();

        Products products = new Products(carNumber,carSize,carStatus);

        carservice.registerCarService(products);

    }
}
