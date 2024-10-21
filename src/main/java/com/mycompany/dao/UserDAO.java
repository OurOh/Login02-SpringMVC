package com.mycompany.dao;


import com.mycompany.model.User;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;



@Repository		// �� Ŭ������ �����ͺ��̽� ������ ���� DAO ������ �Ѵٴ� ���� ��Ÿ���ϴ�.
public class UserDAO {

	 @Autowired
	 private JdbcTemplate jdbcTemplate;  // Spring�� JdbcTemplate�� ����Ͽ� DB ����

    public UserDAO(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    // �����ͺ��̽����� ����� ���� ����
    public boolean validateUser(String username, String password) {
        String sql = "SELECT COUNT(*) FROM users WHERE username = ? AND password = ?";
        Integer count = jdbcTemplate.queryForObject(sql, new Object[]{username, password}, Integer.class);
        return count != null && count > 0;
        
    }
    
    
}


