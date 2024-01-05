package com.study.ch07.member;

public class Member {
    String code;
    String name;
    int age;
    String address;

    Member(String code, String name, int age, String address) { //alt + insert 후에 constructor
        this.code = code;
        this.name = name;
        this.age = age;
        this.address = address;

    }
    @Override
    public String toString() {
        return "Member{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
