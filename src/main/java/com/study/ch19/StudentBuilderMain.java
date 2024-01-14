package com.study.ch19;

public class StudentBuilderMain {
    public static void main(String[] args) {

        Student studentBuilder = Student.builder()
                .address("부산동래구")
                .name("김도균")
                .age(27)
                .build();

        Student studentBuilder1 = Student.builder().name("김도균33").age(27).build();

        System.out.println(studentBuilder);
        System.out.println(studentBuilder1);
    }
}
