/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gb.dao;

import com.gb.web.model.User;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("userDAO")
public class UserDAOImpl implements UserDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<User> getAllUSers() {

        Session session = sessionFactory.openSession();
        List<User> users = session.getNamedQuery("getAllUsers").list();
        session.close();
        return users;
    }

    @Override
    public User getUserById(int userId) {
        Session session = sessionFactory.openSession();
        return (User) session.get(User.class, userId+"");
    }
}
