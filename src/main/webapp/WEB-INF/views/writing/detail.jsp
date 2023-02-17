<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	
	<h3>detail Page</h3>
	<h3>id : ${dto.writingId}</h3>
	<h3>title : ${dto.writingTitle}</h3>
	<h3>detail : ${dto.writingDetail}</h3>
	
	<form action="/writing/delete" method="get">
		<input type="text" name="writingId" value="${dto.writingId}"/>
		<button type="submit">삭제하기</button>
	</form>
	
</body>
</html>