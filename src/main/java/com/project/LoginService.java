package com.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class LoginService {

	private MemberDao memberDao;
	private LoginInfoMember loginInfo;

	@Autowired
	public LoginService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	// 로그인 함수
	public String login(String loginID, String pass) {

		Member member = memberDao.selectByID(loginID);
		String memberPass;

		if (member == null) throw new LoginFailException("존재하지 않는 ID입니다." + loginID);
		else memberPass = member.getPassword();

		// 입력한 비밀번호가 맞는가?
		if (memberPass.equals(pass)) loginInfo = new LoginInfoMember(member); // 로그인 완료
		else throw new LoginFailException("비밀번호가 틀립니다." + pass);

		// 로그인 멤버 저장
		loginInfo = new LoginInfoMember(member);
		
		return loginInfo.getName();
	}

	// 로그인 멤버 반환
	public LoginInfoMember getLoginMember() {
		return loginInfo;
	}
	
	@Transactional
	// 트랜잭션으로 동작하도록 지정함. "all done or none"
	public void change(RegisterRequest req) {
		// 멤버 찾기
		Member member = memberDao.selectByID(loginInfo.getLoginID());
		
		// 멤버가 없으면 Rollback
		if (member == null) throw new MemberNotFoundException();
		
		// 비밀번호가 일치하는가?
		if (!req.getConfirmPassword().equals(req.getPassword())) throw new IdPasswordNotMatchingException();

		Member newMember = new Member(req.getId(), req.getLoginID(), req.getEmail(), req.getPassword(), req.getName(), req.getPhone(), req.getAddr(), member.getRegisterDate());
		newMember.setId(loginInfo.getId());
		
		memberDao.change(newMember);
		
		// 새 로그인 멤버 저장
		loginInfo = new LoginInfoMember(newMember);
	}
	
	// 현재 로그인 멤버 반환
	public Long getId() {
		return loginInfo.getId();
	}
}
