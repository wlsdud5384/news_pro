<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"
    %>
    <%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <c:set var="contextPath" value="${pageContext.request.contextPath }" />
    
    <%
    	request.setCharacterEncoding("UTF-8");
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>뉴스 수정창</title>
<style>
	.text_center {
		text-align:center;
	}
</style>
</head>
<body>
	<form method="post" action="${contextPath }/news/updateNews.do">
		<h1 class="text_center">회원 정보 수정창</h1>
		<table align="center" var="news" items="${newssList}" >
			<tr>
				<td width="200"><p align="right">뉴스</p></td>
				<td width="400"><input type="text" readonly value="${news.aid}" name="aid"></td>
			</tr>
			<tr>
				<td width="200"><p align="right">제목</p></td>
				<td width="400"><input type="text" value="${news.title}" name="title"></td>
			</tr>
			<tr>
				<td width="200"><p align="right">이미지</p></td>
				<td width="400"><input type="text" value="${news.img}" name="img"></td>
			</tr>
			<tr>
				<td width="200"><p align="right">내용</p></td>
				<td width="400"><p><input type="text" value="${news.content}" name="content"></td>
				</tr>
				<tr>
				<td width="200"><p>&nbsp;</p></td>
					<td width="400"><input type="submit" value="수정하기"><input type="reset" value="다시입력"></td>
			</tr>
		</table>
	</form>
</body>
</html>