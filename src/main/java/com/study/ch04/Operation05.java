package com.study.ch04;

import java.util.Scanner;

public class Operation05 {
    public static void main(String[] args) {


    /*  String name = "김준일";
        String name2 = new String("김준일");
        System.out.println(name);
        System.out.println(name2);

        System.out.println(name == name2);    false
        System.out.println(name == "김준일");   true
        System.out.println(name2 == "김준일");  false
        */

        /* 문제 :  x와 y중 하나라도 0이면 결과는 "오류"  사분면
                  x: +  y : +  제 1사분면
                  x: -  y : +  제 2사분면
                  x: -  y : -  제 3사분면
                  x: +  y : -  제 4사분면
           */

        Scanner scan = new Scanner(System.in);
        System.out.print("X: ");
        int x = scan.nextInt();
        System.out.print("Y: ");
        int y = scan.nextInt();


        String result = x == 0 || y == 0  ? "오류" :
                        x > 0 && y > 0 ? "제 1사분면" :
                        x < 0 && y > 0 ? "제 2사분면" :
                        x < 0 && y < 0 ? "제 3사분면" :
                        x > 0 && y < 0 ? "제 4사분면" : "";

            

        System.out.println("결과 : " + result) ;
        scan.close();
        scan.close();
        System.out.println("테스트코드작성");


        /* 다른 방법 ==>   String result   =    x== 0 || y==0 ? "오류"
                                            : x > 0 ? (y > 0 ? "제 1사분면" : "제 4 사분면")
                                            : (y > 0 ? "제 2사분면" : "제 3사분면")
         */
    }
}