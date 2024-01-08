package com.study.ch08.car;

public class CarRepository {

    final Car[] cars;

    CarRepository(Car[] cars){          //의존성 주입
        this.cars = cars;
    }

    int getEmptIndex(){
        for(int i = 0; i< cars.length;i++){
            if(cars[i] == null){    //널이면 리턴값 반환 널이 없으면 -1 반환
                return i;
            }
        }
        return -1;
    }

    void insert(Car car){
        cars[getEmptIndex()] = car;
    }

    Car[] getCarDatas(){
        int carCount = 0;
        for(int i= 0;i< cars.length;i++){
            if(cars[i] !=null){        //널이 아닌 개수 구하기
                carCount++;
            }
        }

        Car[] newCars = new Car[carCount];     //새로운 배열 만들기 널이 아닌 개수만큼
        int j = 0;
        for(int i =0;i< cars.length;i++){
            if(cars[i] != null){
                newCars[j] =cars[i];
                j++;
            }
        }
        return newCars;
    }
}
