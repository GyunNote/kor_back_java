package com.study.ch06;

import java.util.Scanner;

public class For03_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("별 몇개? : ");
        int starCount = scanner.nextInt();

        for(int i=1;i<starCount*2;i+=2) {
            for (int j = starCount*2; j >i ; j-=2) {
                System.out.print(" ");
            }
            for (int j = 0;j < i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
