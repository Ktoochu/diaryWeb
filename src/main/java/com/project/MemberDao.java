package com.project;

public interface MemberDao {
	// 해당 이메일이 존재하는 멤버 돌려준다
	public Member selectByID(String loginID);
	
	// 멤버 수 세기
	public int count();

	// 새 멤버 등록
	public void insert(Member member);
	
	// 맴버 수정
	public void change(Member member);
}
