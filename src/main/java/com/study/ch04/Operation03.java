package com.study.ch04;

public class Operation03 {
    public static void main(String[] args) {
        int year = 1999;

        boolean result = (year > 0 && year < 4001) && ((year % 100 != 0 && year % 4 == 0) ||(year % 4 ==0 && year % 400 ==0));

        System.out.println(result);

        int iResult = 10 >11 ? 1111 : 2222;
        System.out.println(iResult);



    }
}
