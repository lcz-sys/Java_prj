package com.gdcp.control;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gdcp.po.Circle;


public class myServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String str = request.getParameter("radius");
		double tmp = Double.parseDouble(str);
		Circle circle = new Circle();
		circle.setRadius(tmp);
		double area = circle.getArea();
		
		ServletContext application = this.getServletContext();
		
		application.setAttribute("area", area);
		
		System.out.println(area);
		response.sendRedirect("result.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
