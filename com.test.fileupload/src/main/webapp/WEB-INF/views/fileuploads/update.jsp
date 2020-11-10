<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<c:set var="path" value="<%=request.getContextPath() %>"/>  
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="//cdn.ckeditor.com/4.15.0/standard/ckeditor.js"></script>
</head>
<body>
<h1>도서 수정</h1>


<% Integer bookId   = (Integer)request.getAttribute("bookId"); %>

<form method="post" action="${path}/book/update/${bookId}" enctype="multipart/form-data">
제목: <input type="text" name="title" value="${beforeUpdateBook.title}" class="form-control">
내용: <input type="text" name="content" value="${beforeUpdateBook.content}" class="form-control">
목차: <textarea rows="10" cols="50" id="editor" name="mokcha" class="ckeditor">${beforeUpdateBook.mokcha}</textarea>
	<script>
				var ckeditor_config = {
						 
						resize_enable : false,
						enterMode : CKEDITOR.ENTER_BR,
						shiftEnterMode : CKEDITOR.ENTER_P
				};
				
				config.disallowedContent = 'ul','li','ol';
				CKEDITOR.replace("editor", ckeditor_config); 
				
			
			
			</script>
	<img src="${path}/resources/${beforeUpdateBook.bookImage.originalFilename}">
	<input type="file" name="file">
	<button type="submit" class="btn btn-info">수정완료</button>
	</form>
</body>
</html>