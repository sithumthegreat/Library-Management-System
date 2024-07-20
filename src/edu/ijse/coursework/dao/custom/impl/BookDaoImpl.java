/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.coursework.dao.custom.impl;

import edu.ijse.coursework.dao.CrudUtil;
import edu.ijse.coursework.dao.custom.BookDao;
import edu.ijse.coursework.entity.BookEntity;
import java.util.ArrayList;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Sithum
 */
public class BookDaoImpl implements BookDao {

    @Override
    public String save(BookEntity t) throws Exception {
        try {
            boolean isSaved=CrudUtil.executeUpdate("INSERT INTO books VALUES(?,?,?,?,?)", t.getBookId(),t.getBookName(),t.getAuthor(),
            t.getCount(),t.getCategoryId());
            return isSaved?"Success":"BookID already Exists or Invalid Category ID";
            
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    @Override
    public String update(BookEntity t) throws Exception {
        try {
            boolean isUpdated=CrudUtil.executeUpdate("UPDATE books SET book_name=?,AUTHOR=?, COUNT=?,CATEGORYID=? WHERE BOOKID=?", t.getBookName(),t.getAuthor(),t.getCount(),t.getCategoryId(),t.getBookId());
            return isUpdated?"Success":"Invalid Book ID or Category ID";
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    @Override
    public String delete(String id) throws Exception {
        try {
            boolean isDeleted=CrudUtil.executeUpdate("DELETE FROM books WHERE BOOKID=?", id);
            return isDeleted?"Success":"Fail";
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    @Override
    public BookEntity get(String id) throws Exception {
        ResultSet rst=CrudUtil.exeQuery("SELECT * FROM books WHERE BOOKID=?", id);
        if (rst.next()){
            return new BookEntity(rst.getString("BOOKID"),rst.getString("book_name"),rst.getString("AUTHOR"),Integer.parseInt(rst.getString("COUNT")),rst.getString("CATEGORYID"));
            
            
        }else{
            return null;
        }
    }

    @Override
    public ArrayList<BookEntity> getAll() throws Exception {
        ArrayList<BookEntity> bookentities=new ArrayList<>();
        ResultSet rst=CrudUtil.exeQuery("SELECT * FROM books");
        while(rst.next()){
            BookEntity bookEntity=new BookEntity(rst.getString("BOOKID"),rst.getString("Book_NAME"),rst.getString("AUTHOR"),Integer.parseInt(rst.getString("COUNT")),rst.getString("CATEGORYID"));
            
            bookentities.add(bookEntity);
            
        }
        return bookentities;
        
    }

    @Override
    public String delete(String id, String bId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
