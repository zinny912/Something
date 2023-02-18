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
	
	<div class="container-fluid">
		<div class="col-md-10 mx-auto">
			<div class="row my-3">
				<h3 class="text-center fw-bold">${dto.writingTitle}</h3>
				<hr>
			</div>
			<div class="row mb-3">
				<h3 class="text-center">${dto.writingDetail}</h3>
			</div>
			<div class="row mb-3">
				<c:if test="${not empty dto.writingImgDTO}">
					<img alt="img" class="img-thumbnail" src="../resources/upload/writing/${dto.writingImgDTO.fileName}">
				</c:if>
			</div>
			<div class="row mb-3">
				<p class="col-8"></p>
				<form class="col-2" action="/writing/delete" method="get">
					<input type="hidden" name="writingId" value="${dto.writingId}"/>
					<button type="submit" class="btn btn-primary float-end">삭제하기</button>
				</form>
				
				<form class="col-2" action="/writing/update" method="get">
					<input type="hidden" name="writingId" value="${dto.writingId}"/>
					<button type="submit" class="btn btn-primary float-end">수정하기</button>
				</form>
			</div>
		</div>
	</div>
	
	
	<c:import url="../template/common_js.jsp"></c:import>
</body>
</html>