<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
	String color = request.getParameter("color");
	//request객체의 getParameter로 bgColor.html의 color값을 가져온다
%>
<body bgcolor="<%=color%>">
//가져온 color값으로 색 변경
	
</body>
</html>
