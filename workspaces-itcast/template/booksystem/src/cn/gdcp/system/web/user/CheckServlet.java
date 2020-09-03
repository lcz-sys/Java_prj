package cn.gdcp.system.web.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.gdcp.system.dao.UserDao;

@WebServlet("/checkServlet")
public class CheckServlet extends HttpServlet {
	UserDao userDao =new UserDao();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		
		String username = req.getParameter("username");
		try {
			boolean flag = userDao.checkName(username);
			if(flag){
				resp.getWriter().write("true");
			}else{
				resp.getWriter().write("false");
			}
		} catch (Exception e) {
			e.printStackTrace();
			resp.getWriter().write("false");
		}
	}

}
