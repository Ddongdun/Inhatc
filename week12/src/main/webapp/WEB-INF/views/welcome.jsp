<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="Login.do">로그인</a>
	<h1>메뉴 선택</h1>
	<br>
	<button onclick="location.href = 'queryEmp.do'">사원목록</button>
	<button onclick="location.href = 'inputEmp.do'">사원등록</button>
	<button onclick="location.href = 'inquiryEmp.do'">사원정보</button>
</body>
</html>