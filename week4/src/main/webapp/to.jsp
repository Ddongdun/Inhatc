<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	이 페에지는 to.jsp가 생성한 것입니다.
	<%
		String id = request.getParameter("id");
		String pw = request.getParameter("password");
	%>
	<h3>jsp param 액션 태그 결과</h3>
	<h4>
		아이디 : <%= id %><br>
		패스워드 : <%= pw %><br>
		이름 : <%= request.getParameter("name") %><br>
		주소 : <%= request.getParameter("addr") %><br>
		이메일 : <%= request.getParameter("email") %><br>
	</h4>
</body>
</html>