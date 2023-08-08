package com.example.borrow_books.repository;

import com.example.borrow_books.entity.Book;
import com.example.borrow_books.entity.BookCode;
import org.springframework.data.repository.CrudRepository;

public interface IBookCodeRepo extends CrudRepository<BookCode, Integer> {

}
