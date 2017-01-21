package com.gb.dao;

import com.gb.web.model.User;
import java.util.List;

interface UserDAO {

    List<User> getAllUSers();
    User getUserById(int userId);
}
