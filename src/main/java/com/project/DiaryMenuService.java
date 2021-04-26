package com.project;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class DiaryMenuService {
	private DiaryDao diaryDao;
	private Long id;

	@Autowired
	public DiaryMenuService(DiaryDao diaryDao) {
		this.diaryDao = diaryDao;
	}

	public void setID(Long id) {
		this.id = id;
	}

	// 글쓰기
	@Transactional
	public void writeMenu(String title, String text, String fileName) {
		// 다이어리 넘버
		int number = diaryDao.count(id);
		
		String saveName = fileName;
		if(fileName=="") saveName = null;
		
		diaryDao.write(id, number, title, text, saveName, new Date());
	}

	// 수정하기
	public void changeMenu(int key, String title, String text) {
		diaryDao.update(id, key, title, text);
	}
	
	// 모두 보기
	public List<Diary> showAllMenu() {
		List<Diary> diarys = diaryDao.showAll(id);
		return diarys;
	}
	
	// 다이어리 보기
	public Diary showDiary(int key) {
		Diary diarys = diaryDao.searchNum(id, key);
		return diarys;
	}
	
	// 검색하기
	public List<Diary> searchMenu(String keywd) {
		List<Diary> diarys = diaryDao.searchKey(id, keywd);
		return diarys;
	}
	
	// 삭제하기
	@Transactional
	public void deleteMenu(int key) {
		diaryDao.delete(id, key);
	}
}
