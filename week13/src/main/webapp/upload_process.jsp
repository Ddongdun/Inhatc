<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
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
	MultipartRequest multi = new MultipartRequest(request, "c:\\upload", 5*1024*1024, "utf-8", new DefaultFileRenamePolicy());
	String name = multi.getParameter("name");
	String title = multi.getParameter("title");
	
	//폴더에 저장된 파일명
	String filename = multi.getFilesystemName("filename");
	
	//실제 업로드한 파일명
	String original = multi.getOriginalFileName("filename");
	
	//업로드한 파일의 콘텐츠 타입
	String type = multi.getContentType("filename");
%>

<h3>
	제목 : <%= title %>
	이름 : <%= name %>
	요청 파라미터 = <%=filename %>
	<hr>
	폴더에 저장된 파일명 = <%=filename %><br>
	실제 업로드한 파일명 = <%=original %><br>
	파일의 콘텐츠 타입 = <%=type %>
</h3>
</body>
</html>