/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.coursework.service.custom.impl;

import edu.ijse.coursework.dao.DaoFactory;
import edu.ijse.coursework.dao.custom.LoginDao;
import edu.ijse.coursework.dto.LoginDto;
import edu.ijse.coursework.entity.LoginEntity;
import edu.ijse.coursework.service.custom.LoginService;

/**
 *
 * @author Sithum
 */
public class LoginServiceImpl implements LoginService{
    private LoginDao loginDao= (LoginDao)DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.SECURITY);

    @Override
    public String loginOperation(LoginDto loginDto) throws Exception {
        LoginEntity entity=new LoginEntity(loginDto.getUserName(), loginDto.getPassword());
        return loginDao.get(entity);
    }
    
}
