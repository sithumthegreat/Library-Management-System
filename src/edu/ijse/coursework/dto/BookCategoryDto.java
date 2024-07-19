/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.coursework.dto;

/**
 *
 * @author Sithum
 */
public class BookCategoryDto {
    private String categoryId;
    private String bookCategory;

    public BookCategoryDto() {
    }

    public BookCategoryDto(String categoryId, String bookCategory) {
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

    @Override
    public String toString() {
        return "BookCategoryDto{" + "categoryId=" + categoryId + ", bookCategory=" + bookCategory + '}';
    }
    
    
   
    
    
}
