package com.study.ch07.carstatus;

public class CarService {

    boolean isEmptyString(String str){
        if(str == null){
            return true;
        }
        return str.isBlank();
    }
    void registerCarService(Products products) {
        CarRepository carRepository = new CarRepository();

        System.out.println("서비스까지 데이터 전달");
        carRepository.saveCar(products);
    }
}
