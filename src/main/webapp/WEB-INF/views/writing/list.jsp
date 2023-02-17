<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>list page</h3>
	
	<c:forEach items="${list}" var="dto">
		<h3><a href="./detail?writingId=${dto.writingId}">${dto.writingId}</a></h3>
	</c:forEach>
	
	<h1><a href="/writing/insert">삽입하기</a></h1>
	
</body>
</html>