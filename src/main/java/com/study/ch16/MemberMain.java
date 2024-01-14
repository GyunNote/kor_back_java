package com.study.ch16;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberMain {
  //  private static  ArrayList<Member> members = new ArrayList<Member>();

  //  public static String inputSearchName(String label) {
   //     Scanner scanner = new Scanner(System.in);
    //    System.out.println(label + ">>");
     //   return scanner.nextLine();
  //  }
   // public static Member findMemberByName(String name){
 //   for (Member member : members) {
  //      if (member.getName().equals(searchName)) {
  //          return member;
  //
  //       }
   //  }
   //   return null;
 //    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Member> members = new ArrayList<Member>();
        String selecNum = null;


        // Member member = new Member(name,address);       ?????
        // members.add(member);


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

            selecNum = scanner.nextLine();

            if ("q".equalsIgnoreCase(selecNum)) {
                break;
            } else if ("1".equals(selecNum)) {
                /*[회원등록]
                이름 >> ~~
                주소 >> ~~~
                <<등록이 완료되었습니다>> 가 나와야함        1,5,4,6,2,3
                 */
                String name = null;
                String address = null;
                System.out.println("[회원등록]");
                System.out.println();
                System.out.print("이름 >>");
                name = scanner.nextLine();

                System.out.print("주소 >>");
                address = scanner.nextLine();

                Member member = new Member(name, address);
                members.add(member);
                //members.add(new Member(name, address));
                System.out.println("<<등록이 완료되었습니다>>");
                continue;


            } else if ("2".equals(selecNum)) {
                //회원이름 수정하기
                //수정할 회원의 이름을 입력하세요
                //이름 >> ~~~
                //수정이 완료되었습니다
                String changeName = null;
                System.out.print("수정할 회원의 이름을 입력하세요 >>>");
                changeName = scanner.nextLine();
                System.out.println();
                for (int i = 0; i < members.size(); i++) {
                    if (changeName.equalsIgnoreCase(members.get(i).getName())) {
                        System.out.print("이름을 새로 입력하세요 >>>");
                        changeName = scanner.nextLine();
                        members.get(i).setName(changeName);
                    } else {
                        System.out.println("다시 입력하세요!!");
                    }
                }
                System.out.println("수정이 완료되었습니다!!");
                continue;


            } else if ("3".equals(selecNum)) {
                //회원 주소 수정하기
                //수정할 회원의 이름을 입력하세요 >>~~
                // 주소 >> ~~~~
                //수정이 완료되었습니다
                String changeName1 = null;
                String changeAddress = null;

                System.out.print("수정할 회원의 이름을 입력하세요 >>>");
                changeName1 = scanner.nextLine();
                System.out.println();
                for (int i = 0; i < members.size(); i++) {
                    if (changeName1.equalsIgnoreCase(members.get(i).getName())) {
                        System.out.print("주소를 새로 입력하세요>>>");
                        changeAddress = scanner.nextLine();
                        members.get(i).setAddress(changeAddress);
                    } else
                        System.out.println("다시 입력하세요");
                }
                System.out.println("수정이 완료되었습니다!!");
                continue;

            } else if ("4".equals(selecNum)) {     //4번이 강사님 방식 나머지는 내가 한거 차이점 확인하기!
                //회원 이름을 조회하기
                //조회할 회원의 이름을 입력하세요 >>~~
                //Member 객체의 toString() ;호출
                //조회가 완료됨
                String searchName = null;
               //  searchName = inputSearchName("조회할 회원의 이름을 입력하세요");
                System.out.print("조회할 회원의 이름을 입력하세요 >> ");
                searchName = scanner.nextLine();
                Member findMember = null;
                // int x =  members.indexOf(name);
                // System.out.println(members.get(x));

                for (Member member : members) {
                    if (member.getName().equals(searchName)) {
                        findMember = member;
                        break;
                    }

                }
                if (findMember == null) {
                    System.out.println("해당이름의 회원이 존재 x");
                    continue;
                }
                System.out.println(findMember);

                System.out.println(searchName + "이름으로 조회가 완료됨");

                // if(findMember == null) {                            이것도 내가 한거 방식 다른거 확인하기
                    /*
                for(int i =0 ;i< members.size();i++){
                    if(searchName.equalsIgnoreCase(members.get(i).getName())){
                        System.out.println(members.get(i));
                    }
                    */

                    } else if ("5".equals(selecNum)) {
                        //회원 전체 조회하기
                        //MemberList 전체반복 toString();
                        //조회가 완료됨
                        for (Member member : members) {
                            System.out.println(member);
                        }

                        System.out.println("<<조회가 완료됨>>");


                    } else if ("6".equals(selecNum)) {
                        //회원 이름을 삭제하기
                        //삭제할 회원의 이름을 입력하세요 >>~~
                        //삭제된 Member 객체 toString();
                        //삭제가 완료됨
                        String removeName = null;
                        System.out.print("삭제할 회원의 이름을 입력하세요 >>>");
                        removeName = scanner.nextLine();

                        for (int i = 0; i < members.size(); i++) {
                            if (removeName.equalsIgnoreCase(members.get(i).getName())) {
                                members.remove(i);
                                //members.remove(members.indexOf(findeMember))
                            }
                        }
                        System.out.println(removeName + "을 삭제 완료했습니다!!");
                        continue;

                    } else {
                        System.out.println("다시 선택하세요");
                    }
                    System.out.println();
                }
                System.out.println("프로그램 종료");
            }
        }
