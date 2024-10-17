package com.mycompany.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mycompany.dao.UserDAO;
import com.mycompany.model.User;

@Service
public class UserService {
    
    @Autowired
    private UserDAO userDAO;

    public boolean authenticate(String username, String password) {
        User user = userDAO.findByUsername(username);
        return user != null && user.getPassword().equals(password);
    }
}
