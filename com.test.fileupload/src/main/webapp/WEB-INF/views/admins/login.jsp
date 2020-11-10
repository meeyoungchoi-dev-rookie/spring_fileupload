<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="path" value="<%=request.getContextPath()%>" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
</head>
<body>
	<div class="jumbotron">
		<h1>관리자 로그인</h1>
	</div>


	<form method="post" action="${path}/admin/login" class="container">
		<label class="col-sm-2 col-form-label">아이디</label> <input type="text"
			name="adminId" placeholder="아이디를 입력하세요"
			class="form-control col-sm-10"> <label
			class="col-sm-2 col-form-label">비밀번호</label> <input type="text"
			name="adminPw" placeholder="비밀번호를 입력하세요"
			class="form-control col-sm-10">
		<button type="submit" class="btn btn-info">로그인</button>
	</form>


</body>
</html>