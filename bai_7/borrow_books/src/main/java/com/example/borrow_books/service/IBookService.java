package com.example.borrow_books.service;

import com.example.borrow_books.entity.Book;

import java.util.List;

public interface IBookService {
        List<Book> findAll();
        void save(Book book);
        Book findById(int id);
        boolean borrow(Book book,int usedCode);
        boolean returnBook(Book book,int usedCode);

}
