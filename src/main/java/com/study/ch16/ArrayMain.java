package com.study.ch16;

public class ArrayMain {
    public static void main(String[] args) {

        String[] initStrArray = new String[0];
        ArrayService arrayService = new ArrayService(initStrArray);
        arrayService.add("김도균1");
        arrayService.add("김도균2");
        arrayService.add("김도균3");
        arrayService.add("김도균4");
        arrayService.add("김도균5");

        System.out.println(arrayService.toString());

        System.out.println(arrayService.indexOf("김도균3"));


       arrayService.remove(2);
        System.out.println(arrayService);

    }
}
