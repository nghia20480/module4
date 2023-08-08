package com.example.borrow_books.service;

import com.example.borrow_books.entity.BookCode;

import java.util.List;

public interface IBookCodeService {
        List<BookCode> findAllBookCode();
        void save(BookCode bookCode);
        BookCode findById(int id);
}
