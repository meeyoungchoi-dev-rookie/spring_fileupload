<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="path" value="<%=request.getContextPath() %>" />

<%
	String file	  = (String) request.getAttribute("fileName");

	Integer bookId = (Integer)request.getAttribute("bookId");
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<script src="//cdn.ckeditor.com/4.15.0/standard/ckeditor.js"></script>
</head>
<body>
	
	<h1>파일업로드 후 도서목록</h1>
	
	<!--  
	<img src="${path}/resources/flower.jpg">-->
	
	
	제목: <input type="text" name="title" value="${book.title}">
	내용: <input type="text" name="content" value="${book.content}">
	목차: <textarea  class="ckeditor" rows="10" name="mokcha" readonly="readonly">${book.mokcha}</textarea>
	
	 <script>
		var ckeditor_config = {

			removePlugins: 'elementspath',	
			resize_enable : false,
			enterMode : CKEDITOR.ENTER_BR,
			shiftEnterMode : CKEDITOR.ENTER_P
		};
		

		CKEDITOR.replace("mokcha", ckeditor_config);
		
		 
	</script>  
	
	<img src="${path}/resources/${book.bookImage.originalFilename}">
	<a class="btn btn-info" href="${path}/book/update/${bookId}">수정</a>

</body>
</html>