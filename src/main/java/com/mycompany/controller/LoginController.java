package com.mycompany.controller;

import com.mycompany.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    // ��Ʈ ���('/')�� ��û�� ������ �α��� �������� �����̷�Ʈ�մϴ�.
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String redirectToLogin() {
        return "redirect:/login";  // ��Ʈ ��η� ������ /login���� �����̷�Ʈ
    }

    // /login ��η� GET ��û�� ������ �α��� ���� ��ȯ�մϴ�.
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLoginForm() {
        return "login";  // login.jsp�� �̵�
    }

    ////////////////////////////
    
    
    // /login ��η� POST ��û�� ������ �α��� ó���� �����մϴ�.
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(String username, String password) {
        boolean isAuthenticated = userService.authenticate(username, password);
        if (isAuthenticated) {
            return "redirect:/home";
        } else {
            return "redirect:/login?error";
        }
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String showHomePage() {
        return "home";  // home.jsp�� �̵�
    }
    
    
}




