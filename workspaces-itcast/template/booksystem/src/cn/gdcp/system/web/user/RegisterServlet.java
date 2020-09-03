package cn.gdcp.system.web.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.gdcp.system.dao.UserDao;
import cn.gdcp.system.model.User;
import cn.gdcp.system.util.Md5Util;

@WebServlet("/registerServlet")
public class RegisterServlet extends HttpServlet {
	UserDao userDao = new UserDao();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	//完成用户注册
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//设置请求参数编码格式
		req.setCharacterEncoding("utf-8");
		//获取注册表单信息
		String username = req.getParameter("username");
		String pwd = req.getParameter("password");
		String email = req.getParameter("email");
		String gender = req.getParameter("gender");
		
		//密码加密
		String encodeByMd5 = Md5Util.encodeByMd5(pwd);
		
		//封装到User对象中
		User user = new User();
		user.setUsername(username);
		user.setPassword(encodeByMd5);
		user.setEmail(email);
		user.setGender(gender);
		
		//调用UserDao注册功能
		try {
			userDao.register(user);
			//注册成功，重定向到login.jsp
			resp.sendRedirect(req.getContextPath()+"/login.jsp");
		} catch (Exception e) {
			e.printStackTrace();
			//出现异常，给出提示
			resp.setContentType("text/html;charser=utf-8");
			resp.getWriter().write("<h1>系统异常，请联系管理员 020-888666</h1>");
		}
	}
}
