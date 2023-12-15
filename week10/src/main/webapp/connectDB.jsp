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
	<h3>데이터베이스 연결</h3>
	<%
		//1. JDBC 드라이버 연결
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		
		String jdbcURL = "jdbc:mysql://54.180.156.172:3306/jspDB";
		String dbUser = "root";
		String dbPass = "andel6520";
		
		String sql = "select * from emp";
		
		//2. 데이터베이스 커넥션 생성
		conn = DriverManager.getConnection(jdbcURL, dbUser, dbPass);
		
		//3.쿼리를 위한 Statement 객체 생성
		stat = conn.createStatement();
		
		//4. 쿼리 실행
		rs = stat.executeQuery(sql);
		
		//5. 쿼리 결과 출력
		if(rs != null){
			out.println("데이터베이스 연결 성공");
		} else{
			out.println("데이터베이스 연결 실패");
		}
		
		//6. 사용한 객체 종료
		rs.close();
		stat.close();
		conn.close();
	%>
</body>
</html>