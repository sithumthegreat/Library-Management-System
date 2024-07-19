/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.coursework.entity;

/**
 *
 * @author Sithum
 */
public class MemberEntity {
    private String memberId;
    private String name;
    private String contactInfo;
    private String address;

    public MemberEntity() {
    }

    public MemberEntity(String memberId, String name, String contactInfo, String address) {
        this.memberId = memberId;
        this.name = name;
        this.contactInfo = contactInfo;
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
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "MemberEntity{" + "memberId=" + memberId + ", name=" + name + ", contactInfo=" + contactInfo + ", address=" + address + '}';
    }

    
    
    
}
