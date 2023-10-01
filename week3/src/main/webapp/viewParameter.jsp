<%@page import="java.util.Enumeration"%>
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
		request.setCharacterEncoding("utf-8");
	%>
	<h3>요청 파라미터 정보</h3>
	<h4>request.getParameter() 메소드 사용</h4>
	name 파라미터 = <%= request.getParameter("name") %>, 
	addr 파라미터 = <%= request.getParameter("addr") %>
	<hr>
	<h4>request.getParameterValues() 메소드 사용</h4>
	<%
	String[] values = request.getParameterValues("pet");
		if(values != null){
			for(int i = 0;i <values.length; i++){
				out.println(values[i]);
			}
		}
	%>
	<hr>
	<h4>request.getParameterNames() 메소드 사용</h4>
	<%
		Enumeration paramEnum = request.getParameterNames();
	while(paramEnum.hasMoreElements()){
		String name = (String) paramEnum.nextElement();
		out.println(name);
	}
	%>
</body>
</html>