package com.study.ch08.book;

public class BookRepository {
    Book[] books;

    public BookRepository(Book[] books) {
        this.books = books;
    }

    int getEmptyCount(){
        int emptyCount = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                emptyCount++;
            }
        }return emptyCount;
    }


    void insert(Book book){
        System.out.println(book.toString());

        for(int i = 0; i< books.length;i++){
            if(books[i] == null){
                books[i] = book;
                break;
            }
        }
    }
    int notN(){
        int empty =0;
        for(int i =0;i<books.length;i++){
            if(books[i] != null){
                empty++;
            }
        }return empty;
    }





}
