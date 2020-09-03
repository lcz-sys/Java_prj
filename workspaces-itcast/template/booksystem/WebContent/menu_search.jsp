<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<script type="text/javascript" src="js/my.js"></script>
<script type="text/javascript">
	function search(){
		$("#searchForm").submit(function(){
			return true; 
		});
	}
</script>

<div id="divmenu">
	<a href="#">文学</a>
	<a href="#">生活</a>
	<a href="#">计算机</a>
	<a href="#">外语</a>
	<a href="#">经管</a>
	<a href="#">励志</a>
	<a href="#">社科</a>
	<a href="#">学术</a>
	<a href="#">少儿</a>
	<a href="#">艺术</a>
	<a href="#">原版</a>
	<a href="#">科技</a>
	<a href="#">考试</a>
	<a href="#">生活百科</a>
</div>
<div id="divsearch">
	<form action="searchServlet" method="post" id="searchForm">
		<table width="100%" border="0" cellspacing="0">
			<tr>
				<td style="text-align:right; padding-right:220px">
					书名：
					<input type="text" name="name" value="${BOOKNAME}" class="inputtable" onkeyup="searchName();" id="name"/> 
					<input type="image" src="images/serchbutton.gif" onclick="search()" border="0" style="margin-bottom:-4px">
				</td>
			</tr>
		</table>

	</form>
</div>
<div id="content"
	style="background-color:white;width:128px; text-align:left;margin-left:945px;color:black;float:left;margin-top: -20px;display: none">
</div>