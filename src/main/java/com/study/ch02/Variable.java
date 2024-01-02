package com.study.ch02;

public class Variable {
    public static void main(String[] args) {
        int date = 20231229;
        double date2 = date;
        //int date3 = date2;  date2 값이 실수 인데 date3는 정수 임으로 불가능
        //강제 형변환
        int date3 = (int) date2;

        //문자 < 정수 < 실수
        char a = '1';
        int b = a;
        double c = b;

        System.out.println(c);


        System.out.println(date + 1);
        System.out.println(date + 2);
        System.out.println(date + 3);
        System.out.println(date + 4);
        System.out.println(date + 5);

        for(int i = 1;i <=5;i++){
            System.out.println(date + i);

        }
    }
}
