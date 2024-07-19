/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.coursework.controller;

import edu.ijse.coursework.dto.MemberDto;
import edu.ijse.coursework.service.ServiceFactory;
import edu.ijse.coursework.service.custom.MemberService;
import java.util.ArrayList;

/**
 *
 * @author Sithum
 */
public class MemberController {
    public MemberService memberService= (MemberService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.MEMBER);
    
    public ArrayList<MemberDto> getAll()throws Exception{
        return memberService.getAll();
        
    }

    public String save(MemberDto memberDto) throws Exception{
        return memberService.save(memberDto);
    }

    public String update(MemberDto memberDto) throws Exception{
        return memberService.update(memberDto);
    }

    public MemberDto get(String id) throws Exception {
       return memberService.get(id);
    }

    public String deleteMember(String memberId) throws Exception{
       return memberService.delete(memberId);
    }

    
       
    
}
