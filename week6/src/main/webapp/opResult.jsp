<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>EL 연산자 결과</h3>
		x = ${param.num1 }, y = ${param.num2 }<br>
		x + y = ${param.num1 } + ${param.num2 }<br>
		x + y = ${param.num1 } - ${param.num2 }<br>
		x + y = ${param.num1 } * ${param.num2 }<br>
		x + y = ${param.num1 } / ${param.num2 }<br>
		<hr>
		x와 y가 모두 양수입니까? ${param.num1 >0 && param.num2 > 0 }<br>
		x와 y가 같습니까? ${param.num1 == param.num2 }<br>
		<hr>
		<!-- 할당 연산자  -->
		${var = "admin" }<br>
		${strArr = ['가', '나', '다']}<br>
		${strArr = ['가', '나', '다'];''}<br>
		strArr의 값 = ${strArr } 입니다
		<hr>
		<!-- 문자열 비교 -->
		${var == "admin" }<br>
		<!-- 문자열 합치기 -->
		${strArr[0] += strArr[1] +=[2] }
</body>
</html>