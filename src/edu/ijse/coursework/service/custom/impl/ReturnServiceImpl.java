/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.coursework.service.custom.impl;

import edu.ijse.coursework.dao.DaoFactory;
import edu.ijse.coursework.dao.custom.ReturnDao;
import edu.ijse.coursework.dto.ReturnDto;
import edu.ijse.coursework.entity.ReturnEntity;
import edu.ijse.coursework.service.custom.ReturnService;

/**
 *
 * @author Sithum
 */
public class ReturnServiceImpl implements ReturnService{
    private ReturnDao returnDao= (ReturnDao)DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.RETURN);

    @Override
    public String save(ReturnDto returnDto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
