/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.coursework.service.custom;

import edu.ijse.coursework.dto.BorrowDto;
import edu.ijse.coursework.service.SuperService;

/**
 *
 * @author Sithum
 */
public interface BorrowService extends SuperService{
    String placeBorrow(BorrowDto borrowDto)throws Exception;
    
}
