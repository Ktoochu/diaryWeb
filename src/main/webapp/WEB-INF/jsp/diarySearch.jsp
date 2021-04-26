<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
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
			<TD><B> 내용 </B></TD>
			<TD><B> 날짜 </B></TD>
		</TR>
		<c:forEach var="diary" items="${diarys}" varStatus="status">
			<TR>
				<TD>${diary.number}</TD>
				<TD>${diary.title}</TD>
				<TD>${diary.content}</TD>
				<TD>${diary.registerDate}</TD>
			</TR>
		</c:forEach>
	</TABLE>
	<a href="diaryMain"> [돌아가기] </a>
</body>
</html>