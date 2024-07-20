/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.coursework.service.custom.impl;

import edu.ijse.coursework.dao.DaoFactory;
import edu.ijse.coursework.dao.custom.BookDao;
import edu.ijse.coursework.dao.custom.BorrowDao;
import edu.ijse.coursework.dao.custom.ReturnDao;
import edu.ijse.coursework.db.DBConnection;
import edu.ijse.coursework.dto.ReturnDto;
import edu.ijse.coursework.entity.BookEntity;
import edu.ijse.coursework.entity.ReturnEntity;
import edu.ijse.coursework.service.custom.ReturnService;
import java.sql.Connection;
import javax.crypto.interfaces.DHPublicKey;
/**
 *
 * @author Sithum
 */
public class ReturnServiceImpl implements ReturnService{
    private ReturnDao returnDao= (ReturnDao)DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.RETURN);
    private BorrowDao borrowDao= (BorrowDao)DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.BORROW);
    private BookDao bookDao=(BookDao)DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.BOOK);
    

    @Override
    public String save(ReturnDto returnDto) throws Exception {
        Connection connection=DBConnection.getInstance().getconnection();
       
        try {
            connection.setAutoCommit(false);
            ReturnEntity returnEntity=new ReturnEntity(returnDto.getMemberId(),returnDto.getBookId(),returnDto.getBoorowDate(),
            returnDto.getDueDate(),returnDto.getReturningDate(),returnDto.getFine());
            String returnRsp=returnDao.save(returnEntity);
            if (returnRsp.equals("Success")){
                BookEntity bookEntity=bookDao.get(returnDto.getBookId());
                bookEntity.setCount(bookEntity.getCount()+1);
                String bookRsp=bookDao.update(bookEntity);
                if (bookRsp.equals("Success")){
                    String borrowRsp=borrowDao.delete(returnEntity.getMemberId(),returnEntity.getBookId());
                    if (borrowRsp.equals("Success")){
                        connection.commit();
                        return "Return Placed!";
                        
                    }else{
                        connection.rollback();
                        return "bla bla bla";
                    }
                    
                }else{
                    connection.rollback();
                    return "Book Table Update Error!";
                    
                }
                
                
            }else{
                connection.rollback();
                return "Return Place Error!";
            }
            
            
        } catch (Exception e) {
            connection.rollback();
            e.printStackTrace();
            return e.getMessage();
        } finally {
            connection.setAutoCommit(true);
        }
       
    }

    @Override
    public ReturnDto get(String memberId, String bookId) throws Exception {
        ReturnEntity returnEntity= returnDao.get(memberId, bookId);
        return getReturnDto(returnEntity);
        
        
    }
    
    
    private ReturnDto getReturnDto (ReturnEntity entity)throws Exception{
      ReturnDto dto=new ReturnDto(entity.getMemberId(),entity.getBookId(),entity.getIssueDate(),entity.getDueDate(),entity.getReturningDate(),
      entity.getDateDifference(),entity.getFine());
      
      return dto;
        
        
    }
    
}
