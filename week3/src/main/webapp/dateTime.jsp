<%@page import="java.util.Calendar"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
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
		Date date = new Date();
		//데이트 변수 선언
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
		//데이터 포멧 변수 선언
		String time = sdf.format(date);
		//포멧에 맞게 변환해 문자열로 저장
		Calendar cal = Calendar.getInstance();
		//캘린더 변수 선언
	%>
	<h1>오늘은 <%= cal.get(Calendar.YEAR) %>년
	//연도를 가져온다
	<%= cal.get(Calendar.MONTH)+1 %>월
	//월을 가져온다
	<%= cal.get(Calendar.DATE) %>일
	//일을 가져온다
	</h1>
	<h2>현재 시각 <%= time %></h2>
	//현재 시간 출력
</body>
</html>
