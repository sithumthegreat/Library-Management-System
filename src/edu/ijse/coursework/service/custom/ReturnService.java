/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.coursework.service.custom;

import edu.ijse.coursework.dto.ReturnDto;
import edu.ijse.coursework.service.SuperService;

/**
 *
 * @author Sithum
 */
public interface ReturnService extends SuperService{
    public String save(ReturnDto returnDto)throws Exception;
    public ReturnDto get(String memberId,String bookId)throws Exception;
    //new Edit
}
