<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<TABLE border=1>
		<TR>
			<TD><B> ��ȣ </B></TD>
			<TD><B> ���� </B></TD>
			<TD><B> ��¥ </B></TD>
		</TR>
		<TR>
			<TD>${diarys.getNumber()}</TD>
			<TD>${diarys.getTitle()}</TD>
			<TD>${diarys.getRegisterDate()}</TD>
		</TR>
		<TR>
			<TD colspan="3">${diarys.getContent()}</TD>
		</TR>
		<TR>
			<TD colspan="3">${diarys.getFile()}</TD>
		</TR>
	</TABLE>
	<Form Action="diaryUpdateForm" Method="POST">
		<Input Type="hidden" id="number" name="number" value="${diarys.getNumber()}">
		<Input Type="hidden" id="title" name="title" value="${diarys.getTitle()}">
		<Input Type="hidden" id="content" name="content" value="${diarys.getContent()}">
		<Input Type="hidden" id="file" name="file" value="${diarys.getFile()}">
		<Input Type="Submit" Value="�����ϱ�"> <Input Type="Submit" Value="�����ϱ�" formaction="diaryDelete">
		<a href="diaryMain"> [���ư���] </a>
	</Form>
</body>
</html>