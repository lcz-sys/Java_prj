<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>index</title>
</head>
<body>

	<c:choose>
		<c:when test="${username != null}">
			<h1>欢迎回来，${username}</h1>
			<ul>
				<c:forEach items="${list}" var="e">
					<li><a href="gdcp.cn">${e}</a></li>
				</c:forEach>
			</ul>
		</c:when>
		<c:otherwise>
			<h1>
				更多资源，请先<a href="login.jsp">登录</a>
			</h1>
		</c:otherwise>
	</c:choose>

</body>
</html>