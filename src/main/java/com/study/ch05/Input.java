package com.study.ch05;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        System.out.print("a : ");
        int a = scanner.nextInt();
        System.out.print("b : ");
        int b = scanner.nextInt();
        System.out.print("c : ");
        int c = scanner.nextInt();

        System.out.print("제목 : ");
        scanner.nextLine();
        String title = scanner.nextLine();



        System.out.println(title + " : " + (a+b+c));

    }
}
