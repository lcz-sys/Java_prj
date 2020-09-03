package com.itheima.shop.web.servlet;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.itheima.shop.entity.PageBean;
import com.itheima.shop.entity.Product;
import com.itheima.shop.service.ProductService;
import com.itheima.shop.util.MessageUtil;

@WebServlet("/product")
public class ProductServlet extends HttpServlet {
	private ProductService productService = new ProductService();;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String method = request.getParameter("method");
		switch(method){
			case "findHotNewProduct":
				this.findHotNewProduct(request, response);
				break;
			case "findAllProductByCid":
				this.findAllProductByCid(request, response);
				break;
			case "findProductByPid":
				this.findProductByPid(request, response);
				break;
		}
	}
	/**
	 * 根据商品编号查询商品详细信息
	 */
	private void findProductByPid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			//获取数据
			int pid = Integer.parseInt(request.getParameter("pid"));
			//调用service层对象的方法
			Product product = productService.findProductByPid(pid);
			//将Product放入request域对象
			request.setAttribute("product", product);
			//转发到product-info.jsp页面
			request.getRequestDispatcher("/product_info.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
			MessageUtil.forward("根据商品编号查询商品详细信息异常，请联系管理员", request, response);
		}
		
	}
	/**
	 * 根据类别分页查询所有的商品
	 */
	private void findAllProductByCid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			//获取数据
			String strCid = request.getParameter("cid");
			String strCurrPageNO = request.getParameter("currPageNO");
			if(strCurrPageNO==null){
				strCurrPageNO="1";
			}
			//将String转成int
			int cid = Integer.parseInt(strCid);
			int currPageNO = Integer.parseInt(strCurrPageNO);
			PageBean<Product> pageBean = productService.findAllProductByCid(cid,currPageNO);
			//将PageBean放入request域对象，并转发到product_list.jsp页面
			request.setAttribute("pageBean",pageBean);
			request.getRequestDispatcher("/product_list.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
			MessageUtil.forward("根据类别分页查询所有的商品异常，请联系管理员", request, response);
		}
	}
	/**
	 * 首页热门和最新商品的显示
	 */
	private void findHotNewProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			List<Product> hotProductList = productService.findHotProduct();
			List<Product> newProductList = productService.findNewProduct();
			//将热门、最新商品放入request域对象，转发到/index.jsp页面 
			request.setAttribute("hotProductList",hotProductList);
			request.setAttribute("newProductList",newProductList);
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
			MessageUtil.forward("首页热门和最新商品的显示异常，请联系管理员", request, response);
		}
	}
}
