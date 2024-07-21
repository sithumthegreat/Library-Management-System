/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.coursework.service.custom.impl;

import edu.ijse.coursework.dao.DaoFactory;
import edu.ijse.coursework.dao.custom.BookDao;
import edu.ijse.coursework.dao.custom.BorrowDao;
import edu.ijse.coursework.db.DBConnection;
import edu.ijse.coursework.dto.BorrowDto;
import edu.ijse.coursework.entity.BookEntity;
import edu.ijse.coursework.entity.BorrowEntity;
import edu.ijse.coursework.service.custom.BorrowService;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author Sithum
 */
public class BorrowServiceImpl implements BorrowService{
    private BookDao bookDao=(BookDao)DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.BOOK);
    private BorrowDao borrowDao= (BorrowDao)DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.BORROW);
    
    @Override
    public String placeBorrow(BorrowDto dto)throws Exception{
        Connection connection=DBConnection.getInstance().getconnection();
        try {
            connection.setAutoCommit(false);
            BookEntity bookCount=bookDao.get(dto.getBookId());
            if (bookCount.getCount()>0){
                BorrowEntity borrowEntity=new BorrowEntity(dto.getMemberId(),dto.getBookId(),dto.getIssueDate(),dto.getReturnDate());
                String rsp=borrowDao.save(borrowEntity);
                if (rsp.equals("Success")){
                    BookEntity bookEntity=bookDao.get(dto.getBookId());
                    bookEntity.setCount(bookEntity.getCount()-1);
                    String bookRsp=bookDao.update(bookEntity);
                    if (bookRsp.equals("Success")){
                        connection.commit();
                        return "Borrow Placed";
                    
                    }else{
                        connection.rollback();
                        return "Books Database Update Error!";
                }
                
                }else{
                    connection.rollback();
                    return "Borrow Saves Error!";
                }
                
                
            }else{
                connection.rollback();
                return "Book Not Available!";
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
    public ArrayList<BorrowDto> getAll() throws Exception {
        ArrayList<BorrowDto> borrowDtos=new ArrayList<>();
        ArrayList<BorrowEntity> entities=borrowDao.getAll();
        for (BorrowEntity entity:entities){
            BorrowDto dto=getBorrowDto(entity);
            borrowDtos.add(dto);
            
        }
        return borrowDtos;
    }
    
    public BorrowDto getBorrowDto(BorrowEntity entity)throws Exception{
        BorrowDto dto=new BorrowDto(entity.getMemberId(),entity.getBookId(),entity.getIssueDate(),entity.getReturnDate());
        return dto;
    }

   
    
    
    
}
