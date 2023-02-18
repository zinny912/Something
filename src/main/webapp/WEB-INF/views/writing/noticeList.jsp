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
		<div class="row col-md-10 my-3 mx-auto">
			<div class="mb-3">
				<h3 class="text-center">notice list page</h3>
			</div>
			<div class="mb-3">
				<table class="table table-hover">
					<thead>
						<tr>
							<th class="col-md-1"> 글 번호 </th>
							<th class="col-md-11"> 제목 </th>
						</tr>
					</thead>
					<tbody class="table-group-divider mb-1">
						<c:forEach items="${list}" var="dto">
							<tr>
								<td>${dto.writingId}</td>
								<td><a href="./detail?writingId=${dto.writingId}">${dto.writingTitle}</a></td>
							</tr>
						</c:forEach>		
					</tbody>
				</table>
				<div class="row">
					<nav aria-label="Page navigation example">
						<div class="row">
							<div class="col-md-10">
								<ul class="pagination">
									<c:if test="${pagination.page != 1}">
										<li class="page-item">
											<a class="page-link" href="./noticeList?page=1&kind=${pagination.kind}&search=${pagination.search}" aria-label="Previous">
												<span aria-hidden="true">&laquo;</span>
						      				</a>
						    			</li>
						    		</c:if>
						    		<c:if test="${pagination.page != 1}">
						    			<li class="page-item">
						      				<a class="page-link" href="./noticeList?page=${pagination.page - 1}" aria-label="Previous">
						        				<span aria-hidden="true">&lsaquo;</span>
						      				</a>
						    			</li>
						    		</c:if>
						    
						    		<c:forEach begin="${pagination.startNum}" end="${pagination.endNum}" var="i">
							    		<li class="page-item"><a class="page-link" href="./noticeList?page=${i}&kind=${pagination.kind}&search=${pagination.search}">${i}</a></li>
									</c:forEach> 
						    
						    		<c:if test="${pagination.page != pagination.totalPage }">
						    			<li class="page-item">
						      				<a class="page-link" href="./noticeList?page=${pagination.page + 1}" aria-label="Next">
						        				<span aria-hidden="true">&rsaquo;</span>
						      				</a>
						    			</li>
						   			</c:if>
						    		<c:if test="${pagination.after == false }">
						    			<li class="page-item">
						      				<a class="page-link" href="./noticeList?page=${pagination.totalPage}&kind=${pagination.kind}&search=${pagination.search}" aria-label="Next">
						        				<span aria-hidden="true">&raquo;</span>
						      				</a>
						    			</li>
						    		</c:if>
						  		</ul>
							</div>
						  	<div class="col-md-2">
						  		<p class="fw-bold">${pagination.page}/${pagination.totalPage} 페이지</p>
						  	</div>
					  	</div>
					</nav>
				</div>
			</div>
			<div class="row">
				<form class="row col-10" action="./noticeList" method="get">
					<div class="col-auto my-auto ms-0">
				  		<label for="kind" class="visually-hidden">Kind</label>
				    	<select class="form-select" name="kind" id="kind" aria-label="Default select example">
							<option value="title">공지 제목</option>
						  	<option value="contents">공지 내용</option>
						</select>
				  	</div>
				  	<div class="col-auto my-auto ms-0">
				    	<label for="search" class="visually-hidden">Search</label>
				    	<input type="text" class="form-control" name="search" id="search" placeholder="inputText">
				  	</div>
				  	<div class="col-auto my-auto ms-0">
				    	<button type="submit" class="btn btn-primary">검색</button>
				  	</div>
				</form>
				<div class="col-2">
					<a href="/writing/noticeInsert" class="btn btn-primary float-end">공지사항 작성</a>
				</div>
			</div>
			
		</div>
	</div>
	<c:import url="../template/common_js.jsp"></c:import>
</body>
</html>