package com.project;

import java.util.Date;

// 로그인 멤버 정보
public class LoginInfoMember {

	private Long id;
	private String loginID;
	private String email;
	private String password;
	private String name;
	private String addr;
	private String phone;
	private Date registerDate;
	private Date loginDate;
	
	public LoginInfoMember(Member member) {
		this.id = member.getId();
		this.loginID = member.getLoginID();
		this.email= member.getEmail();
		this.password= member.getPassword();
		this.name = member.getName();
		this.phone = member.getPhone();
		this.addr = member.getAddr();
		this.registerDate = member.getRegisterDate();
		this.loginDate= new Date();
	}
	
	public Long getId() { return id; }
	public String getLoginID() {  return loginID; }
	public String getEmail() {  return email; }
	public String getPassword() {  return password;  }
	public String getName() {  return name; }
	public String getAddr() {  return addr; }
	public String getPhone() {  return phone; }
	public Date getRegisterDate() { return registerDate; }
	public Date getLoginDate() {  return loginDate;  }
}
