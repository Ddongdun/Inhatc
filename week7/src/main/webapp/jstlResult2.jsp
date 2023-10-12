<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>JSTL 코어 태그 결과 2</h3>
	id : ${m.id }, 이름 : ${m.name }
	<hr>
	<c:if test="${m.id == m.password } ">
		로그인에 성공했습니다
	</c:if>
	<c:if test="${m.id != m.password } ">
		로그인에 실패했습니다
	</c:if>
</body>
</html>