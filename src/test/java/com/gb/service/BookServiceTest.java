package com.gb.service;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring-web-config.xml")
public class BookServiceTest {

    @Autowired
    private BookService bookService ;

    @Test
    public void getAllBooksTest() {
        assertEquals(10, bookService.getAllBooks().size());
    }
}
