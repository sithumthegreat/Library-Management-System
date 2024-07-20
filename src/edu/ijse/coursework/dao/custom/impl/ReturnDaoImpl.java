/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.coursework.dao.custom.impl;

import edu.ijse.coursework.dao.CrudDaoReturn;
import edu.ijse.coursework.dao.CrudUtil;
import edu.ijse.coursework.dao.custom.ReturnDao;
import edu.ijse.coursework.entity.ReturnEntity;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author Sithum
 */
public class ReturnDaoImpl implements ReturnDao{

    @Override
    public String save(ReturnEntity t) throws Exception {
        boolean isReturnSaved=CrudUtil.executeUpdate("INSERT INTO  return_table VALUES(?,?,?,?,?,?)", t.getMemberId(),t.getBookId(),t.getIssueDate(),t.getDueDate(),t.getReturningDate(),t.getFine());
        return isReturnSaved?"Success":"Fail";
    }

    @Override
    public String update(ReturnEntity t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ReturnEntity get(String id, String bId) throws Exception {
        ResultSet rst=CrudUtil.exeQuery("SELECT ISSUEDATE,RETURNDATE, CURRENT_DATE AS ReturningDate,  DATEDIFF(CURRENT_DATE, returnDate) AS daysDifference FROM BORROW WHERE MemberID=? AND BOOKID=?", id,bId);
        if (rst.next()){
            return new ReturnEntity(id,bId,rst.getDate("ISSUEDATE"),rst.getDate("RETURNDATE"),rst.getDate("ReturningDate"),rst.getInt("daysDifference"),(rst.getDouble("daysDifference")));
        }
        return null;
    }

    @Override
    public ArrayList<ReturnEntity> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}
