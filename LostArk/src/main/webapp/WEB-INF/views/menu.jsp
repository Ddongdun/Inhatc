<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="styles.css">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Nanum+Brush+Script&family=Nanum+Pen+Script&family=Noto+Sans+KR&display=swap"
	rel="stylesheet">
<meta charset="UTF-8">
<title>로스트아크 군단장 가이드</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
</head>
<body class="Nanum Brush Script">
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<a class="navbar-brand" href="#">로스트아크 군단장 가이드</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link" href="main.do">
						홈 <span class="sr-only"></span>
				</a></li>
				<li class="nav-item"><a class="nav-link" href="#"> 배틀아이템</a></li>
				<li class="nav-item"><a class="nav-link" href="#"> 에스더 스킬</a></li>
			</ul>
		</div>
	</nav>
	<h1 align="center">로스트아크</h1>
	<h2 align="center">군단장 가이드</h2>
	<br>
	<table align="center">
		<tr>
			<td>
				<button type="button"
					onclick="location.href='ValtanConfirm.do?name=발탄'"
					class="image-button">
					마수군단장 발탄<br> <img src="Img/Valtan.png">
				</button>
			</td>
			<td>
				<button onclick="location.href='BiackissConfirm.do?name=비아키스'"
					class="image-button">
					욕망군단장 비아키스<br> <img src="Img/Biackiss.png">
				</button>
			</td>

		</tr>
	</table>
</body>
</html>
