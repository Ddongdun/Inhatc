<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String web = request.getParameter("web");
		//web에 저장된 선택값을 가져온다
		response.sendRedirect(web);
		//주소 연결
	%>
	
</body>
</html>
