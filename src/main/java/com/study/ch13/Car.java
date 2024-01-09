package com.study.ch13;

public class Car {

    private String serialNum;
    private String model;

    public Car(String serialNum, String model) {
        this.serialNum = serialNum;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "serialNum='" + serialNum + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
