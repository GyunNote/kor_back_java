package com.study.ch06.Forstar;

import java.util.Scanner;

public class For03_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("별 몇개? : ");
        int starCount = scanner.nextInt();

        for(int i = 0;i<starCount; i++){
            for(int j=0;j<starCount-i-1;j++){

                System.out.print(" ");
            }for(int k =0;k<i+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
