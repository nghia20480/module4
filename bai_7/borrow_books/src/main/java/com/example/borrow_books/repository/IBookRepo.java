package com.example.borrow_books.repository;

import com.example.borrow_books.entity.Book;
import org.springframework.data.repository.CrudRepository;

public interface IBookRepo extends CrudRepository<Book, Integer> {
}
