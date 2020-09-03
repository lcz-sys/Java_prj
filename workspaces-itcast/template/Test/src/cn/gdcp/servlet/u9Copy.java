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

public class u9Copy extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		if(id == null){
			String url = "u9";
			response.sendRedirect(url);
			return;
		}
		System.out.println(1);
		Book book = BookDB.getBook(id);
		HttpSession session = request.getSession();
		List<Book> cart = (List<Book>) session.getAttribute("cart");
		if(cart == null){
			cart = new ArrayList<Book>();
			session.setAttribute("cart", cart);
		}
		cart.add(book);
		System.out.println(2);
		Cookie cookie = new Cookie("HSESSIONID",session.getId());
		cookie.setMaxAge(60*30);
		cookie.setPath("/Test");
		response.addCookie(cookie);
		String url = "u9Copy2";
		response.sendRedirect(url);
		System.out.println(3);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
