package com.study.ch16;

import java.util.ArrayList;
import java.util.Scanner;

public class Member05Main {

   static ArrayList<Member05> member05s = new ArrayList<>();

   public static String inputSearchName(String label){
       Scanner scanner = new Scanner(System.in);
       System.out.println(label + ">>");
       return scanner.nextLine();
   }


    public static Member05 findMemberByName(String name){
        for(Member05 member05 : member05s){
            if(member05.getName().equalsIgnoreCase(name)){
                return member05;
            }
        }
        return null;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String selectNum = null;

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

            selectNum = scanner.nextLine();

            if("q".equalsIgnoreCase(selectNum)){
                break;
            }else if("1".equalsIgnoreCase(selectNum)){
                String name = null;
                String address = null;

                System.out.println("[회원등록]");
                System.out.println();
                System.out.println("이름>>");
                name = scanner.nextLine();
                System.out.println("주소>>");
                address = scanner.nextLine();

                Member05 member05 = new Member05(name, address);
                member05s.add(member05);
                System.out.println("<<등록이 완료되었습니다>>");


            }
            else if("2".equalsIgnoreCase(selectNum)){
                String searchName = inputSearchName("회원명 : ");
                Member05 findMember = findMemberByName(searchName);

                if(findMember ==null){
                    System.out.println("해당회원이 존재 x");
                    continue;
                }
                System.out.print("이름 : ");
                String changeName = scanner.nextLine();
                findMember.setName(changeName);
                System.out.println("수정이 완료되었습니다");

            }
            else if("3".equalsIgnoreCase(selectNum)){
                String searchName = inputSearchName("회원명 : ");
                Member05 findMember = findMemberByName(searchName);

                if(findMember ==null){
                    System.out.println("해당회원이 존재 x");
                    continue;
                }
                System.out.print("주소 : ");
                String changeAddress = scanner.nextLine();
                findMember.setAddress(changeAddress);
                System.out.println("수정이 완료되었습니다");


            }
            else if("4".equalsIgnoreCase(selectNum)){
                String searchName = null;

                System.out.println("[회원이름 조회]");
                searchName = inputSearchName("조회할 회원의 이름 입력>>");

                Member05 findMember = findMemberByName(searchName);

                if(findMember ==null){
                    System.out.println("해당회원이 존재하지 않습니다.");
                    continue;
                }
                System.out.println(findMember);
                System.out.println(searchName + "이름으로 조회 완료됨");

            }

            else if("5".equalsIgnoreCase(selectNum)){
                for(Member05 member05 : member05s){
                    System.out.println(member05);
                }
                System.out.println("조회가 완료됨");

            }

            else if("6".equalsIgnoreCase(selectNum)){
                String searchName = null;
                Member05 findMember = null;
                if(findMember == null){
                    System.out.println("해당회원 존재하지 않습니다");
                    continue;
                }
                for(Member05 member05 : member05s) {
                    if(member05.getName().equalsIgnoreCase(searchName)) {
                        findMember = member05;
                         }
                    }

                    member05s.remove(findMember);
                    System.out.println("삭제가 완료됨");

            }else{
                System.out.println("다시 선택하세요");
            }
            System.out.println();
        }
        System.out.println("프로그램 종료");
    }
}
