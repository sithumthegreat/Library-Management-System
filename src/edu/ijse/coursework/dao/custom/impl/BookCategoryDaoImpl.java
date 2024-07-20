/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.coursework.dao.custom.impl;

import edu.ijse.coursework.dao.CrudUtil;
import edu.ijse.coursework.dao.custom.BookCategoryDao;
import edu.ijse.coursework.entity.BookCategoryEntity;
import edu.ijse.coursework.entity.BookEntity;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author Sithum
 */
public class BookCategoryDaoImpl implements BookCategoryDao{

    @Override
    public String save(BookCategoryEntity t) throws Exception {
        try {
            boolean isSaved=CrudUtil.executeUpdate("INSERT INTO bookcategory VALUES(?,?)",t.getCategoryId(),t.getBookCategory());
            return isSaved?"Success":"Fail";
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    @Override
    public String update(BookCategoryEntity t) throws Exception {
        try {
            boolean isUpdated=CrudUtil.executeUpdate("UPDATE bookcategory  SET Book_Category=?  WHERE categoryId=?", t.getBookCategory(),t.getCategoryId());
            return isUpdated?"Success":"Fail";
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    @Override
    public String delete(String id) throws Exception {
        try {
            boolean isDeleted=CrudUtil.executeUpdate("DELETE FROM bookcategory WHERE categoryId=?", id);
            return isDeleted?"Success":"Fail";
        } catch (Exception e) {
            return e.getMessage();
        }
    }

   

    @Override
    public ArrayList<BookCategoryEntity> getAll() throws Exception {
        ArrayList<BookCategoryEntity> bookCategoryEntities=new ArrayList<>();
        ResultSet rst=CrudUtil.exeQuery("SELECT * FROM bookcategory");
        while(rst.next()){
            BookCategoryEntity bookCategoryEntity= new BookCategoryEntity(rst.getString("categoryId"),rst.getString("Book_Category"));
            bookCategoryEntities.add(bookCategoryEntity);
        }
        return bookCategoryEntities;
    }

    @Override
    public BookCategoryEntity get(String id) throws Exception {
        ResultSet rst=CrudUtil.exeQuery("SELECT * FROM bookcategory WHERE categoryId=?", id);
        if (rst.next()){
            return new BookCategoryEntity(rst.getString("categoryId"),rst.getString("Book_Category"));
                
        }
        return null;
      
    }

    @Override
    public String delete(String id, String bId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    

    

  
    
}
