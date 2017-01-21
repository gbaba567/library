
package com.gb.service;

import com.gb.web.model.User;
import java.util.List;

public interface UserService {

    List<User> getAllUSers();
    User getUserById(int userId);
}