package com.study.ch21;

public class ExceptionMain {
    public static void main(String[] args) {

        int[] numArray = new int[] {1,2,3,4,5};

        for(int i =0; i<6;i++){
            try{
                System.out.println(numArray[i]);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("예외가 발생");
            }
                //예외처리 안하면 프로그램 중간에 꺼짐
        }
        System.out.println("프로그램 정상종료");
    }
}
