/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.coursework.dto;

/**
 *
 * @author Sithum
 */
public class BookDto {
    private String bookId;
    private String bookName;
    private String author;
    private Integer count;
    private String categoryId;
    

    public BookDto() {
    }

    public BookDto(String bookId, String bookName, String author, Integer count, String categoryId) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.count = count;
        this.categoryId = categoryId;
    }

    

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    

    @Override
    public String toString() {
        return "BookDto{" + "bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + ", count=" + count + '}';
    }
    
    
    
}
