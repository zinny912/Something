<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<nav class="navbar bg-dark navbar-expand-lg bg-body-tertiary" data-bs-theme="dark">
  <!-- Navbar content -->
  <div class="container-fluid">
  	
  	<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
		<ul class="navbar-nav me-auto mb-2 mb-lg-0">
			<li class="nav-item"><a class="nav-link active" href="/">홈</a></li>
			<li class="nav-item"><a class="nav-link active" href="/writing/noticeList">공지</a></li>
			<li class="nav-item"><a class="nav-link active" href="/writing/list">여행정보</a></li>
		</ul>
		<form class="navbar-nav me-auto my-auto" action="./list" method="get">
			<div class="col-3 my-auto mx-auto">
				<label class="text-primary">여행 정보 검색 </label>
			</div>
			<div class="col-auto my-auto">
				<label for="kind" class="visually-hidden">Kind</label>
				<select class="form-select" name="type" id="kind" aria-label="Default select example">
					<option value="title">글 제목</option>
					<option value="contents">글 내용</option>
				</select>
				<label for="kind" class="visually-hidden">Kind</label>
			</div>
			<div class="col-auto my-auto">
				<label for="search" class="visually-hidden">Search</label>
				<input type="text" class="form-control" name="search" id="search" placeholder="inputText" value="${pagination.search}">
			</div>
			<div class="col-auto my-auto">
				<button type="submit" class="btn btn-primary">검색</button>
			</div>
			
		</form>	
    	<ul class="navbar-nav">
			<c:if test="${members == null}">
				<li class="nav-item"><a class="nav-link" href="/member/memberLogin">LOGIN</a></li>
				<li class="nav-item"><a class="nav-link" href="/member/memberJoin">JOIN</a></li>
			</c:if>
			<c:if test="${members != null}">
				<li class="nav-item"><a class="nav-link" href="/member/memberPage">MyPage</a></li>
				<li class="nav-item"><a class="nav-link" href="/member/memberLogout">LOGOUT</a></li>
			</c:if>
		</ul>
    </div>
  </div>
</nav>