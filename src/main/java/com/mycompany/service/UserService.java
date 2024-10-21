package com.mycompany.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mycompany.dao.UserDAO;
import com.mycompany.model.User;

@Service	 // �� Ŭ������ ���� ������ �Ѵٴ� ���� ��Ÿ���ϴ�.
public class UserService {

    @Autowired	// UserDAO ��ü�� �ڵ����� ���Թ޽��ϴ�.
    private UserDAO userDAO;

    // �α��� �� ����� ������ �����ϴ� �޼���
    public boolean authenticate(String username, String password) {
        return userDAO.validateUser(username, password);	 // DAO�� ȣ���Ͽ� ����� ������ ����
        
    }
    
}