<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title> Register </title>
</head>
<body>
	<h2>회원 정보 입력</h2>
	<form action="registerSv" method="POST">
		<p> <label>아이디:<br> <input type="text" name="loginID" id="loginID" > </label> </p>
		<p> <label>이메일:<br> <input type="text" name="email" id="email" > </label> </p>
		<p> <label>이름:<br> <input type="text" name="name" id="name" > </label> </p>
		<p> <label>핸드폰 번호:<br> <input type="text" name="phone" id="phone" > </label> </p>
		<p> <label>주소:<br> <input type="text" name="addr" id="addr" > </label> </p>
		<p> <label>비밀번호:<br> <input type="password" name="password" id="password" > </label> </p>
		<p> <label>비밀번호 확인:<br> <input type="password" name="confirmPassword" id="confirmPassword" > </label> </p>
		<input type="submit" value="가입 완료">
	</form>
</body>
</html>