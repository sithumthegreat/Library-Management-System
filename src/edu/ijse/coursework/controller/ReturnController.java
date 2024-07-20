/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.coursework.controller;

import edu.ijse.coursework.dto.ReturnDto;
import edu.ijse.coursework.service.ServiceFactory;
import edu.ijse.coursework.service.SuperService;
import edu.ijse.coursework.service.custom.ReturnService;

/**
 *
 * @author Sithum
 */
public class ReturnController {
    private ReturnService service= (ReturnService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.RETURN);
            

    public ReturnDto get(String memberId, String bookId)throws Exception{
        return service.get(memberId, bookId);
        
    }

    

    public String placeReturn(ReturnDto dto)throws Exception{
        return service.save(dto);
      
    }
    
}
