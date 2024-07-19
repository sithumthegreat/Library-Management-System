/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.coursework.dto;

/**
 *
 * @author Sithum
 */
public class MemberDto {
    private String  memberId;
    private String name;
    private String ContactInfo;
    private String address;
    

    public MemberDto() {
    }

    public MemberDto(String memberId, String name, String ContactInfo, String address) {
        this.memberId = memberId;
        this.name = name;
        this.ContactInfo = ContactInfo;
        this.address = address;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return ContactInfo;
    }

    public void setContactInfo(String ContactInfo) {
        this.ContactInfo = ContactInfo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "MemberDto{" + "memberId=" + memberId + ", name=" + name + ", ContactInfo=" + ContactInfo + ", address=" + address + '}';
    }

    

   
    
}
