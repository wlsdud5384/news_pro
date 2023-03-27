<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"
    %>
    <%@ taglib prefix="fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
	<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
	<c:set var="contextPath" value="${pageContext.request.contextPath }" />
	<%
		request.setCharacterEncoding("UTF-8");
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>뉴스 목록창</title>
	<style>
		.text_center {
			text-align: center;
		}
	</style>
</head>
<body>
	<form method="post" action="${contextPath }/news/addNews.do">
		<h1 calss="text_center" align="center">뉴스 추가하기</h1><hr>
		<table align="center">
			<tr>
			<td width="200"><p align="right">번호<td>
			<td width="200"><input type="text" name="aid" ></td>
			</tr>
			<tr>
			<td width="200"><p align="right">제목<td>
			<td width="200"><input type="text" name="title"></td>
			</tr>
			<tr>
			<td width="200"><p align="right">이미지<td>
			<td width="200"><p><input type="text" name="img"></td>
			</tr>
			<tr>
			<td width="200"><p align="right">내용<td>
			<td width="200"><p><input type="text" name="content"></td>
			</tr>
			<tr>
			<td width="200"><p>&nbsp;</p><td>
			<td width="400">
			<input type="submit" value="뉴스추가"> <input type="reset" value="다시입력">
			</td>
			</tr>
		</table>
	</form>
	
	
</body>
</html>