/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.coursework.dao;

import edu.ijse.coursework.dao.custom.impl.BookCategoryDaoImpl;
import edu.ijse.coursework.dao.custom.impl.BookDaoImpl;
import edu.ijse.coursework.dao.custom.impl.BorrowDaoImpl;
import edu.ijse.coursework.dao.custom.impl.LoginDaoImpl;
import edu.ijse.coursework.dao.custom.impl.MemberDaoImpl;
import edu.ijse.coursework.dao.custom.impl.ReturnDaoImpl;



/**
 *
 * @author Sithum
 */
public class DaoFactory {
    private static DaoFactory daoFactory;

    public DaoFactory() {
    }
    public static DaoFactory getInstance(){
        if (daoFactory==null){
            daoFactory=new DaoFactory();
        }
        return daoFactory;
    }
    public SuperDao getDao(DaoTypes type){
        switch(type){
            case MEMBER:
                return new MemberDaoImpl();
            case BOOK:
                return new BookDaoImpl();
             case BOOK_CATEGORY:
                return new BookCategoryDaoImpl();  
             case BORROW:
                 return new BorrowDaoImpl();
            case  RETURN:
                 return new ReturnDaoImpl();     
            case  SECURITY:
                 return new LoginDaoImpl();      
            default:
                return null;
                
                 
        }
        
    }
    
    public enum DaoTypes{
        MEMBER,BOOK,BOOK_CATEGORY,BORROW,RETURN,SECURITY
    }
    
    
    
    
}
