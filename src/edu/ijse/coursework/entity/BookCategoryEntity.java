/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.coursework.entity;

/**
 *
 * @author Sithum
 */
public class BookCategoryEntity {
    private String categoryId;
    private String bookCategory;

    public BookCategoryEntity() {
    }

    public BookCategoryEntity(String categoryId, String bookCategory) {
        this.categoryId = categoryId;
        this.bookCategory = bookCategory;
    }
    
    
    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(String bookCategory) {
        this.bookCategory = bookCategory;
    }
    
    
    
    
  
    
    
}
