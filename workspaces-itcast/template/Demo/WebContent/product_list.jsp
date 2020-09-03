<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>	
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>会员登录</title>
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css" />
<script src="js/jquery-1.11.3.min.js" type="text/javascript"></script>
<script src="js/bootstrap.min.js" type="text/javascript"></script>
<!-- 引入自定义css文件 style.css -->
<link rel="stylesheet" href="css/style.css" type="text/css" />

<style>
body {
	margin-top: 20px;
	margin: 0 auto;
	width: 100%;
}

.carousel-inner .item img {
	width: 100%;
	height: 300px;
}
</style>
</head>

<body>


	<!-- 引入header.jsp -->
	<jsp:include page="/header.jsp"></jsp:include>


	<div class="row" style="width: 1210px; margin: 0 auto;">

		<c:choose>
			<c:when test="${!empty pageBean.list}">
				<c:forEach var="product" items="${pageBean.list}">
					<div class="col-md-2">
						<a href="${pageContext.request.contextPath}/product?method=findProductByPid&pid=${product.pid}"> <img src="${product.pimage}"
							width="170" height="170" style="display: inline-block;">
						</a>
						<p>
							<a href="${pageContext.request.contextPath}/product?method=findProductByPid&pid=${product.pid}" style='color: green'>${product.pname}</a>
						</p>
						<p>
							<font color="#FF0000">商城价：&yen;${product.shop_price}</font>
						</p>
					</div>
				</c:forEach>
			</c:when>
			<c:otherwise>
				暂无商品显示
			</c:otherwise>
		</c:choose>
		
	</div>

	<!--分页 -->
	<div style="width: 380px; margin: 0 auto; margin-top: 50px;">
		<ul class="pagination" style="text-align: center; margin-top: 10px;">
			
			<%--显示上一页--%>
			<c:choose>
				<c:when test="${pageBean.currPageNO == 1}">
					<li class="disabled"><a href="javascript:void(0)" aria-label="Previous"><span aria-hidden="true">&laquo;</span></a></li>
				</c:when>
				<c:otherwise>
					<li><a href="${pageContext.request.contextPath}/product?method=findAllProductByCid&cid=${param.cid}&currPageNO=${pageBean.currPageNO-1}" aria-label="Previous"><span aria-hidden="true">&laquo;</span></a></li>
				</c:otherwise>
			</c:choose>
			
			<%--显示页号--%>
			<c:forEach var="i" begin="1" end="${pageBean.allPageNO}">
				<c:choose>
					<c:when test="${pageBean.currPageNO == i}">
						<li class="active"><a href="${pageContext.request.contextPath}/product?method=findAllProductByCid&cid=${param.cid}&currPageNO=${i}">${i}</a></li>
					</c:when>
					<c:otherwise>
						<li><a href="${pageContext.request.contextPath}/product?method=findAllProductByCid&cid=${param.cid}&currPageNO=${i}">${i}</a></li>
					</c:otherwise>
				</c:choose>
			</c:forEach>
			
			<%--显示下一页--%>
			<c:choose>
				<c:when test="${pageBean.currPageNO == pageBean.allPageNO}">
					<li class="disabled"><a href="javascript:void(0)" aria-label="Next"> <span aria-hidden="true">&raquo;</span></a></li>
				</c:when>
				<c:otherwise>
					<li><a href="${pageContext.request.contextPath}/product?method=findAllProductByCid&cid=${param.cid}&currPageNO=${pageBean.currPageNO+1}" aria-label="Next"> <span aria-hidden="true">&raquo;</span></a></li>
				</c:otherwise>
			</c:choose>
			
		</ul>
	</div>
	<!-- 分页结束 -->

	<!--商品浏览记录-->
	<div
		style="width: 1210px; margin: 0 auto; padding: 0 9px; border: 1px solid #ddd; border-top: 2px solid #999; height: 246px;">

		<h4 style="width: 50%; float: left; font: 14px/30px 微软雅黑">浏览记录</h4>
		<div style="width: 50%; float: right; text-align: right;">
			<a href="">more</a>
		</div>
		<div style="clear: both;"></div>

		<div style="overflow: hidden;">

			<ul style="list-style: none;">
				<li
					style="width: 150px; height: 216; float: left; margin: 0 8px 0 0; padding: 0 18px 15px; text-align: center;"><img
					src="products/1/cs10001.jpg" width="130px" height="130px" /></li>
			</ul>

		</div>
	</div>


	<!-- 引入footer.jsp -->
	<jsp:include page="/footer.jsp"></jsp:include>

</body>

</html>
