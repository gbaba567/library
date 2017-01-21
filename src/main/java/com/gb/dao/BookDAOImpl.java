package com.gb.dao;

import com.gb.web.model.Book;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("BookDAO")
public class BookDAOImpl implements BookDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Book> getAllBooks() {
        
        Session session= sessionFactory.openSession();
        List<Book> users =  session.getNamedQuery("getAllBooks").list();
        session.close();
        return users;
    }
}
