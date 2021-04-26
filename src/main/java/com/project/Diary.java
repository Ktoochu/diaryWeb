package com.project;

import java.util.Date;

public class Diary {
	private Long id;
	private int number;
	private String title;
	private String content;
	private String file;
	private Date registerDate;

	public Diary (Long id, int number, String title, String content, String file, Date registerDate) {
		this.id = id;
		this.number = number;
		this.title = title;
		this.content = content;
		this.file = file;
		this.registerDate= registerDate;
	}
	
	void setId(Long id) { this.id = id; }
	public Long getId() { return id; }
	void setNumber(int number) { this.number = number; }
	public int getNumber() {  return number; }
	public String getTitle() {  return title;  }
	public String getContent() {  return content; }
	public String getFile() {  return file; }
	public Date getRegisterDate() {  return registerDate;  }
}