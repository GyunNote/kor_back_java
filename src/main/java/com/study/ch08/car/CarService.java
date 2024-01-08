package com.study.ch08.car;

public class CarService {
    CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }
    boolean isFull(){
        return carRepository.getEmptIndex() == -1 ;
    }

    void appendCar(Car car){
      carRepository.insert(car);
    }
    void printCarList(){    //자동차 조회하는 기능

        Car[] cars = carRepository.getCarDatas();
        if(cars.length ==0){
            System.out.println("등록된 차량이 없습니다");
            return;
        }
        for(int i =0;i< cars.length;i++){
            System.out.println(cars[i].toString());
        }

    }
}
//