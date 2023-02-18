<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../template/common_css.jsp"></c:import>

</head>
<body>
	<c:import url="../template/header.jsp"></c:import>
	
	
	
	<form class="row col-md-10 mt-3 mx-auto" action="./insert" method="post" enctype="multipart/form-data">
		<h1 class="text-center">notice insert Page</h1>
		<div class="mb-3">
			<label for="title" class="form-label">제목</label>
			<input type="text" class="form-control" id="title" name="writingTitle">
		</div>
		<div class="mb-3">
			<label for="detail" class="form-label">내용</label>
			<textarea rows="5" cols="5" class="form-control" id="detail" name="writingDetail"></textarea>
		</div>
		<div class="mb-3">
			<label for="files" class="form-label">이미지</label>
			<input type="file" class="form-control" id="files" name="pic" />
		</div>
		<div>
			<input type="hidden" name="typeId" value="1"/>
		</div>
		<div>
			<button type="submit" class="btn btn-primary float-end">작성하기</button>
		</div>
		
	</form>
	
	<c:import url="../template/common_js.jsp"></c:import>
</body>
</html>