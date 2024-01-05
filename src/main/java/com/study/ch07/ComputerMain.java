package com.study.ch07;

public class ComputerMain {
    public static void main(String[] args) {

        Computer computer1 = new Computer(); //생성
        Computer computer2 = new Computer("노트북"); //생성
        Computer computer3 = new Computer();

        System.out.println(computer1);
        System.out.println(computer2);

        computer1.cpu = "i5";
        computer2.cpu = "i7";


        computer1.disk = "hard";
        computer2.disk = "ssd";

        System.out.println(computer1.cpu);
        System.out.println(computer2.cpu);

        System.out.println();

        computer1.showInfo();
        System.out.println();
        computer2.showInfo();

        System.out.println();

        computer1.ram = "itx 12";
        computer2.ram = "itx 15";

        computer1.showInfo();
        System.out.println();
        computer2.showInfo();
        System.out.println();
        computer3.showInfo();

    }
}
