package cn.gdcp.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class u6 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().print("get提交方式<br/>");
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				response.getWriter().print(j + "*" + i + "=" + i * j+"\t");
			}
			response.getWriter().print("<br/>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().print("post提交方式<br/>");
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				response.getWriter().print(j + "*" + i + "=" + i * j+"\t");
			}
			response.getWriter().print("<br/>");
		}
	}

}
