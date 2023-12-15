<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>사원 정보 조회</h3>
	<table border = "1" width = "100%">
		<tr>
			<td>사원번호</td> <td>${emp.empno }</td>
		</tr>
		<tr>
			<td>사원이름</td><td>${emp.empname }</td>
		</tr>
		<tr>
			<td>부서코드</td><td>${emp.empdept }</td>
		</tr>
		<tr>
			<td>업무</td><td>${emp.empjob }</td>
		</tr>
		<tr>
			<td>급여</td><td>${emp.empsal }</td>
		</tr>
		<tr>
			<td>사진</td><td><img alt = "${emp.empimage }" src = "images/${emp.empimage }"></td>
		</tr>
	
	</table>
</body>
</html>