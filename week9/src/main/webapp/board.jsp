<%@page import="java.util.Date"%>
<%@page import="java.io.IOException"%>
<%@page import="java.io.FileWriter"%>
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
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		String title =  request.getParameter("title");
		String content = request.getParameter("content");
		 
		//파일명 => 중복 x, 매번 저장할 때 마다 다른 이름
		//항상 변하는 값 이용 => Date 객체의 시간 값 이용
		Date date = new Date();
		Long time = date.getTime();
		String fileName = time + ".txt";
		String filePath = application.getRealPath("/WEB-INF/board/" + fileName);
		
		FileWriter writer = new FileWriter(filePath);
		try{
			String str = "제목 : " + title + "\n";
			str += "글쓴이 : " + name + "\n";
			str += content;
			writer.write(str);
			out.println("저장되었습니다");
		}catch(IOException e){
			out.println("파일에 데이터를 저장할 수 없습니다");
		} finally{
			writer.close();
		}
	%>
	
	<br><br>
	<form action = "boardResult.jsp">
		<input type = "hidden" name = "fileName" value = "<%= fileName %>">
		<input type = "submit" value = "내용보기">
	</form>
</body>
</html>