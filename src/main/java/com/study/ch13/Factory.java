package com.study.ch13;

public class Factory {
    //자기 자신의 클래스를 스태틱 변수로 가지고 있어야 한다, 변수명 instance

    // private static Factory factory;   두가지 방법중 하나
    private static Factory instance;
    private String factoryName;
    private int autoCount;
    private final int DEFAULT_NUM = 20240000;

    //생성자는 private 으로 외부 생성을 막아준다.
    private Factory(){}

    public static Factory getInstance(){
        if(instance == null){
            instance = new Factory();
        }
        return instance;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public Car produce(String model){
        autoCount++;
        return new Car(Integer.toString(DEFAULT_NUM + autoCount), model);
    }

    @Override
    public String toString() {
        return "Factory{" +
                "factoryName='" + factoryName + '\'' +
                ", autoCount=" + autoCount +
                ", DEFAULT_NUM=" + DEFAULT_NUM +
                '}';
    }
}
