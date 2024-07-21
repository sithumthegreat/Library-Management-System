/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.coursework.controller;

import edu.ijse.coursework.dto.LoginDto;
import edu.ijse.coursework.service.ServiceFactory;
import edu.ijse.coursework.service.custom.LoginService;

/**
 *
 * @author Sithum
 */
public class LoginController {
    private LoginService loginService= (LoginService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.SECURITY);

    public String loginOperation(LoginDto dto)throws Exception{
        return loginService.loginOperation(dto);
    
    }
    
}
