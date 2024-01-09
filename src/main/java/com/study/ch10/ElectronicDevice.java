package com.study.ch10;

public abstract class ElectronicDevice {
    /*   <<< 추상화 >>> : 공통점을 뽑아낸다
    1.추상클래스 : abstract class
    2.인터페이스 : interface

     */
    boolean powerState;

    void setPowerOn(){
        powerState = true;
    }
    void setPowerOff(){
        powerState = false;
    }
    abstract void showDeviceState();          //추상메소드 ---인터페이스나 추상클래스에서만 정의가능
}
