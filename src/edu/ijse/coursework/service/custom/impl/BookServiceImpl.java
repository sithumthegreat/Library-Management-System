/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.coursework.service.custom.impl;

import edu.ijse.coursework.dao.DaoFactory;
import edu.ijse.coursework.dao.custom.BookDao;
import edu.ijse.coursework.dto.BookDto;
import edu.ijse.coursework.entity.BookEntity;
import edu.ijse.coursework.service.ServiceFactory;
import edu.ijse.coursework.service.custom.BookService;
import java.util.ArrayList;

/**
 *
 * @author Sithum
 */
public class BookServiceImpl implements BookService{
    private final BookDao bookDao=(BookDao)DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.BOOK);

    @Override
    public String save(BookDto bookDto) throws Exception {
        BookEntity entity=getBookEntity(bookDto);
        return bookDao.save(entity);
        
    }

    @Override
    public String update(BookDto bookDto) throws Exception {
        BookEntity bookEntity=getBookEntity(bookDto);
        return bookDao.update(bookEntity);
    }

    @Override
    public String delete(String Id) throws Exception {
        return bookDao.delete(Id);
    }

    @Override
    public BookDto get(String Id) throws Exception {
       BookEntity bookEntity=bookDao.get(Id);
       if (bookEntity!=null){
           return new BookDto(bookEntity.getBookId(),bookEntity.getBookName(),bookEntity.getAuthor(),
           bookEntity.getCount(),bookEntity.getCategoryId());
       }
       return null;
    }

    @Override
    public ArrayList<BookDto> getAll() throws Exception {
        ArrayList<BookDto> bookDtos=new ArrayList<>();
        ArrayList<BookEntity> bookEntities=bookDao.getAll();
        for (BookEntity bookentity:bookEntities){
            BookDto bookDto=getBookDto(bookentity);
            bookDtos.add(bookDto);
        }
        return bookDtos;
    }
    
    public BookDto getBookDto(BookEntity bookEntity)throws Exception{
        BookDto bookDto=new BookDto(bookEntity.getBookId(),bookEntity.getBookName(),
        bookEntity.getAuthor(),bookEntity.getCount(),bookEntity.getCategoryId());
        return bookDto;
        
        
    }
    public BookEntity getBookEntity(BookDto bookEntity)throws Exception{
        BookEntity Entity=new BookEntity(bookEntity.getBookId(),bookEntity.getBookName(),bookEntity.getAuthor(),bookEntity.getCount(),bookEntity.getCategoryId());
        return Entity;
        
    }

   
    
}
