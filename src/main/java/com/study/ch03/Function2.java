package com.study.ch03;

public class Function2 {
    //매개변수, 리턴 x
    public static void fx01(){
        //void -->비어있는 , 공허한
        System.out.println("fx01 함수 실행");
        System.out.println();

    }
    //같은 함수 이름에 매개변수의 자료형이 다른면 함수 정의가 가능 : 오버로딩
    public static void fx02(int age, String name){
        System.out.println("fx02 함수 실행");
        System.out.println("나이 : " + age );
        System.out.println("이름 : " + name);
        System.out.println();
    }
    public static int fx03(){             // static 을 지우려면 밑에서 Function2를 새로 만들어주고 그걸 fx03를 쓰는곳에서 참조해주기
        System.out.println("fx03함수실행");
        return 100;

    }
    public static String fx04(String name, int age){
        return "이름은 " + name + "," + "나이는 " + age;

    }

    public static void main(String[] args) {
        fx01();
        fx02(27 , "김도균");
        Function2 function2 = new Function2();

        int num = fx03();
        System.out.println(fx03());

        System.out.println(fx04("김도균", 27));

        String result = fx04("김도균", 27);
        System.out.println(result);
    }
}
