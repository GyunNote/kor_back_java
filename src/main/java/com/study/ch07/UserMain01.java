package com.study.ch07;

public class UserMain01 {
    public static void main(String[] args) {
        User01 user01 = new User01("aaa","1234");
        User01 user02 = new User01("bbb","1234","김준이","asdlnf@sdkaln");

        System.out.println("<user01의 정보>");
        System.out.println();
        user01.showInfo();
        System.out.println();
        System.out.println("<user02의 정보>");
        System.out.println();
        user02.showInfo();

        System.out.println();

        user01.setName("김도균");

        user01.setEmail("rlaehrbs1968@naver.com");

        System.out.println("<변경 후 user01의 정보>");
        System.out.println();
        user01.showInfo();
    }
}
