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
	<h3>JSTL Choose Tag</h3>
	<ul>
		<c:choose>
			<c:when test="${param.name == '홍길동' }">
				<li>당신의 이름은 ${param.name } 입니다.</li>
			</c:when>
			<c:when test="${param.age > 20 }">
				<li>당신은 20세 이상입니다.</li>
			</c:when>
			<c:otherwise>
				<li>당신은 홍길동이 아니고 20세 미만입니다.</li>
			</c:otherwise>
		</c:choose>
	</ul>
</body>
</html>