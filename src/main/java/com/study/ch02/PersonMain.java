package com.study.ch02;

public class PersonMain {
    public static void main(String[] args) {
        Person p = new Person();
        // int a 와 같은 형식
        p.name = "도균";
        p.age = 26;

        Person p2 = new Person();
        p2.name = "강현";
        p2.age = 28;


        System.out.println(p2.age);
        System.out.println(p.name);
    }
}
