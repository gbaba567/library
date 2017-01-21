package com.gb.web.controller;

import com.gb.service.BookService;
import com.gb.service.UserService;
import com.gb.web.model.Book;
import com.gb.web.model.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LibraryController {

    @Autowired
    UserService userService;
    @Autowired
    BookService bookService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView getData() {
        ModelAndView model = new ModelAndView("home");        
        return model;
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public ModelAndView getUsers() {
        ModelAndView model = new ModelAndView("users");
        List<User> users = userService.getAllUSers();
        model.addObject("users", users);
        return model;
    }

    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public ModelAndView getBooks() {
        ModelAndView model = new ModelAndView("books");
        List<Book> books = bookService.getAllBooks();
        model.addObject("books", books);
        return model;
    }
}