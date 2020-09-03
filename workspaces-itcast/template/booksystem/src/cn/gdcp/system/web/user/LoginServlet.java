package cn.gdcp.system.web.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.gdcp.system.dao.UserDao;
import cn.gdcp.system.model.User;
import cn.gdcp.system.util.Md5Util;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	UserDao userDao = new UserDao();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		String encodeByMd5 = Md5Util.encodeByMd5(password);
		
		try {
			User user = userDao.login(username, encodeByMd5);
			
			if(user != null){
				HttpSession session = req.getSession();
				session.setAttribute("USER", user);
				req.getRequestDispatcher("/bookServlet").forward(req, resp);
			}else{
				req.setAttribute("error", "用户名或密码错误");
				req.getRequestDispatcher("/login.jsp").forward(req, resp);
			}
		} catch (Exception e) {
			e.printStackTrace();
			resp.setContentType("text/html;charset=utf-8");
			resp.getWriter().write("<h1>系统异常，请联系管理员 020-888666</h1>");
		}
	}
}
