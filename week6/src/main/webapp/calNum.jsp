<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 처리 페이지  -->
	<%
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		
		int sum = 0;
		for(int i=num1; i<= num2; i++){
			sum += i;
		}
	%>
	<!-- 페이지 이동 간에 데이터 전송 방법 => request 객체 이용 -->
	<%
		request.setAttribute("num1", num1);
		request.setAttribute("num2", num2);
		request.setAttribute("sum", sum);
	%>
	<%--  <jsp:forward page="calResult.jsp"></jsp:forward>--%>
	<jsp:forward page="calResult2.jsp"></jsp:forward>
</body>
</html>