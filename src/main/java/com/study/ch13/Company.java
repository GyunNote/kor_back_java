package com.study.ch13;


/*
Company 클래스를 싱글톤을 적용하여 구현하시오
//싱글톤 사용 할때 : 유일한 객체를 하나만 생성할때,

 */

public class Company {
    private static Company instance;  //자기자신의 이름으로 만듬
    private String name;

    private Company(){}          //생성자는 private

    public static Company getInstance(){
        if(instance ==null){
            instance = new Company();
        }
        return instance;
    }
}
