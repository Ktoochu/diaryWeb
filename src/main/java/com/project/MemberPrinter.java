package com.project;

public class MemberPrinter {
	public void print(Member member) {
		
		System.out.printf("회원 정보: 아이디=%d, 이메일=%s, 이름=%s, 전화번호=%s, 주소=%s, 등록일=%tF\\n", member.getLoginID(), member.getEmail(),
				member.getName(), member.getPhone(), member.getAddr(), member.getRegisterDate());
	}
}
