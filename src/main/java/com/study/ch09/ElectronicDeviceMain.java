package com.study.ch09;
//오버라이드 형태는 부모형태이더라도 자식에서 재정의 되면 재정의된게 우선
public class ElectronicDeviceMain {
    public static void main(String[] args) {
        ElectronicDevice[] electronicDevices = new ElectronicDevice[10];

        for(int i =0;i< electronicDevices.length;i++){
            electronicDevices[i] = i%2 == 0 ? new Computer() : new SmartPhone();     //==> 업캐스팅

        }
        for(int i =0 ;i< electronicDevices.length;i++){
            electronicDevices[i].setPowerOn();
        }
        System.out.println();

        for(int i =0 ;i< electronicDevices.length;i++) {
            electronicDevices[i].showDeviceState();

        }
        for(int i =0;i<electronicDevices.length;i++){

            if(electronicDevices[i] instanceof Computer){  // 원래 형태가 컴퓨터의 형태이냐????

            Computer computer = (Computer) electronicDevices[i];  //다운 캐스팅
            computer.playGame();

            }else if(electronicDevices[i] instanceof SmartPhone){

                SmartPhone smartPhone = (SmartPhone) electronicDevices[i];
                smartPhone.call();
            }
        }
    }
}
