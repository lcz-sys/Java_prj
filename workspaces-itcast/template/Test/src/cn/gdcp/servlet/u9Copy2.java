package cn.gdcp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.gdcp.DB.BookDB;
import cn.gdcp.domain.Book;

public class u9Copy2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		List<Book> cart = null;
		boolean purFlag = true;
		HttpSession session = request.getSession();
		if(session == null){
			purFlag = false;
		}else{
			cart = (List<Book>) session.getAttribute("cart");
			if(cart == null){
				purFlag = false;
			}
		}
		if(!purFlag){
			out.write("�Բ��� ��û�й����κβ�Ʒ");
		}else{
			out.write("�㹺���ͼ����:<br/>");
			double price = 0;
			for(Book book :cart){
				out.write(book.getName()+"<br/>");
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
