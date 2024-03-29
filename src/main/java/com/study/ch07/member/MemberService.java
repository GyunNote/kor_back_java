package com.study.ch07.member;

import java.util.Scanner;

public class MemberService {

    String inputValue(String label){
        Scanner scanner = new Scanner(System.in);
        String value = null;

        while(true){
            System.out.println(label + "(입력취소 : exit) >>>");
            value = scanner.nextLine();
            System.out.println();

            if(!value.isBlank()) {
                break;
            }
        }
        return value;
    }

    boolean addMember(){
        String code = null;
        String name = null;
        String age = null;
        String address = null;

        System.out.println("<<< 회원등록 >>>");
        code = inputValue("회원코드");
        if("exit".equalsIgnoreCase("code")) {
            return false;     // return false 가 되면 코드를 빠져나간다
        }
        name = inputValue("이름");
        if("exit".equalsIgnoreCase("name")) {
            return false;
        }
        age = inputValue("나이");
        if("exit".equalsIgnoreCase("age")) {
            return false;
        }
        address = inputValue("주소");
        if("exit".equalsIgnoreCase("address")) {
            return false;
        }
        //member 라는 Member객체 생성
        Member member = new Member(code,name , Integer.parseInt(age), address);

        MemberRepository memberRepository = new MemberRepository();
        return memberRepository.insert(member) > 0;
    }
}
