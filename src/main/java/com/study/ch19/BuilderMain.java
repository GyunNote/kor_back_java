package com.study.ch19;

public class BuilderMain {
    public static void main(String[] args) {

        Car.CarBuilder carBuilder = Car.builder();

        Car car = Car.builder().model("df").build();

        System.out.println(car);

    }
}
