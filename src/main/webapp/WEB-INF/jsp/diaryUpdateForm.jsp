<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<Form Action="diaryUpdate" Method="POST">
		<TABLE border=1>
			<TR>
				<TD><B> ��ȣ </B></TD>
				<TD><B> ���� </B></TD>
			</TR>
			<TR>
				<TD><Input Type="hidden" id="number" name="number" value="${diaryReq.getNumber()}">${diaryReq.getNumber()}</TD>
				<TD><Input Type="text" name="title" id="title" value="${diaryReq.getTitle()}"></TD>
			</TR>
			<TR>
				<TD colspan="2"><Input Type="text" name="content" id="content" value="${diaryReq.getContent()}"></TD>
			</TR>
		</TABLE>
		<Input Type="Submit" Value="�����ϱ�">
		<a href="diaryMain"> [����ϱ�] </a>
	</Form>
</body>
</html>