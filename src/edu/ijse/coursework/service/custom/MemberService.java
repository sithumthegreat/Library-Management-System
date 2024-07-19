/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.coursework.service.custom;

import edu.ijse.coursework.dto.MemberDto;
import edu.ijse.coursework.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author Sithum
 */
public interface MemberService extends SuperService{
    public String save(MemberDto memberDto)throws Exception;
    public String update(MemberDto memberDto)throws Exception;
    public String delete(String Id)throws Exception;
    public MemberDto get(String Id)throws Exception;
    public ArrayList<MemberDto> getAll() throws Exception;
    
    
}
