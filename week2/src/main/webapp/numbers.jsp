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
		int num1 = Integer.parseInt(request.getParameter("num1"));
		//num1을 getParameter로 가져온다(텍스트이므로 int로 형변환)
		int num2 = Integer.parseInt(request.getParameter("num2"));
		//num2을 getParameter로 가져온다(텍스트이므로 int로 형변환)
	%>
	<h3>사칙 연산 결과</h3>
	<%=num1 %> + <%=num2 %> = <%=num1 + num2 %><br>
	<%=num1 %> - <%=num2 %> = <%=num1 - num2 %><br>
	<%=num1 %> * <%=num2 %> = <%=num1 * num2 %><br>
	<%=num1 %> / <%=num2 %> = <%=num1 / num2 %><br>
</body>
</html>
