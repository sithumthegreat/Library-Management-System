/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.coursework.controller;

import edu.ijse.coursework.dto.BookDto;
import edu.ijse.coursework.service.ServiceFactory;
import edu.ijse.coursework.service.custom.BookService;
import java.util.ArrayList;

/**
 *
 * @author Sithum
 */
public class BookController {
    private BookService service= (BookService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.BOOK);

    public ArrayList<BookDto> getAll() throws Exception{
        return service.getAll();
    }

    public String save(BookDto bookDto)throws Exception{
        return service.save(bookDto);
    }

    public String update(BookDto bookDto)throws Exception{
        return service.update(bookDto);
    }

    public BookDto get(String code)throws Exception{
        return service.get(code);
    }

    public String delete(String code)throws Exception{
        return service.delete(code);
    }

    
    
}
