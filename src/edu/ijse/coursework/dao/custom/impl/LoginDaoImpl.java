/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.coursework.dao.custom.impl;

import edu.ijse.coursework.dao.CrudUtil;
import edu.ijse.coursework.dao.custom.LoginDao;
import edu.ijse.coursework.entity.LoginEntity;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author Sithum
 */
public class LoginDaoImpl implements LoginDao{

    @Override
    public String save(LoginEntity t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String update(LoginEntity t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String delete(String id, String bId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String get(LoginEntity t) throws Exception {
        try {
        ResultSet rst=CrudUtil.exeQuery("SELECT * FROM security");
        String userName=rst.getString("USERNAME");
        String passWord=rst.getString("PASSWORD");
        if (userName.equals(t.getUsername()) & passWord.equals(t.getPassword())){
           return "Success";
        }else{
           return "Incorrect Username Or Password !";
        }
            
        } catch (Exception e) {
            return e.getMessage();
        }
       
    }

    @Override
    public ArrayList<LoginEntity> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

 
    
}
