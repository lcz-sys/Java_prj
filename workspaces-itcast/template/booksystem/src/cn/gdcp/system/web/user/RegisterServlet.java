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
	
	//����û�ע��
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//����������������ʽ
		req.setCharacterEncoding("utf-8");
		//��ȡע�����Ϣ
		String username = req.getParameter("username");
		String pwd = req.getParameter("password");
		String email = req.getParameter("email");
		String gender = req.getParameter("gender");
		
		//�������
		String encodeByMd5 = Md5Util.encodeByMd5(pwd);
		
		//��װ��User������
		User user = new User();
		user.setUsername(username);
		user.setPassword(encodeByMd5);
		user.setEmail(email);
		user.setGender(gender);
		
		//����UserDaoע�Ṧ��
		try {
			userDao.register(user);
			//ע��ɹ����ض���login.jsp
			resp.sendRedirect(req.getContextPath()+"/login.jsp");
		} catch (Exception e) {
			e.printStackTrace();
			//�����쳣��������ʾ
			resp.setContentType("text/html;charser=utf-8");
			resp.getWriter().write("<h1>ϵͳ�쳣������ϵ����Ա 020-888666</h1>");
		}
	}
}
