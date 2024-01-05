package com.study.ch07;

public class Client01 {
    //username(아이디)
    //password(비밀번호)
    //number(전화번호)
    //email(이메일)
    //메소드
    //setName() - 메소드의 매개변수를 통해 name의 값을 변경
    //setEmail()- 메소드의 매개변수를 통해 email의 값을 변겅
    //showInfo() - 모든 속성값 출력
    final String username ;
    final String password;
    String number;
    String email;

    Client01(String username, String password){
        this.username = username;
        this.password = password;

    }
    Client01(String username, String password, String number, String email){
        this.username = username;
        this.password = password;
        this.number = number;
        this.email = email;
    }
    void setNumber(String number){
        this.number = number;
    }
    void setEmail(String email){
        this.email = email;
    }
    void showInfo(){
        System.out.println("고객 아이디 : " + username);
        System.out.println("고객 비밀번호 : " +  password);
        System.out.println("고객 전화번호 : " + number);
        System.out.println("고객 이메일 : " + email);
    }

}
