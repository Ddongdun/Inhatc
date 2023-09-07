<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!
	//선언부
	//자바소스 코드 영역
	public int gop(int x, int y){
		return x * y;
	}
	%>
	
	<h3> 두 수의 곱 구하기</h3>
	13 * 19 = <%=  gop(13, 19) %>
</body>
</html>