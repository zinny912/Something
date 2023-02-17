<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>update Page</h3>
	<form action="./update" method="post">
		<input type="text" value="${dto.writingId}" name="writingId" readonly/>
		<input type="text" value="${dto.typeId}" name="typeId" readonly/>
		
		<input type="text" value="${dto.writingTitle}" name="writingTitle"/>
		<input type="text" value="${dto.writingDetail}" name="writingDetail"/>
		<button type="submit">수정 하기</button>
	</form>
	
</body>
</html>