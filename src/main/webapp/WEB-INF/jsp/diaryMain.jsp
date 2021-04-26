<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Diary Main</title>
</head>
<body>
	<TABLE border=1>
		<TR>
			<TD><B> 번호 </B></TD>
			<TD><B> 제목 </B></TD>
			<TD><B> 날짜 </B></TD>
		</TR>
		<c:forEach var="diary" items="${diarys}" varStatus="status">
			<TR>
				<TD>${diary.number}</TD>
				<TD><a href="diaryShow?id=${diary.getNumber()}">${diary.title}</a></TD>
				<TD>${diary.registerDate}</TD>
			</TR>
		</c:forEach>
	</TABLE>
	<Form Action="diarySearch" Method="POST">
		<Input Type="Text" Name="keywd"> <Input Type="Submit" Value="검색">
		<Input Type="Submit" Value="글쓰기" formaction="diaryWriteForm"> <a href="logout"> [로그아웃] </a>
	</Form>
</body>
</html>
