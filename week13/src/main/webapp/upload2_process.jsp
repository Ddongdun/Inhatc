<%@page import="java.io.File"%>
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
	String fileSave = "/fileSave";
	String real = application.getRealPath(fileSave);
	
	int max = 10*1024*1024;
	MultipartRequest mr = new MultipartRequest(request, real, max, "utf-8", new DefaultFileRenamePolicy());
	String title = mr.getParameter("title");
	String name = mr.getParameter("name");
	String filename = mr.getFilesystemName("filename");
	String original = mr.getOriginalFileName("filename");
	
	File file = new File(real + "/" + filename);
	int size = (int)file.length();
%>
<h3>파일 업로드 결과</h3>
제목 : <%=title %><br>
이름 : <%=name %><br>
저장된 파일명 : <%=filename %><br>
원본 파일명 <%=original %><br>
파일크기 : <%=size %><br>

<button onclick="location.href = 'uploadView.jsp?filename = <%=filename %>'">파일보기</button>
</body>
</html>