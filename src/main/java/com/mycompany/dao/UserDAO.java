package com.mycompany.dao;


import com.mycompany.model.User;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;



@Repository		// 이 클래스가 데이터베이스 접근을 위한 DAO 역할을 한다는 것을 나타냅니다.
public class UserDAO {

	 @Autowired
	 private JdbcTemplate jdbcTemplate;  // Spring의 JdbcTemplate을 사용하여 DB 접근

    public UserDAO(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    // 데이터베이스에서 사용자 정보 검증
    public boolean validateUser(String username, String password) {
        String sql = "SELECT COUNT(*) FROM users WHERE username = ? AND password = ?";
        Integer count = jdbcTemplate.queryForObject(sql, new Object[]{username, password}, Integer.class);
        return count != null && count > 0;
        
    }
    
    
}


