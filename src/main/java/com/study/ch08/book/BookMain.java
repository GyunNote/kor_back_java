package com.study.ch08.book;

import java.util.Scanner;

public class BookMain {
    //책 제목 , 저자
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String selectedNum = null;
        boolean loop = true;
        Book[] books = new Book[3];
        BookRepository bookRepository = new BookRepository(books);
        BookService bookService = new BookService(bookRepository);


        while(loop){
            System.out.println("책 등록 프로그램");
            System.out.println("1. 책 등록");
            System.out.println("2. 전체 책 조회");
            System.out.println("q. 프로그램 종료");
            System.out.print("메뉴선택 >>>");
            selectedNum = scanner.nextLine();


            if("1".equals(selectedNum)){

                System.out.println("<<책 등록 페이지>>");
                String number = null;
                String type = null;



                if(bookService.isFull() == 0){
                    System.out.println("더이상 등록 불가능");   // 등록
                    continue;
                }
                System.out.print("책 넘버>>>");
                number = scanner.nextLine();
                System.out.print("책 종류>>>");
                type = scanner.nextLine();

                Book book = new Book(number , type); //저장

                bookService.addBook(book);



            }else if("2".equals(selectedNum)){  //널값을 확인하고 다 널값이면 등록된거 없음

                System.out.println("<<책 조회 페이지>>");

                if(bookService.isNotEmpty()){
                    for (int i = 0; i < books.length; i++) {
                        if(books[i] == null) {
                            continue;
                        }
                        System.out.println(books[i].toString());
                    }
                }else {
                    System.out.println("등록된 책 없음");
                }


            }else if("q".equalsIgnoreCase(selectedNum)){
                System.out.println("프로그램을 종료합니다");
                loop =false;

            }else{
                System.out.println("다시 입력하세요");
            }


        }
        System.out.println("프로그램 종료");
    }
}
