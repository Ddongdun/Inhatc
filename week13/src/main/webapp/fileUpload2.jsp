<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="upload2_process.jsp" method = "post" enctype="multipart/form-data">
		이름 : <input type = "text" name = "name"><br>
		제목 : <input type = "text" name = "title"><br>
		이름 : <input type = "file" name = "filename"><br>
		<input type="submit" value="파일 업로드">
	</form>
</body>
</html>