<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>输入边长</title>
</head>
<body>
	<form action="resultServlet" method="POST">
		正方形的边长是:<input type="text" name="length"/><br>
		<input type="submit" name="submit" value="计算结果"/>
	</form>
</body>
</html>