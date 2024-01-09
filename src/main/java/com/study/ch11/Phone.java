package com.study.ch11;

public class Phone {
    static int autoCount = 0;
    int serialNum ;
    Company com;


    public Phone(Company company) {
        autoCount++;
        this.serialNum = 202400;
        this.serialNum += autoCount ;
        this.com = company;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "serialNum=" + serialNum +
                ", company=" + com.toString() +
                '}';
    }
}
