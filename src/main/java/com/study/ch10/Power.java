package com.study.ch10;

public interface Power {        //인터페이스는 기본적으로 추상메소드 abstract 생략되있음   ,  변수선언 불가능
    String ERROR_CODE = "9999";       //상수선언만 가능

    void setPowerOn();
    void setPowerOff();

    default void test(){           //인터페이스에서는 default 를 붙이면 일반 메소드 사용가능  안붙이면 추상메소드가 됨 (추상클래스랑 반대)
                                    // 추상클래스는 다중상속 불가능, 인터페이스는 가능


    }
}
