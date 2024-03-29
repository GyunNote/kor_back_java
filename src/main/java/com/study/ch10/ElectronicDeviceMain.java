package com.study.ch10;

public class ElectronicDeviceMain {
    public static void main(String[] args) {

        new RemoteController();

        //  ElectronicDevice electronicDevice = new ElectronicDevice();  ===>  //추상클래스일때 생성불가 그래서 밑의 익명클래스 형태로 만듬
        //익명 클래스
        ElectronicDevice electronicDevice = new ElectronicDevice() {
            @Override
            void showDeviceState() {
                System.out.println("첫번째 기기 상태확인");
            }
        };

        ElectronicDevice electronicDevice2 = new ElectronicDevice() {

            @Override
            void showDeviceState() {
                System.out.println("두번째 기기 상태확인");
            }
        };

        RemoteController remoteController = new RemoteController();

        ElectronicDevice[] electronicDevices = new ElectronicDevice[3];
        electronicDevices[0] = electronicDevice;
        electronicDevices[1] = electronicDevice2;
        electronicDevices[2] = remoteController;

        for(int i= 0 ; i< electronicDevices.length;i++){

            electronicDevices[i].showDeviceState();

        }
    }
}
