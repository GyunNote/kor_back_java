package com.study.ch16;

import java.util.ArrayList;
import java.util.Scanner;

public class Member09Main {

    public static ArrayList<Member09> member09s = new ArrayList<>();


    public static Member09 findMem(String searchName){
        for(Member09 member09 : member09s){
            if(member09.getName().equalsIgnoreCase(searchName)){
                return member09;
            }
        }return null;
    }



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String selectMenu = null;

        while (true) {
            System.out.println("회원 관리 프로그램");
            System.out.println("1. 회원등록");
            System.out.println("2. 회원이름수정");
            System.out.println("3. 회원 주소 수정");
            System.out.println("4. 회원이름으로 조회");
            System.out.println("5. 회원 전체 조회");
            System.out.println("6. 회원 삭제");
            System.out.println("q. 프로그램 종료");
            System.out.print("메뉴선택 >>>");

            selectMenu = scanner.nextLine();


            if("q".equalsIgnoreCase(selectMenu)){
                break;
            }else if("1".equalsIgnoreCase(selectMenu)){
                String name = null;
                String address = null;

                System.out.println("[회원등록]");
                System.out.print("이름 >>");
                name = scanner.nextLine();
                System.out.println("주소 >>");
                address = scanner.nextLine();

                Member09 member09 = new Member09(name, address);
                member09s.add(member09);
                System.out.println("등록이 완료되었습니다.");


            }else if("2".equalsIgnoreCase(selectMenu)){
                System.out.println("회원 이름 수정");


            }else if("3".equalsIgnoreCase(selectMenu)){
                System.out.println("회원 주소 수정");


            }else if("4".equalsIgnoreCase(selectMenu)){

                System.out.println("회원 이름으로 조회");
                System.out.print("이름 >>");
                String searchName = null;

                searchName = scanner.nextLine();

                if(searchName == null) {
                    System.out.println("해당 회원은 없습니다");
                    continue;
                }

                System.out.println("조회가 완료되었습니다");



            }else if("5".equalsIgnoreCase(selectMenu)){
                System.out.println("회원 전체 조회");
                for(Member09 member09 : member09s){
                    System.out.println(member09);
                }
                System.out.println("조회가 완료됨!!");


            }else if("6".equalsIgnoreCase(selectMenu)){
                System.out.println("[회원 삭제]");
                System.out.print("삭제할 사람의 이름 >>");
                String searchName = null;
                Member09 correctName = null;

                searchName = scanner.nextLine();


                if(searchName == null) {
                    System.out.println("해당 회원은 없습니다");
                    continue;
                }
                for(Member09 member09 : member09s){
                    if(member09.getName().equalsIgnoreCase(searchName)){
                        correctName = member09;
                    }
                }
                member09s.remove(correctName);
                System.out.println("삭제가 완료되었습니다");

            }else{
                System.out.println("다시 선택하세요");
            }
            System.out.println();
        }
        System.out.println("프로그램 종료");
    }

}