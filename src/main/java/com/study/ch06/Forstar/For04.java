package com.study.ch06.Forstar;

public class For04 {
    public static void main(String[] args) {

        for(int i=0;i<10;i++){
            System.out.println("i : " + i);
            if(i%2 !=0){
                continue;
            }
            System.out.println("for 문 마지막");
        }
    }
}
