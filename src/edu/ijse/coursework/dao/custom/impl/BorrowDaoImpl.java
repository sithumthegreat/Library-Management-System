/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.coursework.dao.custom.impl;

import edu.ijse.coursework.dao.CrudUtil;
import edu.ijse.coursework.dao.custom.BorrowDao;
import edu.ijse.coursework.entity.BorrowEntity;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Sithum
 */
public class BorrowDaoImpl implements BorrowDao{

    @Override
    public String save(BorrowEntity t) throws Exception {
        boolean isBorrowSaved=CrudUtil.executeUpdate("INSERT INTO borrow VALUES(?,?,?,?)", t.getMemberId(),t.getBookId(),t.getIssueDate(),t.getReturnDate());
        return isBorrowSaved?"Success":"Fail";
    }

    @Override
    public String update(BorrowEntity t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public BorrowEntity get(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<BorrowEntity> getAll() throws Exception {
        ArrayList<BorrowEntity> entities=new ArrayList<>();
        ResultSet rst=CrudUtil.exeQuery("SELECT * FROM borrow");
        while(rst.next()){
             SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
             Date issueDate=rst.getDate("ISSUEDATE");
             Date returnDate=rst.getDate("RETURNDATE");
            
             BorrowEntity entity=new BorrowEntity(rst.getString("MemberID"),rst.getString("BOOKID"),issueDate,returnDate);
             entities.add(entity);
        }
        return entities;
        
    }

    @Override
    public String delete(String id, String bId) throws Exception {
        try {
            boolean isDeleted=CrudUtil.executeUpdate("DELETE FROM borrow WHERE MemberID=? and BOOKID=? ", id,bId);
            return isDeleted?"Success":"Fail";
        } catch (Exception e) {
            return e.getMessage();
        }
    }
    
}
