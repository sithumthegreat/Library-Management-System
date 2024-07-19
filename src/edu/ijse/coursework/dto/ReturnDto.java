/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.coursework.dto;

import java.util.Date;

/**
 *
 * @author Sithum
 */
public class ReturnDto {
    private String memberId;
    private String bookId;
    private Date boorowDate;
    private Date dueDate;
    private Date returningDate;
    private Integer  dateDiffernece;
    private Double fine;

    public ReturnDto() {
    }

    public ReturnDto(String memberId, String bookId, Date boorowDate, Date dueDate, Date returningDate, Integer dateDiffernece, Double fine) {
        this.memberId = memberId;
        this.bookId = bookId;
        this.boorowDate = boorowDate;
        this.dueDate = dueDate;
        this.returningDate = returningDate;
        this.dateDiffernece = dateDiffernece;
        this.fine = fine;
    }

    

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public Date getBoorowDate() {
        return boorowDate;
    }

    public void setBoorowDate(Date boorowDate) {
        this.boorowDate = boorowDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getReturningDate() {
        return returningDate;
    }

    public void setReturningDate(Date returningDate) {
        this.returningDate = returningDate;
    }

    public Integer getDateDiffernece() {
        return dateDiffernece;
    }

    public void setDateDiffernece(Integer dateDiffernece) {
        this.dateDiffernece = dateDiffernece;
    }

    public Double getFine() {
        return fine;
    }

    public void setFine(Double fine) {
        this.fine = fine;
    }
    
    

    @Override
    public String toString() {
        return "ReturnDto{" + "memberId=" + memberId + ", bookId=" + bookId + ", boorowDate=" + boorowDate + ", dueDate=" + dueDate + ", returningDate=" + returningDate + ", dateDiffernece=" + dateDiffernece + ", fine=" + fine + '}';
    }

    
    

    
    
    
    
}
