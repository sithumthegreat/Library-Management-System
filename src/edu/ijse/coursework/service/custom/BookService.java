/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.coursework.service.custom;

import edu.ijse.coursework.dto.BookCategoryDto;
import edu.ijse.coursework.dto.BookDto;
import edu.ijse.coursework.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author Sithum
 */
public interface BookService extends SuperService{
    public String save(BookDto bookDto)throws Exception;
    public String update(BookDto bookDto)throws Exception;
    public String delete(String Id)throws Exception;
    public BookDto  get(String Id)throws Exception;
    public ArrayList<BookDto> getAll() throws Exception;

    
}
