/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.coursework.controller;

import edu.ijse.coursework.dto.BookCategoryDto;
import edu.ijse.coursework.dto.BookDto;
import edu.ijse.coursework.service.ServiceFactory;
import edu.ijse.coursework.service.custom.BookCategoryService;
import java.util.ArrayList;

/**
 *
 * @author Sithum
 */
public class BookCategoryController {
    private final BookCategoryService bookCategoryService= (BookCategoryService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.BOOK_CATEGORY);

    public ArrayList<BookCategoryDto> getAll() throws Exception{
        return bookCategoryService.getAll();
    }

    public BookCategoryDto get(String id) throws Exception{
        return bookCategoryService.get(id);
    }

    public String save(BookCategoryDto dto) throws Exception{
        return bookCategoryService.save(dto);
        
    }

    public String update(BookCategoryDto dto) throws Exception {
        return bookCategoryService.update(dto);
    }

    public String delete(String id)throws Exception{
        return bookCategoryService.delete(id);
    }

    
    
}
