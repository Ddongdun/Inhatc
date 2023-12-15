<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>사원 등록 화면</h3>
	<form action="inputEmpConfirm.do" method = "post" enctype="multipart/form-data">
		<table border = "1" width = "300px">
		<tr>
			<td>사원번호</td>
			<td><input type = "text" name = "empno"></td>
		</tr>
		<tr>
			<td>사원이름</td>
			<td><input type = "text" name = "empname"></td>
		</tr>
		<tr>
			<td>부서코드</td>
			<td><input type = "text" name = "empdept"></td>
		</tr>
		<tr>
			<td>업무</td>
			<td><input type = "text" name = "empjob"></td>
		</tr>
		<tr>
			<td>급여</td>
			<td><input type = "text" name = "empsal"></td>
		</tr>
		<tr>
			<td>파일</td>
			<td><input type = "file" name = "empimage"></td>
		</tr>
		</table>
		<br><br>
		<input type="submit" value="등록"> <input type="reset" value="취소">
		
	</form>
	<br><br>
	<button onclick="location.href = 'main.do'">메뉴화면</button>
</body>
</html>