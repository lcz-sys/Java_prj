<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>


<title>图书列表</title>

<!-- 引入外部文件 -->
<link rel="stylesheet" href="css/main.css" type="text/css" />
<link rel="stylesheet"  type="text/css"  href="css/bootstrap.min.css"/>
<link rel="stylesheet" type="text/css"  href="css/style.css"/>
<script type="text/javascript" src="js/jquery-1.11.3.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript">
	function deleteBook(id){
		var isDel = confirm("是否删除编号为"+id+"的书籍");
		if(isDel){
			$.ajax({
				type:"POST",
				url:"deleteServlet",
				data:{"id":id},
				success:function(data){
					alert(data);
					window.location.reload();
				},
				error:function(data){
					alert(data);
				}
			});
		}
	}
</script>
</head>

<body class="main">

	<jsp:include page="head.jsp" />
	<jsp:include page="menu_search.jsp" />

	<div id="divpagecontent">
		<table width="100%" border="0" cellspacing="0">
			<tr>
				<td>
					<div style="text-align:right; margin:5px 10px 5px 0px">
						<a href="#">首页</a>&nbsp;&nbsp;&nbsp;&nbsp;&gt;&nbsp;&nbsp;&nbsp;&nbsp;计算机&nbsp;&nbsp;&nbsp;&nbsp;&gt;&nbsp;&nbsp;&nbsp;&nbsp;图书列表
					</div>

			<table cellspacing="0" class="listcontent">
				<tr>
					<td>
						<a href="addBook.jsp"><big><strong>新增图书</strong></big></a>
						<hr />
						<div style="margin-top:20px; margin-bottom:5px">
							<img src="images/productlist.gif" width="100%" height="38" />
						</div>

			<table cellspacing="0" cellpadding="1" rules="all"
					bordercolor="gray" border="1" id="DataGrid1" style="BORDER-RIGHT: gray 1px solid; BORDER-TOP: gray 1px solid; BORDER-LEFT: gray 1px solid; WIDTH: 100%; WORD-BREAK: break-all; BORDER-BOTTOM: gray 1px solid; BORDER-COLLAPSE: collapse; BACKGROUND-COLOR: #f5fafe; WORD-WRAP: break-word">
				<!-- 表头 -->
				<tr style="FONT-WEIGHT: bold; FONT-SIZE: 12pt; BACKGROUND-COLOR: #afd1f3">
					<td align="center" width="15%">图书编号</td>
					<td align="center" width="20%">图书名称</td>
					<td align="center" width="15%">图书价格</td>
					<td align="center" width="15%">图书数量</td>
					<td width="15%" align="center">图书类别</td>
					<td width="10%" align="center">编辑</td>
					<td width="10%" align="center">删除</td>
				</tr>
				<!-- 图书信息 -->
				<c:forEach items="${BOOKLIST}" var="book">
				<tr onmouseover="this.style.backgroundColor = 'white'" onmouseout="this.style.backgroundColor = '#F5FAFE';">
					<td>${book.id}</td>
					<td>${book.name}</td>
					<td>${book.price}</td>
					<td>${book.bnum}</td>
					<td>${book.category}</td>
					<!-- 编辑按钮 -->
					<td>
						<a href="queryServlet?id=${book.id}"><img src="images/edit.gif" border="0" style="CURSOR: hand"></a>
					</td>
					<!-- 删除按钮 -->
					<td >
						<a href="javascript:deleteBook('${book.id}')">
							<img src="images/error.jpg" width="16" height="16" border="0" style="CURSOR: hand">
						</a>
					</td>
				</tr>
				</c:forEach>
			</table>

							</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</div>



	<jsp:include page="footer.jsp" />


</body>
</html>
