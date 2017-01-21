
package com.gb.service;

import com.gb.dao.UserDAOImpl;
import com.gb.web.model.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserDAOImpl userDAO;

    @Override
    public List<User> getAllUSers() {
        return userDAO.getAllUSers();
    }

    @Override
    public User getUserById(int userId) {
        return userDAO.getUserById(userId);
    }
}