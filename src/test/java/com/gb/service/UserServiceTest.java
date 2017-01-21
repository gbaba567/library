package com.gb.service;

import com.gb.web.model.User;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
// using same configuration as it has H2 database,in real world it would be another test configuration file
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring-web-config.xml") 
public class UserServiceTest {

    @Autowired
    private UserService userService ;


    @Test
    public void getAllUserTest() {
        // Check if the return description has a Description: string.
        assertEquals(10, userService.getAllUSers().size());
    }
    
    
    @Test
    public void getUserByIdTest() {
        // Check if the return description has a Description: string.
        User user = userService.getUserById(1);
        assertEquals("Coby Kim",user.getName());
        assertEquals("feugiat@euodio.org",user.getEmail());
        assertEquals("(284) 363-0901",user.getPhone());
        assertEquals(1,user.getBooks().size());
    }
}
