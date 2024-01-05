package com.study.ch07.carstatus;

public class CarRepository {

    void saveCar(Products products ){
        CarDB carDB = new CarDB();
        carDB.insertProduct(products);
    }
}
