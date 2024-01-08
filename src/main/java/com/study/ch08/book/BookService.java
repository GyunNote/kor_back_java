package com.study.ch08.book;

public class BookService {
    BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    int isFull() {
       return bookRepository.getEmptyCount();
    }


    void addBook(Book book){

       bookRepository.insert(book);
    }

    boolean isNotEmpty(){
        return bookRepository.notN() > 0;
    }

}
