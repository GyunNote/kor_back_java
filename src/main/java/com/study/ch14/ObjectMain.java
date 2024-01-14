package com.study.ch14;

import com.study.ch13.B;
import lombok.Getter;

public class ObjectMain {
    public static void main(String[] args) {
        ObjectTest objectTest = new ObjectTest("김도균", "동래구");

        System.out.println(objectTest.toString());
        System.out.println(objectTest);

        System.out.println();

        ObjectTest objectTest1 = new ObjectTest("김도균", "동래구");
        System.out.println(objectTest.equals(objectTest1));
        System.out.println(objectTest == objectTest1);
        System.out.println();
        System.out.println(objectTest.getClass());
        System.out.println(objectTest1.getClass());
        System.out.println(ObjectTest.class);

        System.out.println();


        System.out.println(objectTest1.hashCode());
        System.out.println(objectTest.hashCode());
    }
}
