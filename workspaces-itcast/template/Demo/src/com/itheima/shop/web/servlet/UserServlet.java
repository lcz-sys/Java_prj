package com.itheima.shop.web.servlet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.itheima.shop.entity.User;
import com.itheima.shop.service.UserService;
import com.itheima.shop.util.MessageUtil;

/**
 * 这里是UserServlet，那么这里面只能包括关于用户的业务操作
 */
@WebServlet("/user")
public class UserServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//调用doPost方法
		this.doPost(request, response);
	}
	
	/**
	 * 相当于一个请求分发器
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String method = request.getParameter("method");//register
		switch(method){
		case "register":
			this.regsiter(request, response);
			break;
		case "login":
			this.login(request, response);
			break;
		case "logout":
			this.logout(request, response);
			break;
		}
	}
	
	/**
	 * 用户退出
	 */
	private void logout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//销毁HttpSession
		request.getSession().invalidate();
		//重写向到/default.jsp页面
		response.sendRedirect(request.getContextPath()+"/index.jsp");
	}
	
	/**
	 * 用户登录
	 */
	private void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			//获取数据
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			
			//创建并调用Service层对象的方法
			UserService userService = new UserService();
			User user = userService.login(username,password);
			
			//根据返回结果进行处理
			if(user!=null){
				request.getSession().setAttribute("USER",user);
				response.sendRedirect(request.getContextPath()+"/default.jsp");
			}else{
				MessageUtil.forward("用户登录失败，请重新登录", request, response);
//				response.sendRedirect(request.getContextPath()+"/login.jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
			MessageUtil.forward("用户登录异常，请联系管理员", request, response);
		}
		
	}
	
	/**
	 * 用户注册
	 */
	private void regsiter(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			//获取数据
			Map<String, String[]> map = request.getParameterMap();
			User user = new User();
			BeanUtils.populate(user,map);
			
			//创建并调用Service层对象的方法
			UserService userService = new UserService();
			boolean flag = userService.regsiter(user);
			
			//根据返回结果进行处理
			if(flag){
				response.sendRedirect(request.getContextPath()+"/register_ok.jsp");
			}else{
				MessageUtil.forward("用户注册失败，请重新注册", request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
			MessageUtil.forward("用户注册异常，请联系管理员", request, response);
		}
	}

}

