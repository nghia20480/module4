package com.example.borrow_books.entity;


import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class BookCode {

    @Id
    @GeneratedValue
    private int id;
    @Range(min = 10000, max = 99999)
    private int book_code;
    @NotBlank(message = "trạng thái k được để trống")
    private String status;
    @ManyToOne
    @JoinColumn(name = "book_id",referencedColumnName = "book_id")
    private Book book;

    public BookCode() {
    }

    public BookCode(int id, int book_code, String status, Book book) {
        this.id = id;
        this.book_code = book_code;
        this.status = status;
        this.book = book;
    }

//    public BookCode(int n, String not_borrowed, Book book) {
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBook_code() {
        return book_code;
    }

    public void setBook_code(int book_code) {
        this.book_code = book_code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
