package com.study.ch08.car01;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Car01Main {
    public static void main(String[] args) {



    Scanner scanner = new Scanner(System.in);
    String selectedNum = null;
    boolean loop = true;
    Car01[] car01 = new Car01[3];

    while(loop) {
        System.out.println("자동차 관리 프로그램");
        System.out.println("1. 자동차 등록");
        System.out.println("2. 자동차 조회");
        System.out.println("q. 프로그램 종료");
        System.out.print("메뉴 선택 >>>");
        selectedNum = scanner.nextLine();

        if("q".equalsIgnoreCase(selectedNum)){
            System.out.println("프로그램을 종료");
            loop = false;
        }else if("1".equals(selectedNum)){
            System.out.println("<<< 자동차 등록 페이지 >>>");
            String model = null;
            String color = null;

            int emptyCount = 0;
            for(int i = 0;i< car01.length;i++){   //널의 개수 구하기
                if(car01[i] == null){
                    emptyCount++;
                }
            }
            if(emptyCount == 0){
                System.out.println("더이상 등록 불가");
            }else{

            }







        } else if ("2".equals(selectedNum)) {

        }else {
            System.out.println("다시 입력하세요");
        }

        }
            System.out.println("프로그램이 종료되었습니다.");
    }
}
