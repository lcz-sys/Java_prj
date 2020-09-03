package cn.gdcp.system.web.book;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.gdcp.system.dao.BookDao;
import cn.gdcp.system.model.Book;

@WebServlet("/deleteServlet")
public class DeleteServlet extends HttpServlet {
	
	BookDao bookDao = new BookDao();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		String id = req.getParameter("id");
		
		try {
			bookDao.deleteBook(id);
			resp.getWriter().write("删除成功");
		} catch (Exception e) {
			e.printStackTrace();
			resp.setContentType("text/html;charset=utf-8");
			resp.getWriter().write("<h1>系统异常，请联系管理员 020-888666</h1>");
		}
		
	}
}
