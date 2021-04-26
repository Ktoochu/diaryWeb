package com.project;

import java.util.Date;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class MemberRegisterService {
	private MemberDao memberDao;

	@Autowired
	public MemberRegisterService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	// 회원가입
	@Transactional
	public void regist (RegisterRequest req) {		
		Member member = memberDao.selectByID(req.getLoginID());
		
		// 이미 존재하는 이메일인가?
		if (member != null) {
			throw new AlreadyExistingMemberException("이미 존재하는 ID입니다." + req.getLoginID());
		}
		
		// 비밀번호가 일치하는가?
		if (!req.getConfirmPassword().equals(req.getPassword())) {
			throw new IdPasswordNotMatchingException();
		}
		
		// 회원 등록
		Member newMember = new Member(req.getId(), req.getLoginID(), req.getEmail(), req.getPassword(), req.getName(), req.getPhone(), req.getAddr(), new Date());
		memberDao.insert(newMember);
	}
}
