/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.coursework.service;

import edu.ijse.coursework.service.custom.impl.BookCategoryServiceImpl;
import edu.ijse.coursework.service.custom.impl.BookServiceImpl;
import edu.ijse.coursework.service.custom.impl.BorrowServiceImpl;
import edu.ijse.coursework.service.custom.impl.LoginServiceImpl;
import edu.ijse.coursework.service.custom.impl.MemberServiceImpl;
import edu.ijse.coursework.service.custom.impl.ReturnServiceImpl;

 


/**
 *
 * @author Sithum
 */
public class ServiceFactory {
    private static ServiceFactory serviceFactory;
    
    private ServiceFactory(){
        
    } 
    public static ServiceFactory getInstance(){
        if(serviceFactory==null){
            serviceFactory=new ServiceFactory();
        }
        return serviceFactory;
    }
    
      public SuperService getService(ServiceType type){
        switch (type) {
            case MEMBER:
                return new MemberServiceImpl();
            case BOOK:
                return new BookServiceImpl();
            case BOOK_CATEGORY:
                return new BookCategoryServiceImpl();   
            case BORROW:
                return new BorrowServiceImpl();
                
            case RETURN:
                return new ReturnServiceImpl();    
                
            case SECURITY:
                return new LoginServiceImpl();    
            default:
                return null;
        }
    }
      
      public enum ServiceType{
        MEMBER,BOOK,BOOK_CATEGORY,BORROW,RETURN,SECURITY
    }
    
}
