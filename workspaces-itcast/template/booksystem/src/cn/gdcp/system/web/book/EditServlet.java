package cn.gdcp.system.web.book;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.gdcp.system.dao.BookDao;
import cn.gdcp.system.model.Book;

@WebServlet("/editServlet")
public class EditServlet extends HttpServlet {

	BookDao bookDao = new BookDao();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String price = req.getParameter("price");
		String bnum = req.getParameter("bnum");
		String category = req.getParameter("category");
		
		Book book = new Book();
		book.setId(id);
		book.setName(name);
		book.setPrice(Double.valueOf(price).doubleValue());
		book.setBnum(Integer.valueOf(bnum).intValue());
		book.setCategory(category);
		
		try {
			bookDao.editBook(book);
			req.getRequestDispatcher("/bookServlet").forward(req, resp);
		} catch (Exception e) {
			e.printStackTrace();
			resp.setContentType("text/html;charser=utf-8");
			resp.getWriter().write("<h1>系统异常，请联系管理员 020-888666</h1>");
		}		
		
	}
}
