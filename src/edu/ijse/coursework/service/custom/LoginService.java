/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.coursework.service.custom;

import edu.ijse.coursework.dto.LoginDto;
import edu.ijse.coursework.service.SuperService;

/**
 *
 * @author Sithum
 */
public interface LoginService extends SuperService{
    String loginOperation(LoginDto loginDto)throws Exception;
    
}
