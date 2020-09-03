<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>黑马商城购物车</title>
		<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css" />
		<script src="js/jquery-1.11.3.min.js" type="text/javascript"></script>
		<script src="js/bootstrap.min.js" type="text/javascript"></script>
		<!-- 引入自定义css文件 style.css -->
		<link rel="stylesheet" href="css/style.css" type="text/css" />
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
		<!-- 引入header.jsp -->
		<jsp:include page="/header.jsp"></jsp:include>
		
		
		
		<c:choose>
			<c:when test="${!empty cart.map}">
				<div class="container">
					<div class="row">
		
						<div style="margin:0 auto; margin-top:10px;width:950px;">
							<strong style="font-size:16px;margin:5px 0;">购物车详情</strong>
							<table class="table table-bordered">
								<tbody>
									<tr class="warning">
										<th>图片</th>
										<th>商品</th>
										<th>价格</th>
										<th>数量</th>
										<th>小计</th>
										<th>操作</th>
									</tr>
									<c:forEach var="entry" items="${cart.map}">
										<tr>
											<td width="60" width="40%">
												<input type="hidden" name="id" value="22">
												<img src="${entry.value.product.pimage}" width="70" height="60">
											</td>
											<td width="30%">
												<a target="_blank">${entry.value.product.pname}</a>
											</td>
											<td width="20%">
												￥${entry.value.product.shop_price}
											</td>
											<td width="10%">
												<input 
													type="text" 
													name="quantity" 
													value="${entry.value.num}" 
													onchange="updateProduct(${entry.key},this.value)"
													maxlength="4" 
													size="10">
											</td>
											<td width="15%">
												<span class="subtotal">￥${entry.value.subTotal}</span>
											</td>
											<td>
												<a href="javascript:deleteProduct('${entry.value.product.pname}',${entry.key})" class="delete">删除</a>
											</td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
					
					<div style="margin-right:130px;">
						<div style="text-align:right;">
							<em style="color:#ff6600;">
								赠送积分: 
							</em> 
					<em style="color:#ff6600;">
						<fmt:formatNumber value="${cart.total}" type="number"/>
					</em>
					&nbsp; 商品金额: <strong style="color:#ff6600;">￥${cart.total}元</strong>
						</div>
						<div style="text-align:right;margin-top:10px;margin-bottom:10px;">
							<a href="javascript:deleteAllProduct()" id="clear" class="clear">清空购物车</a>
						</div>
					</div>
		
				</div>
			</c:when>
			<c:otherwise>
				<div align="center">
					<font style="font-size: 44px">购物车无商品</font>
				</div>
			</c:otherwise>
		</c:choose>
		
		

		
			
			<script type="text/javascript">
				function deleteProduct(pname,pid){
					var flag = window.confirm("你确认要删除【"+pname+"】吗?");
					if(flag){
						var url = "${pageContext.request.contextPath}/cart?method=deleteProduct&pid="+pid;
						window.location.href  = url;
					}
				}
				
				
				function deleteAllProduct(){
					var flag = window.confirm("你确认要【清空购物车】吗?");
					if(flag){
						var url = "${pageContext.request.contextPath}/cart?method=deleteAllProduct";
						window.location.href  = url;
					}
				}
				
				function updateProduct(pid,num){
					var url = "${pageContext.request.contextPath}/cart?method=updateProduct&pid="+pid+"&num="+num;
					window.location.href = url;
				}
			</script>

		<!-- 引入footer.jsp -->
		<jsp:include page="/footer.jsp"></jsp:include>

	</body>

</html>
