package com.study.ch02;

public class StudentTypeMain {
    public static void main(String[] args) {
        StudentType s1 = new StudentType();
        StudentType s2 = new StudentType();
        StudentType s3 = new StudentType();

        s1.name = "김준일";
        s1.StudentYear = 1;
        s1.address = "부산 동래구";

        System.out.println("이름 : " + s1.name);
        System.out.println("학년 : " + s1.StudentYear + "학년");
        System.out.println("주소 : " + s1.address);

        Person p = s1;


//        Person 전주환 = new Person();
//        StudentType 전주환학생 = (StudentType) 전주환;

        StudentType 전주환학생 = new StudentType();
        Person 전주환사람 = 전주환학생;
        StudentType 전주환학생2 = (StudentType) 전주환사람;
    }
}
