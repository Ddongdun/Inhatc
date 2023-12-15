<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>사원 목록</h1>
	<table border = "1" width = "100%" style = "text-align: center;">
		<tr>
			<td>사원번호</td><td>사원이름</td>
			<td>부서코드</td><td>업무</td><td>
			급여</td><td>사진</td>
		</tr>
		<c:forEach var = "emp" items = "${list }">
			<tr>
				<td>${emp.empno }</td>
				<td>${emp.empname }</td>
				<td>${emp.empdept }</td>
				<td>${emp.empjob }</td>
				<td>${emp.empsal }</td>
				<%-- <td>${emp.empimage }</td> --%>
				<td><img alt = "${emp.empimage }" src = "images/${emp.empimage }"></td>
			</tr>
		</c:forEach>
	</table>
	<br><br>
	<button onclick="location.href = 'main.do'">메뉴화면</button>
</body>
</html>