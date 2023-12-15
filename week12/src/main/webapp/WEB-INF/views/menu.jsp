<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String id = (String)session.getAttribute("id");
%>
	<c:set var = "id" value = "<%=id %>"></c:set>
	<c:choose>
		<c:when test="${id != null }">
			${id }님, 안녕하세요!  &nbsp; <a href = "Logout.do">로그아웃</a>
		</c:when>
		<c:otherwise>
			<a href = "Login.do">로그인</a>
		</c:otherwise>
	</c:choose>
	<h1>메뉴 선택</h1>
	<br>
	<button onclick="location.href = 'queryEmp.do'">사원목록</button>
	<button onclick="location.href = 'inputEmp.do'">사원등록</button>
	<button onclick="location.href = 'inquiryEmp.do'">사원정보</button>
</body>
</html>