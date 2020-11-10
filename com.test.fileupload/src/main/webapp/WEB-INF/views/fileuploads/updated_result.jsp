<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="path" value="<%=request.getContextPath()%>" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<script src="//cdn.ckeditor.com/4.15.0/standard/ckeditor.js"></script>
<script src="/resources/js/ckeditor/ckeditor.js"></script>
</head>
<body>
	<h1>도서 수정완료 페이지</h1>
	
	<div class="container">
	
	제목:
	<input type="text" name="title" value="${book.title}"
		class="form-control"> 내용:
	<input type="text" name="content" value="${book.content}"
		class="form-control">
		
	<label class="mb-10"> 목차:</label>	
	<div rows="10" cols="50"  name="mokcha" class="container"
		readonly="readonly">${book.mokcha}</div>

	  
	<img
		src="${path}/resources/${book.bookImage.originalFilename}">
		
		</div>

</body>
</html>