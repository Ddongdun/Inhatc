<%@page import="java.lang.reflect.Member"%>
<%@page import="java.util.Arrays"%>
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
		List<Member> list = Arrays.asList(new Member("홍길동", 25), new Member("이순신", 54), new Member("유관순", 19));
		request.setAttribute("member", list);
	%>
	${ageList = member.stream().map(x -> x.age).toList(); '' }<br>
	${ageList }<br>
	${ageList = member.stream().map(x -> x.name).toList() }<br>
	${member.stream().map(x->x.age).filter(x->x>=20).toList() }<br>
	${sortedMem = member.stream().sorted((x1, x2)->x1.age>x2.age?1:-1).toList() }<br>
	${sortedMem.stream().map(x->x.name).toList() }
</body>
</html>