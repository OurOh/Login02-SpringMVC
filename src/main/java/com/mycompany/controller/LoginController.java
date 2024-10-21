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

    // 루트 경로('/')로 요청이 들어오면 로그인 페이지로 리다이렉트합니다.
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String redirectToLogin() {
        return "redirect:/login";  // 루트 경로로 들어오면 /login으로 리다이렉트
    }

    // /login 경로로 GET 요청이 들어오면 로그인 폼을 반환합니다.
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLoginForm() {
        return "login";  // login.jsp로 이동
    }

    ////////////////////////////
    
    
    // /login 경로로 POST 요청이 들어오면 로그인 처리를 수행합니다.
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
        return "home";  // home.jsp로 이동
    }
    
    
}




