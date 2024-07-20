/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.coursework.dao.custom.impl;

import edu.ijse.coursework.dao.CrudUtil;
import edu.ijse.coursework.dao.custom.MemberDao;
import edu.ijse.coursework.entity.MemberEntity;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author Sithum
 */
public class MemberDaoImpl implements MemberDao{

    @Override
    public String save(MemberEntity t) throws Exception {
        try {
            boolean isSaved=CrudUtil.executeUpdate("INSERT INTO members VALUES(?,?,?,?)", t.getMemberId(),t.getName(),t.getContactInfo(),t.getAddress());
            return isSaved?"Success":"Fail";
            
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    @Override
    public String update(MemberEntity t) throws Exception {
        try {
            boolean isUpdated=CrudUtil.executeUpdate("UPDATE  members SET name=?,ContactInfo=?,Address=? WHERE MemberID=? ", t.getName(),t.getContactInfo(),t.getAddress(),t.getMemberId());
            return isUpdated?"Success":"Fail";
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    @Override
    public String delete(String id) throws Exception {
        try {
            boolean isdeleted=CrudUtil.executeUpdate("DELETE FROM members WHERE MemberID=?", id);
            return isdeleted?"Success":"Fail";
        } catch (Exception e) {
            return e.getMessage();
        }
        
    }

    @Override
    public MemberEntity get(String id) throws Exception {
        ResultSet rst=CrudUtil.exeQuery("SELECT * FROM members WHERE MemberID=?", id);
        if (rst.next()){
            return new MemberEntity(rst.getString("MemberID"),rst.getString("Name"),rst.getString("ContactInfo"),rst.getString("Address"));
            
        }
        return null;
    }
        

    @Override
    public ArrayList<MemberEntity> getAll() throws Exception {
        ArrayList<MemberEntity> memberEntities=new ArrayList<>();
        ResultSet rst=CrudUtil.exeQuery("SELECT * FROM members");
        while (rst.next()){
            MemberEntity memberEntity=new MemberEntity(rst.getString("MemberId"),rst.getString("Name"),rst.getString("ContactInfo"),rst.getString("Address"));
            memberEntities.add(memberEntity);
            
        }
        return memberEntities;
        
        
    }

    @Override
    public String delete(String id, String bId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

    
    
    
}
