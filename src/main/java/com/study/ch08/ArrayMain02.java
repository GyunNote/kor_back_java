package com.study.ch08;

public class ArrayMain02 {
    public static void main(String[] args) {

        String[] names = new String[4];
        names[0] = "도현";
        names[1] = "도ㅅ";
        names[2] = "도ㅇ";

       for(int i = 0;i<3;i++){
           System.out.println(names[i]);
       }
    }
}
