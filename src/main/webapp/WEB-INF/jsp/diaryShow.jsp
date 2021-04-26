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
			<TD><B> 번호 </B></TD>
			<TD><B> 제목 </B></TD>
			<TD><B> 날짜 </B></TD>
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
		<Input Type="Submit" Value="수정하기"> <Input Type="Submit" Value="삭제하기" formaction="diaryDelete">
		<a href="diaryMain"> [돌아가기] </a>
	</Form>
</body>
</html>