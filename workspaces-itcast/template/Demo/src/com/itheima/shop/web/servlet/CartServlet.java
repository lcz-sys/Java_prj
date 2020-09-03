package com.itheima.shop.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.itheima.shop.entity.Cart;
import com.itheima.shop.service.CartService;
import com.itheima.shop.util.MessageUtil;

@WebServlet("/cart")
public class CartServlet extends HttpServlet {
	private CartService cartService = new CartService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String method = request.getParameter("method");
		switch(method){
		case "addProduct":
			this.addProduct(request, response);
			break;
		case "deleteProduct":
			this.deleteProduct(request, response);
			break;
		case "deleteAllProduct":
			this.deleteAllProduct(request, response);
			break;
		case "updateProduct":
			this.updateProduct(request, response);
			break;
		}
	}
	/**
	 * 修改购物车中商品的数量
	 */
	private void updateProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取数据
		int pid = Integer.parseInt(request.getParameter("pid"));
		int num = Integer.parseInt(request.getParameter("num"));
		Cart cart = (Cart) request.getSession().getAttribute("cart");
		//调用Service层对象的方法
		cartService.updateProduct(pid,num,cart);
		//重定向到cart.jsp页面
		response.sendRedirect(request.getContextPath()+"/cart.jsp");
	}
	/**
	 * 清空购物车
	 */
	private void deleteAllProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取数据
		Cart cart = (Cart) request.getSession().getAttribute("cart");
		//调用Service层对象的方法
		cartService.deleteAllProduct(cart);
		//重定向到cart.jsp页面
		response.sendRedirect(request.getContextPath()+"/cart.jsp");
	}
	/**
	 * 删除购物项
	 */
	private void deleteProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取数据
		int pid = Integer.parseInt(request.getParameter("pid"));
		Cart cart = (Cart) request.getSession().getAttribute("cart");
		//调用Service层对象的方法
		cartService.deleteProduct(pid,cart);
		//重定向到cart.jsp页面
		response.sendRedirect(request.getContextPath()+"/cart.jsp");
	}
	/**
	 * 加入购物车
	 */
	private void addProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			//获取数据
			int pid = Integer.parseInt(request.getParameter("pid"));
			int num = Integer.parseInt(request.getParameter("num"));
			Cart cart = (Cart) request.getSession().getAttribute("cart");
			//如果购物车为空，则创建购物车，并将购物车放入HttpSession中
			if(cart == null){
				cart = new Cart();
				request.getSession().setAttribute("cart",cart);
			}
			//调用Service层对象的方法
			cartService.addProduct(pid,num,cart);
			//重定向到cart.jsp页面
			response.sendRedirect(request.getContextPath()+"/cart.jsp");
		} catch (Exception e) {
			e.printStackTrace();
			MessageUtil.forward("加入购物车异常，请联系管理员", request, response);
		}
	}
}
