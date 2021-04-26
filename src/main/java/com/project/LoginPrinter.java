package com.project;

// 실제 로그인 정보 출력해준다.
public class LoginPrinter {
	public void print(LoginInfoMember member) {
		System.out.printf("로그인 정보: 아이디=%d, 이메일=%s, 이름=%s, 전화번호=%s, 주소=%s, 가입 날짜=%tF, 로그인 날짜=%tF\n", member.getLoginID(), member.getEmail(),
				member.getName(), member.getPhone(), member.getAddr(), member.getRegisterDate(), member.getLoginDate());
	}
}