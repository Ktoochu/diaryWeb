<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title> Register </title>
</head>
<body>
	<h2>ȸ�� ���� �Է�</h2>
	<form action="registerSv" method="POST">
		<p> <label>���̵�:<br> <input type="text" name="loginID" id="loginID" > </label> </p>
		<p> <label>�̸���:<br> <input type="text" name="email" id="email" > </label> </p>
		<p> <label>�̸�:<br> <input type="text" name="name" id="name" > </label> </p>
		<p> <label>�ڵ��� ��ȣ:<br> <input type="text" name="phone" id="phone" > </label> </p>
		<p> <label>�ּ�:<br> <input type="text" name="addr" id="addr" > </label> </p>
		<p> <label>��й�ȣ:<br> <input type="password" name="password" id="password" > </label> </p>
		<p> <label>��й�ȣ Ȯ��:<br> <input type="password" name="confirmPassword" id="confirmPassword" > </label> </p>
		<input type="submit" value="���� �Ϸ�">
	</form>
</body>
</html>