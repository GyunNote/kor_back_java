package com.study.ch05;

import java.util.Scanner;

public class If02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x = 0;
        int y = 0;

        System.out.print("x : ");
        x = scanner.nextInt();
        System.out.print("y : ");
        y = scanner.nextInt();

        if (x == 0 && y != 0) {
            System.out.println("y축 위에 있습니다");
        } else if (x != 0 && y == 0) {
            System.out.println("x축 위에 있습니다");
        } else if (x ==0 && y == 0){
            System.out.println("원점입니다");
        }else {

             if (x > 0 && y > 0) {
                System.out.println("제 1사분면");
            } else if (x < 0 && y > 0) {
                System.out.println("제2 사분면");
            } else if (x < 0 && y < 0) {
                System.out.println("제3 사분면");
            } else {
                System.out.println("제4 사분면");

            }
        }

    }
}
