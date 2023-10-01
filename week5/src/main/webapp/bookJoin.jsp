<%@page import="java.text.SimpleDateFormat, java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
도서 등록 결과
	<% 
		request.setCharacterEncoding("utf-8");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		Date date = new Date();
		String strDate = sdf.format(date);
	%>
	<jsp:useBean id="bookInfo" class = "week5.BookInfo"></jsp:useBean>
	<jsp:setProperty property="code" name="bookInfo"/>
	<jsp:setProperty property="title" name="bookInfo"/>				
	<jsp:setProperty property="writer" name="bookInfo"/>			 
	<jsp:setProperty property="pubDate" name="bookInfo"
								 value = "<%=strDate %>"/>
	<table border = "1">
		<tr>
			<td>코드</td>
			<td>제목</td>
			<td>저자</td>
			<td>출판일자</td>
		</tr>
		<tr>
			<td><jsp:getProperty property="code" name="bookInfo"/></td>
			<td><jsp:getProperty property="title" name="bookInfo"/></td>
			<td><jsp:getProperty property="writer" name="bookInfo"/></td>
			<td><jsp:getProperty property="pubDate" name="bookInfo"/></td>
		</tr>
	</table>
</body>
</html>