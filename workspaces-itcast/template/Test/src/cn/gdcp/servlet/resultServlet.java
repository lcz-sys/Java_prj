package cn.gdcp.servlet;


import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.gdcp.domain.Square;

@WebServlet("/resultServlet")
public class resultServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf8");
		
		String tmp1 = req.getParameter("length");
		
		
		
		if(tmp1.equals("")){
			resp.setContentType("text/html;charset=utf-8");
			
			resp.getWriter().write("请输入边长,<a href='input.jsp'>点击返回</a>");
		}else{
			double length = Double.valueOf(tmp1);
			
			Square sq1 = new Square();
			
			double area = sq1.getArea(length);
			
			ServletContext application = this.getServletContext();
			
			application.setAttribute("area", area);
			
			req.getRequestDispatcher("/result.jsp").forward(req, resp);
			
		}
		
	}

}
