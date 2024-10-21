package com.mycompany.model;

import lombok.Data;


//Lombok�� @Data ������̼��� ����ϸ�, getter, setter, toString, equals, hashCode �޼��尡 �ڵ����� �����˴ϴ�.
@Data
public class User {
	
	private String username;
	private String password;
	private String role;
	
}


/*

���� Lombok�� ������� �ʾ��� ��.

public class User {

	private String username;
	private String password;
	
	// ������, getter, setter �޼����
	
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