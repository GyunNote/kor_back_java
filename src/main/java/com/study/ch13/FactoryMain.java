package com.study.ch13;

import java.util.Scanner;

public class FactoryMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        FactoryService01 factoryService01 = new FactoryService01(scanner);
        FactoryService02 factoryService02 = new FactoryService02(scanner);

        factoryService01.create();
        System.out.println();
        factoryService02.create();


    }
}
