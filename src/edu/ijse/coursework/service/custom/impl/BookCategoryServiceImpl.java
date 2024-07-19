/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.coursework.service.custom.impl;

import edu.ijse.coursework.dao.DaoFactory;
import edu.ijse.coursework.dao.custom.BookCategoryDao;
import edu.ijse.coursework.dto.BookCategoryDto;
import edu.ijse.coursework.dto.BookDto;
import edu.ijse.coursework.entity.BookCategoryEntity;
import edu.ijse.coursework.service.custom.BookCategoryService;
import java.util.ArrayList;

/**
 *
 * @author Sithum
 */
public class BookCategoryServiceImpl implements BookCategoryService{
    private final BookCategoryDao bookCategoryDao= (BookCategoryDao)DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.BOOK_CATEGORY);

    @Override
    public String save(BookCategoryDto bookCategoryDto) throws Exception {
        BookCategoryEntity entity=getCategoryEntity(bookCategoryDto);
        return bookCategoryDao.save(entity);
    }

    @Override
    public String update(BookCategoryDto bookCategory) throws Exception {
        BookCategoryEntity entity=getCategoryEntity(bookCategory);
        return bookCategoryDao.update(entity);
    }

    @Override
    public String delete(String Id) throws Exception {
        return bookCategoryDao.delete(Id);
    }

    

    @Override
    public ArrayList<BookCategoryDto> getAll() throws Exception {
        ArrayList<BookCategoryDto> bookCategoryDtos=new ArrayList<>();
        ArrayList<BookCategoryEntity> bookCategoryEntities=bookCategoryDao.getAll();
        for (BookCategoryEntity bookCategoryEntity:bookCategoryEntities){
            BookCategoryDto dto=getCategoryDto(bookCategoryEntity);
            bookCategoryDtos.add(dto);
            
        }
        return bookCategoryDtos;
        
    }
    
    public BookCategoryDto getCategoryDto(BookCategoryEntity entity)throws Exception{
        return new BookCategoryDto(entity.getCategoryId(),entity.getBookCategory());
        
        
    }
    public BookCategoryEntity getCategoryEntity(BookCategoryDto dto)throws Exception{
        BookCategoryEntity entity= new BookCategoryEntity(dto.getCategoryId(),dto.getBookCategory());
        return entity;
        
    }

    @Override
    public BookCategoryDto get(String Id) throws Exception {
        BookCategoryEntity entity= bookCategoryDao.get(Id);
        return getCategoryDto(entity);
        
    }
    
    
    
}
