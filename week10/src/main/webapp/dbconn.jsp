<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
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
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = null;
		
		String jdbcURL = "jdbc:mysql://54.180.156.172:3306/jspDB";
		String dbUser = "root";
		String dbPass = "andel6520";
		
		conn = DriverManager.getConnection(jdbcURL, dbUser, dbPass);
	%>
</body>
</html>