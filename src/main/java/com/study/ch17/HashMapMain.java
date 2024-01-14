package com.study.ch17;

import java.util.HashMap;

public class HashMapMain {
    public static void main(String[] args) {

        HashMap<String,String> map = new HashMap<>();
        //순서가 없는데 키값으로 찾아가는


        map.put("1번학생","김도균1");
        map.put("2번학생","김도균2");
        map.put("3번학생","김도균3");
        map.put("4번학생","김도균4");

        System.out.println(map);
        System.out.println(map.get("1번학생"));

        map.remove("1번학생");
        System.out.println(map);
    }
}
