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
public class BorrowDto {
    private String memberId;
    private String bookId;
    private Date issueDate;
    private Date returnDate;

    public BorrowDto() {
    }

    public BorrowDto(String memberId, String bookId, Date issueDate, Date returnDate) {
        this.memberId = memberId;
        this.bookId = bookId;
        this.issueDate = issueDate;
        this.returnDate = returnDate;
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

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "BorrowDto{" + "memberId=" + memberId + ", bookId=" + bookId + ", issueDate=" + issueDate + ", returnDate=" + returnDate + '}';
    }
    
    
}
