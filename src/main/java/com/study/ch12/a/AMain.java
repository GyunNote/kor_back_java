package com.study.ch12.a;

public class AMain {
    public static void main(String[] args) {

        Student student = new Student();
        student.setName("김도균");
        System.out.println(student.getName());

        student.setAddress("명륜아이파크 2차");
        System.out.println(student.getAddress());

        System.out.println();
        System.out.println(student.toString());
    }
}
