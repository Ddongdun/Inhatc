<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
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
	<h3>사원 목록 보기</h3>
	<table border = "1" witdh = "100%" style = "text-align": center;">
		<tr>
			<td>사번</td><td>이름</td><td>근무부서</td><td>업무</td><td>급여</td>
		</tr>
		<%
			Class.forName("com.mysql.jdbc.Driver");
			String jdbcURL = "jdbc:mysql://54.180.156.172:3306/jspDB";
			String dbUser = "root";
			String dbPass = "andel6520";
			String sql = "select * from emp";
			
			Connection conn = DriverManager.getConnection(jdbcURL, dbUser, dbPass);
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery(sql);
			
			while(rs.next()){
				out.println("<tr><td>");
				out.println(rs.getString("empno") +  "</td><td>");
				out.println(rs.getString("empname") +  "</td><td>");
				out.println(rs.getString("empdept") +  "</td><td>");
				out.println(rs.getString("empjob") +  "</td><td>");
				out.println(rs.getInt("empsal") +  "</td></tr>");
			}
			rs.close();
			stat.close();
			conn.close();
		%>
	</table>
</body>
</html>