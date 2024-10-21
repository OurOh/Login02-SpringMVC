package com.mycompany.model;

import lombok.Data;


//Lombok의 @Data 어노테이션을 사용하면, getter, setter, toString, equals, hashCode 메서드가 자동으로 생성됩니다.
@Data
public class User {
	
	private String username;
	private String password;
	private String role;
	
}


/*

만약 Lombok을 사용하지 않았을 때.

public class User {

	private String username;
	private String password;
	
	// 생성자, getter, setter 메서드들
	
	public User(String username, String password) {
	    this.username = username;
	    this.password = password;
	}
	
	public String getUsername() {
	    return username;
	}
	
	public void setUsername(String username) {
	    this.username = username;
	}
	
	public String getPassword() {
	    return password;
	}
	
	public void setPassword(String password) {
	    this.password = password;
	}
	
}

*/