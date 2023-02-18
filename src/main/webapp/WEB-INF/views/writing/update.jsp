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
	
	<form class="row col-md-10 mt-3 mx-auto" action="./update" method="post" enctype="multipart/form-data">
		<h1 class="text-center">update Page</h1>
		<div class="mb-3">
			<label for="title" class="form-label">제목</label>
			<input type="text" class="form-control" id="title" value="${dto.writingTitle}" name="writingTitle">
		</div>
		<div class="mb-3">
			<label for="detail" class="form-label">내용</label>
			<textarea rows="5" class="form-control" id="detail" name="writingDetail">${dto.writingDetail}</textarea>
		</div>
		<div>
			<input type="hidden" value="${dto.writingId}" name="writingId"/>
			<input type="hidden" name="typeId" value="${dto.typeId}"/>
		</div>
		<div>
			<button type="submit" class="btn btn-primary float-end">수정하기</button>
		</div>	
	</form>
	
	<c:import url="../template/common_js.jsp"></c:import>
</body>
</html>