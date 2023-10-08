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
	<h2>요청 헤더 목록</h2>
	<%
		Enumeration hEnum = request.getHeaderNames();
		//헤더 이름을 가져온다
		while(hEnum.hasMoreElements()){
		//헤더 이름이 없을때까지
			String hName = (String)hEnum.nextElement();
			//헤더 이름 저장
			String hValue = request.getHeader(hName);
			/헤더 값 저장
			out.println(hName + "=" + hValue + "<br>");
			//출력
		}
	%>
</body>
</html>
