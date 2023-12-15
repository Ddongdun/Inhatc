<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>사원 조회 화면</h1>
	<form action="inquiryEmpConfirm.do">
		조회할 사원 번호를 입력하세요 : <input type = "text"  name = "empno">
		<input type="submit" value="조회">
		<input type="reset" value="취소">
	</form>
</body>
</html>