package com.example.borrow_books.entity;


import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
public class Book {
    @Id
    @GeneratedValue
    @Column(name="book_id")
    private int book_id;
    @NotBlank(message = "Tiêu đề không được để trống")
    private String title;
    @NotBlank(message = "Tên tác giả k được để trống")
    private String author;
    @Min(value=1,message = "số lượng phải lớn hơn hoặc bằng 1")
    private int quantity;

    @OneToMany(mappedBy = "book")
    private List<BookCode> codeList;

    public Book() {
    }

    public Book(int book_id, String title, String author, int quantity, List<BookCode> codeList) {
        this.book_id = book_id;
        this.title = title;
        this.author = author;
        this.quantity = quantity;
        this.codeList = codeList;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public List<BookCode> getCodeList() {
        return codeList;
    }

    public void setCodeList(List<BookCode> codeList) {
        this.codeList = codeList;
    }
}
