package com.example.borrow_books.service.impl;

import com.example.borrow_books.entity.Book;
import com.example.borrow_books.entity.BookCode;
import com.example.borrow_books.repository.IBookRepo;
import com.example.borrow_books.service.IBookCodeService;
import com.example.borrow_books.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class BookServiceImpl implements IBookService {
    @Autowired
    IBookRepo iBookRepo;

    @Autowired
    IBookCodeService iBookCodeService;

    @Override
    public List<Book> findAll() {
        return (List<Book>) iBookRepo.findAll();
    }

    @Override
    public void save(Book book) {
        iBookRepo.save(book);
        for (int i = 0; i < book.getQuantity(); i++) {
            int n = 10000 + new Random().nextInt(90000);
            BookCode code = new BookCode(n, "not borrowed",book);
            iBookCodeService.save(code);
        }
    }

    @Override
    public Book findById(int id) {
        return iBookRepo.findById(id).orElse(null);
    }

    @Override
    public boolean borrow(Book book, int usedCode) {
        return false;
    }

    @Override
    public boolean returnBook(Book book, int usedCode) {
        return false;
    }
}
