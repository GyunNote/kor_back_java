package com.study.ch21;


import javax.sound.midi.SoundbankResource;
import java.util.ArrayList;
import java.util.List;

public class ExceptionMain02 {
    public static void main(String[] args) {

        List<String> nameList = new ArrayList<>();
        nameList.add("김도균1");
        nameList.add("김도균2");
        nameList.add("김도균3");
        nameList.add("김도균4");
        nameList.add(null);
        nameList.add("김도균5");

        try {
            for (int i = 0; i < 7; i++) {
                String name = nameList.get(i);

                if (name.equals(("김도균5"))) {
                    System.out.println("찾아냈음");
                }
            }
        }catch(NullPointerException e){
           e.printStackTrace();     //예외가 뭔지 출력만 해줌

        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();

        }catch(Exception e){
            e.printStackTrace();

        }finally {
            System.out.println("이거는 무조건 실행됨");
        }
        System.out.println("프로그램 정상종료");
    }
}
