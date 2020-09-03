package cn.gdcp.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String name = req.getParameter("username");
		String pwd = req.getParameter("password");
		
		if(name.equals("admin") && pwd.equals("123456")){
			HttpSession session = req.getSession();
			session.setAttribute("username", name);
			ArrayList<String> list = new ArrayList<>();
			list.add("�Ǻ�");
			list.add("�Ǻ�2");
			list.add("�Ǻ�3");
			list.add("�Ǻ�4");
			list.add("�Ǻ�5");
			req.setAttribute("list", list);
			req.getRequestDispatcher("index.jsp").forward(req, resp);	
		}else{
			resp.setContentType("text/html;charset=utf-8");
			resp.getWriter().write("��¼ʧ��");
		}
	}

}
