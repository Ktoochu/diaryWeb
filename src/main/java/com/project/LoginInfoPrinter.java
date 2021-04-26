package com.project;

import org.springframework.beans.factory.annotation.Autowired;

// 로그인 정보 출력
public class LoginInfoPrinter {
	private LoginService loginSv;
	private LoginPrinter loginPrinter;

	// 로그인 객체 받아온다.
	@Autowired
	public void setLoginService(LoginService loginSv) {
		this.loginSv = loginSv;
	}

	// 로그인 정보 출력해줄 프린터.
	@Autowired
	public void setPrinter(LoginPrinter loginPrinter) {
		this.loginPrinter = loginPrinter;
	}

	// 로그인 정보 출력
	public void printMemberInfo() {
		LoginInfoMember loginInfo = loginSv.getLoginMember();
		if (loginInfo == null) {
			System.out.println("로그인 중이 아닙니다.");
			return;
		}
		loginPrinter.print(loginInfo);
		System.out.println();
	}
}
