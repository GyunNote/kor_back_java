package com.study.ch07;

public class User01 {
    //username(아이디)
    //password(비밀번호)
    //name(이름)
    //email(이메일)
    //메소드
    //setName() - 메소드의 매개변수를 통해 name의 값을 변경
    //setEmail()- 메소드의 매개변수를 통해 email의 값을 변겅
    //showInfo() - 모든 속성값 출력

    final String username;
    final String password;
    String name;
    String email;

    User01(String username,String password){
        this.username = username;
        this.password = password;
    }
    User01(String username,String password,String name,String email){
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
    }
    void setName(String name){
        this.name = name;
    }
    void setEmail(String email){
        this.email = email;
    }

    void showInfo(){
        System.out.println("아이디 : " + username );
        System.out.println("비밀번호 : " + password );
        System.out.println("이름 : " + name );
        System.out.println("이메일 : " + email );
    }
}
