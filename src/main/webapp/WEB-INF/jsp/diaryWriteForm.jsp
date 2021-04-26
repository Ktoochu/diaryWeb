<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<Form Action="diaryWrite" Method="POST" enctype="multipart/form-data">
		<TABLE border=1>
			<TR>
				<TD><B> 제목 </B></TD>
			</TR>
			<TR>
				<TD><Input Type="text" name="title" id="title"></TD>
			</TR>
			<TR>
				<TD colspan="1"><Input Type="text" name="content" id="content"></TD>
			</TR>
			<TR><TD><input multiple="multiple" type="file" name="mediaFile"/></TD></TR>
		</TABLE>
		<Input Type="Submit" Value="등록하기">
		<a href="diaryMain"> [취소하기] </a>
	</Form>
</body>
</html>