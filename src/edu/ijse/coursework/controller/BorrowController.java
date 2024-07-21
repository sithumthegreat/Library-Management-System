/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.coursework.controller;

import edu.ijse.coursework.dto.BorrowDto;
import edu.ijse.coursework.service.ServiceFactory;
import edu.ijse.coursework.service.custom.BorrowService;
import java.util.ArrayList;

/**
 *
 * @author Sithum
 */
public class BorrowController {
    private BorrowService service= (BorrowService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.BORROW);
    
    public String placeBorrow(BorrowDto borrowDto) throws Exception{
        return service.placeBorrow(borrowDto);
        
    }

    public ArrayList<BorrowDto> getAll()throws Exception{
       return service.getAll();
    }
    
}
