package com.study.ch07;

public class Computer {
    String type;
    String cpu;
    String ram;
    String disk;

    //생성자 특징 : 클래스의 이름과 동일.
    //            메소드의 형태이다.
    //            매개변수 지정 가능 , 오버로딩 가능
    //            주소값이 자동으로 리턴 됨 따라서 리턴 자료형 없음
    Computer(){
       type = "컴퓨터";
    }

    Computer(String type){
        this.type = type;
    }
    //생성자 끝

    void showInfo(){
        System.out.println("type : " + type);
        System.out.println("cpu : " + cpu);
        System.out.println("ram : " + ram);
        System.out.println("disk : " + disk);
    }

}
