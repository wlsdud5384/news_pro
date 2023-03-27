<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" 
	isELIgnored="false" %>
	
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath }" />

<%
request.setCharacterEncoding("UTF-8");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>뉴스</title>
</head>
<body>
	<h2 align="center">뉴스 목록</h2>
	<table border="1" align="center" width="80%">
		<tr align="center" bgcolor="lightgreen">
			<td><b>번호</b></td>
			<td><b>제목</b></td>
			<td><b>시간</b></td>
		</tr>

		<c:forEach var="news" items="${newssList}">
			<tr align="center">
				<td>${news.aid }</td>
				<td>${news.title}</td>
				<td>${news.date }</td>
 				<td><a href="${contextPath}/news/removeNews.do?aid=${news.aid}">삭제하기</a></td>
 				<td><a href="${contextPath}/news/modNews.do?aid=${news.aid}">수정하기</a></td>
 				 
			</tr>
		</c:forEach>
	</table>
	<a href="${contextPath }/news/newsForm.do">
	<h1 style="text-align: center">뉴스추가하기</h1></a>

</body>
</html>