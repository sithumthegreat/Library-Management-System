/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.coursework.service.custom.impl;

import edu.ijse.coursework.dao.DaoFactory;
import edu.ijse.coursework.dao.custom.MemberDao;
import edu.ijse.coursework.dto.MemberDto;
import edu.ijse.coursework.entity.MemberEntity;
import edu.ijse.coursework.service.custom.MemberService;
import java.util.ArrayList;

/**
 *
 * @author Sithum
 */
public class MemberServiceImpl implements MemberService{
    private MemberDao memberDao=(MemberDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.MEMBER);

    @Override
    public String save(MemberDto memberDto) throws Exception {
        MemberEntity memberEntity=getMemberEntity(memberDto);
        return memberDao.save(memberEntity);
    }

    @Override
    public String update(MemberDto memberDto) throws Exception {
        MemberEntity memberEntity=getMemberEntity(memberDto);
        return memberDao.update(memberEntity);
    }

    @Override
    public String delete(String Id) throws Exception {
        return memberDao.delete(Id);
    }

    @Override
    public MemberDto get(String Id) throws Exception {
        MemberEntity memberEntity= memberDao.get(Id);
        if (memberEntity!=null){
            return new MemberDto(memberEntity.getMemberId(),memberEntity.getName(),memberEntity.getContactInfo(),memberEntity.getAddress());
            
        }
        return null;
    }

    @Override
    public ArrayList<MemberDto> getAll() throws Exception {
        ArrayList<MemberDto> memberDtos=new ArrayList<>();
        ArrayList<MemberEntity> memberEntities= memberDao.getAll();
        for (MemberEntity memberEntity:memberEntities){
            MemberDto memberDto=getMemberDto(memberEntity);
            memberDtos.add(memberDto);
            
        }
        return memberDtos;
    }
    public MemberDto getMemberDto(MemberEntity memberEntity) throws Exception{
        MemberDto dto=new MemberDto(memberEntity.getMemberId(),memberEntity.getName(),
        memberEntity.getContactInfo(),memberEntity.getAddress());
        return dto;
       
        
    }
    public MemberEntity getMemberEntity(MemberDto memberDto)throws Exception{
        MemberEntity memberEntity=new MemberEntity(memberDto.getMemberId(),memberDto.getName(),
        memberDto.getContactInfo(),memberDto.getAddress());
        return memberEntity;
    }
    
    
}
