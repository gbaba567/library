package com.gb.web.controller;

import com.gb.service.UserService;
import com.gb.web.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AjaxController {

    @Autowired
    UserService userService;
    
    @RequestMapping(value = "/user/details", method = RequestMethod.GET)
    @ResponseBody
    public User getData(@RequestParam int userId) {
        return userService.getUserById(userId);
    }

}