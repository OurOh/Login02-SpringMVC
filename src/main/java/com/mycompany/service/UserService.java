package com.mycompany.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mycompany.dao.UserDAO;
import com.mycompany.model.User;

@Service	 // 이 클래스가 서비스 역할을 한다는 것을 나타냅니다.
public class UserService {

    @Autowired	// UserDAO 객체를 자동으로 주입받습니다.
    private UserDAO userDAO;

    // 로그인 시 사용자 인증을 수행하는 메서드
    public boolean authenticate(String username, String password) {
        return userDAO.validateUser(username, password);	 // DAO를 호출하여 사용자 정보를 검증
        
    }
    
}