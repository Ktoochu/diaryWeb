package com.project;

import java.util.Date;
import java.util.List;

public interface DiaryDao {
	
	// 다이어리 수 세기
	public int count(Long id);

	// 글쓰기
	public void write(Long id, int number, String title, String content, String path, Date date);

	// 수정하기
	public void update(Long id, int number, String title, String content);
	
	// 저장된 자료 보여주기
	public List<Diary> showAll(Long id);

	// 키워드 검색하기
	public List<Diary> searchKey(Long id, String key);

	// 번호 검색하기
	public Diary searchNum(Long id, int key);

	// 삭제하기
	public void delete(Long id, int number);
}
