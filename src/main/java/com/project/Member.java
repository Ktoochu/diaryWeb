package com.project;

import java.util.Date;

public class Member {
	private Long id;
	private String loginID;
	private String email;
	private String password;
	private String name;
	private String addr;
	private String phone;
	private Date registerDate;
	
	public Member(Long id, String loginID, String email, String password, String name, String phone, String addr, Date registerDate) {
		this.id = id;
		this.loginID = loginID;
		this.email= email;
		this.password= password;
		this.name = name;
		this.phone = phone;
		this.addr = addr;
		this.registerDate= registerDate;
	}
	
	void setId(Long id) { this.id = id; }
	public Long getId() { return id; }
	public String getLoginID() {  return loginID; }
	public String getEmail() {  return email; }
	public String getPassword() {  return password;  }
	public String getName() {  return name; }
	public String getAddr() {  return addr; }
	public String getPhone() {  return phone; }
	public Date getRegisterDate() {  return registerDate;  }
	public void changePassword(String oldPassword, String newPassword) {
		if (!password.equals(oldPassword))
			throw new IdPasswordNotMatchingException();
		this.password= newPassword;
	}
} 