package com.study.ch07;

public class Client01Main {
    public static void main(String[] args) {
        Client01 client01 = new Client01("aaa" , "1595");
        Client01 client02 = new Client01("bbb", "1265", "010519535", "rl@naver.com");

        System.out.println("고객1의 정보");
        System.out.println();
        client01.showInfo();
        System.out.println();

        System.out.println("고객2의 정보");
        System.out.println();
        client02.showInfo();
        System.out.println();

        client01.setNumber("0109114536");
        client01.setEmail("disdn@gmail.com");

        System.out.println("변경 후 고객 1의 정보");
        System.out.println();
        client01.showInfo();
    }
}
