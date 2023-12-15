<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>세션에 저장된 정보</h3>
	id :<%=session.getAttribute("id")%><br> 
	name :<%=session.getAttribute("name")%>
	<hr>
	<h3>세션 삭제</h3>
	<%
	session.invalidate();
	%>
	<br>
	<hr>
	<h3>세션 삭제 후</h3>
	id :<%=session.getAttribute("id")%><br> 
	name :<%=session.getAttribute("name")%>
</body>
</html>