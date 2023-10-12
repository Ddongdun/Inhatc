<%@page import="java.io.FileReader"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>forTokens 태그</h3>
	콤마와 점을 구분자로 사용 : <br>
	<c:forTokens var = "data" items="빨강, 주황, 노랑, 초록, 파랑, 남색, 보라" delims=",.">
		${data  }
	</c:forTokens>
	<hr>
	<%
		FileReader reader = null;
		String path = request.getParameter("path");
		reader = new FileReader(getServletContext().getRealPath(path));
	%>
	<pre>
		소스코드 = <%=path %>
		<c:out value="<%=reader %>" escapeXml="false"></c:out>
	</pre>
	<%
		if (reader != null){
			reader.close();
		}
	%>
</body>
</html>