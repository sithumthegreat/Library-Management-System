/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.coursework.entity;

import java.util.Date;

/**
 *
 * @author Sithum
 */
public class ReturnEntity {
    
    private String memberId;
    private String bookId;
    private Date issueDate;
    private Date dueDate;
    private Date returningDate;
    private Integer dateDifference;
    private Double fine;

    public ReturnEntity() {
    }

    public ReturnEntity(String memberId, String bookId, Date issueDate, Date dueDate, Date returningDate, Integer dateDifference, Double fine) {
        this.memberId = memberId;
        this.bookId = bookId;
        this.issueDate = issueDate;
        this.dueDate = dueDate;
        this.returningDate = returningDate;
        this.dateDifference = dateDifference;
        this.fine = fine;
    }

    public ReturnEntity(String memberId, String bookId, Date issueDate, Date dueDate, Date returningDate, Double fine) {
        this.memberId = memberId;
        this.bookId = bookId;
        this.issueDate = issueDate;
        this.dueDate = dueDate;
        this.returningDate = returningDate;
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

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
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

    public Integer getDateDifference() {
        return dateDifference;
    }

    public void setDateDifference(Integer dateDifference) {
        this.dateDifference = dateDifference;
    }

    public Double getFine() {
        return fine;
    }

    public void setFine(Double fine) {
        this.fine = fine;
    }

    @Override
    public String toString() {
        return "ReturnEntity{" + "memberId=" + memberId + ", bookId=" + bookId + ", issueDate=" + issueDate + ", dueDate=" + dueDate + ", returningDate=" + returningDate + ", dateDifference=" + dateDifference + ", fine=" + fine + '}';
    }
    
    
    
}
