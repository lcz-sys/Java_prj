<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>会员登录</title>

<!-- 引入外部文件 -->
<link rel="stylesheet"  type="text/css"  href="css/bootstrap.min.css"/>
<link rel="stylesheet" type="text/css"  href="css/style.css"/>
<script type="text/javascript" src="js/jquery-1.11.3.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>

<style>
body {
	margin-top: 20px;
	margin: 0 auto;
}
   
.carousel-inner .item img {
	width: 100%;
	height: 300px;
}

.container .row div {
	/* position:relative;
				 float:left; */
	
}

font {
	color: #666;
	font-size: 22px;
	font-weight: normal;
	padding-right: 17px;
}
</style>
</head>
<body>

	<div><img src="images/logo.png" width="195" height="50" style="margin-left:175px" /></div>

	<div class="container"
		style="width: 100%; height: 560px; background: #B4EEB4 url('images/bg.jpg') no-repeat; background-size: cover;">
		<div class="row">
			<div class="col-md-7"></div>

			<div class="col-md-5">
				<div style="width: 440px; border: 1px solid #E7E7E7; padding: 20px 0 20px 30px; border-radius: 5px; margin-top: 60px; background: #fff;">
				
					<font>会员登录</font>  <font><a href="register.jsp">立即注册</a></font>
					<div>&nbsp;</div>
					
					<!-- 登录表单 -->
					<form action="loginServlet" method="POST" id="loginForm" class="form-horizontal">
						<div class="form-group">
							<label for="username" class="col-sm-2 control-label">用户名</label>
							<div class="col-sm-6">
								<input type="text" class="form-control" id="username"
									placeholder="请输入用户名" name="username">
							</div>
						</div>
						<div class="form-group">
							<label for="inputPassword3" class="col-sm-2 control-label">密码</label>
							<div class="col-sm-6">
								<input type="password" class="form-control" id="password"
									placeholder="请输入密码" name="password">
							</div>
						</div>
						<!-- 错误提示信息显示位置 -->
						<div>
							<span id="errorSpan" style="color:red">${error}</span>
						</div>
						
						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10">
								<input type="submit" width="100" value="登录" name="submit"
									style="background: url('./images/login.gif') no-repeat scroll 0 0 rgba(0, 0, 0, 0); 
									height: 35px; width: 100px; color: white;"> 
							</div>
						</div>
						
					</form>
				</div>
			</div>
		</div>
	</div>

	<!-- 引入footer.jsp -->
	<jsp:include page="footer.jsp" />


</body>
</html>