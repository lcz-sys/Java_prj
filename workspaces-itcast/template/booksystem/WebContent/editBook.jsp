<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>修改图书信息</title>

<!-- 引入外部文件 -->
<link rel="stylesheet"  type="text/css"  href="css/bootstrap.min.css"/>
<link rel="stylesheet" type="text/css"  href="css/style.css"/>
<script type="text/javascript" src="js/jquery-1.11.3.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript">

	function saveEdit(){
		$("#signupForm").submit(function(){
			return confirm("是否修改该书籍");
		}); 
	}

</script>

<style>
body {
	margin-top: 20px;
	margin: 0 auto;
}

.carousel-inner .item img {
	width: 100%;
	height: 300px;
}

font {
	color: #3164af;
	font-size: 18px;
	font-weight: normal;
	padding: 0 10px;
}
</style>
</head>
<body>
	<div><img src="images/logo.png" width="195" height="50" style="margin-left:175px" /></div>
	<div class="container"
		style="width: 100%; background: url('image/regist_bg.jpg');">
		<div class="row">
			<div class="col-md-2"></div>
			<div class="col-md-8" style="background: #fff; padding: 40px 80px; margin: 30px; border: 7px solid #ccc;">
				<font>修改图书</font>&nbsp;&nbsp;&nbsp;EDIT BOOK
				
				<!-- 图书修改表单 -->
				<form action="editServlet?id=${book.id}" method="POST" id="signupForm" class="form-horizontal" style="margin-top: 5px;">
				
					<div class="form-group">
						<label for="username" class="col-sm-2 control-label">图书名称</label>
						<div class="col-sm-6">
							<input type="text"  name="name" value="${book.name}" class="form-control" id="bname">
						</div>
					</div>
					
					<div class="form-group">
						<label for="inputPassword3" class="col-sm-2 control-label">图书价格</label>
						<div class="col-sm-6">
							<input type="text" name="price" value="${book.price}" class="form-control" id="bprice">
						</div>
					</div>
					
					<div class="form-group">
						<label for="confirmpwd" class="col-sm-2 control-label">图书数量</label>
						<div class="col-sm-6">
							<input type="text" name="bnum" value="${book.bnum}" class="form-control" id="bnum">
						</div>
					</div>
					
					<div class="form-group">
						<label for="inputEmail3" class="col-sm-2 control-label">图书类别</label>
						<div class="col-sm-6">
							<input type="text" name="category" value="${book.category}" class="form-control" id="category">
						</div>
					</div>

					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<input type="submit" onclick="saveEdit()" width="100" value="保存" name="submit"/>
						</div>
					</div>
				</form>
			</div>

			<div class="col-md-2"></div>
		</div>
	</div>

	<jsp:include page="footer.jsp" />
</body>
</html>




