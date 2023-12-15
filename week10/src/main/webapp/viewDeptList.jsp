<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file = "dbconn.jsp" %>
	<h3>부서 목록 보기</h3>
	<table border = "1" width = "100%" style = "text-align: center;">
		<tr>
			<td>부서코드</td><td>부서이름</td><td>근무지</td>
		</tr>
		<%
			Statement stat = conn.createStatement();
			String sql = "select * from dept";
			
			ResultSet rs = stat.executeQuery(sql);
			
			while(rs.next()){
				String deptno = rs.getString("deptno");
				String deptname = rs.getString("deptName");
				String deptloc = rs.getString("deptLoc");
			%>
					<tr>
						<td><%=deptno %></td><td><%=deptname %></td><td><%=deptloc %></td>
					</tr>
			<%}
			rs.close();
			stat.close();
			conn.close();
			%>
			
</body>
</html>