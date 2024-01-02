package com.study.ch04;

public class Operation01 {
    public static void main(String[] args) {
        /*  <<연산자>>
        산술, 비교, 논리, 조건, 복합대입 연산자


         */
        System.out.print("산술연산자 : ");
        System.out.println("( +, - , * , / ,% )") ;


        System.out.println(true);
        System.out.println(false);


        boolean flag = 10 < 2;
        System.out.println(">" + flag);


        System.out.print("비교연산자 : ");
        System.out.println("( >, < , <= , >= , == ,!=)") ;


        System.out.print("논리연산자 : ");
        System.out.println("(&&(곱)--AND, ||(합)--OR, !(부정)--NOT)") ;

        System.out.println("조건 연산자 : ");
        System.out.println("a > 0 ? 양수 : 음수");
        // a > 0 ? 양수 : a ==0 ? 0 : 음수



    }
}
