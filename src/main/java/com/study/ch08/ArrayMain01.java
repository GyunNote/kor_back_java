package com.study.ch08;

import java.util.Scanner;

public class ArrayMain01 {
    public static void main(String[] args) {

        //배열
        int[] numArray = new int[5];
        numArray[0] = 10;
        numArray[1] = 20;
        numArray[3] = 30;

        Scanner scanner = new Scanner(System.in);
        System.out.println("인덱스");
        int index = scanner.nextInt();

        System.out.println(numArray[index]);


    }
}
