package com.study.ch13;

import java.util.Scanner;

public class FactoryService01 { //이름 바꿀떄 shift + f6

    private Scanner scanner;

    public FactoryService01(Scanner scanner) {
        this.scanner = scanner;
    }
    public void create(){
        System.out.println("1공장에서 차량을 생산합니다");
        System.out.print("모델명 입력 >> ");
        String modelName = scanner.nextLine();

        Factory factory = Factory.getInstance();
        factory.setFactoryName("자동차 생산 공장");
        System.out.println(factory.getFactoryName());

        Car car = factory.produce(modelName);
        System.out.println(car.toString());
    }

}
