package com.study.ch16;

import lombok.AllArgsConstructor;

import java.util.Scanner;

@AllArgsConstructor

public class ArrayService {
    private String[] strArray;

    public void add(String str){
        String[] newArray = new String[strArray.length+1];
        for(int i =0; i< strArray.length;i++){
            newArray[i] = strArray[i];
        }
        strArray = newArray;
        strArray[strArray.length-1] = str;

    }
    //다른 방법
    public void remove(int index) {
        String[] minusArray = new String[strArray.length - 1];

        for (int i = 0; i < minusArray.length; i++) {
            minusArray[i] = strArray[i < index ? i : i + 1];
        }
        strArray = minusArray;
    }

    public String get(int index){
        return strArray[index];
    }

        /*
        //방법 1
        for(int i =0; i< index;i++){
            minusArray[i] = strArray[i];
        }
        for(int i =index+1; i< strArray.length;i++){
            minusArray[i-1] = strArray[i];
        }
        strArray = minusArray;

        방법 2
        for(int i =0;i< strArray.length;i++) {
            if(i<index) {
                minusArray[i] = strArray[i];
            } else if(i>index) {
                minusArray[i-1] = strArray[i];
            }
        }
        strArray = minusArray;
       */


    public int indexOf(String str){
        if(str == null){
            return -1;
        }
        for(int i = 0;i< strArray.length;i++){
            if(strArray[i].equals(str)){
                return  i;
            }
        }
        return -1;
    }

    @Override
    public String toString(){
        String result = "Array[";
        for(int i = 0;i<strArray.length;i++){
            result += strArray[i];
            if(i< strArray.length-1){
                result+=",";
            }
        }
        result +="]";
        return result;
    }

}
