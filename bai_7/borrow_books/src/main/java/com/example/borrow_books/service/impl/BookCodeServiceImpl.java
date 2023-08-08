package com.example.borrow_books.service.impl;

import com.example.borrow_books.entity.BookCode;
import com.example.borrow_books.repository.IBookCodeRepo;
import com.example.borrow_books.service.IBookCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookCodeServiceImpl implements IBookCodeService {
    @Autowired
    IBookCodeRepo iBookCodeRepo;

    @Override
    public List<BookCode> findAllBookCode() {
        return (List<BookCode>) iBookCodeRepo.findAll();
    }

    @Override
    public void save(BookCode bookCode) {

    }

    @Override
    public BookCode findById(int id) {
        return iBookCodeRepo.findById(id).orElse(null);
    }
}
