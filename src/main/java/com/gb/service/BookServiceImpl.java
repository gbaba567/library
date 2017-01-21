/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gb.service;

import com.gb.dao.BookDAOImpl;
import com.gb.web.model.Book;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("BookService")
public class BookServiceImpl implements BookService {

    @Autowired
    BookDAOImpl booksDao;

    @Override
    public List<Book> getAllBooks() {
        return booksDao.getAllBooks();
    }
}