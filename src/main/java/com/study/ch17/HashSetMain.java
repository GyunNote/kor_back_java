package com.study.ch17;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class HashSetMain {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        //순서가 없음

       nameList.add("김도균1");
       nameList.add("김도균2");
       nameList.add("김도균2");
       nameList.add("김도균3");
       nameList.add("김도균4");
       nameList.add("김도균4");

        HashSet<String> names = new HashSet<>();
        names.addAll(nameList);

        System.out.println(names);

        ArrayList<String> newNameList = new ArrayList<>();
        newNameList.addAll(names);

        System.out.println(newNameList.get(1));

        System.out.println(Objects.hash(("44")));
        System.out.println(Objects.hash(("41")));
        System.out.println(Objects.hash(("446")));
        System.out.println(Objects.hash(("442")));
    }
}
