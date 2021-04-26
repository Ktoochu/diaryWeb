package com.project;

public class DiaryRequest {
	private int number;
	private String title;
	private String content;
	private String file;

	void setNumber(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public String getFile() {
		return file;
	}
}
