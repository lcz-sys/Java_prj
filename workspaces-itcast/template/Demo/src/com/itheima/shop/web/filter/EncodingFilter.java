package com.itheima.shop.web.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 全网站GET/POST请求乱码过滤器
 */
@WebFilter(filterName="EncodingFilter",urlPatterns="/*")
public class EncodingFilter implements Filter {
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}
	
	@Override
	public void doFilter(ServletRequest req, ServletResponse res,FilterChain chain) throws IOException, ServletException {
		System.out.println("经过过滤器");
		//父子接口强转
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) res;
		//获取客户端请求的方式
		String method = request.getMethod();
		//如果请求方式为POST
		if("POST".equalsIgnoreCase(method)){
			//用POST专用代码解决乱码问题
			request.setCharacterEncoding("UTF-8");
			//放行请求
			chain.doFilter(request,response);
		//如果请求方式为GET,Tomcat8服务器对GET请求无需解决中文乱码问题
		}else if("GET".equalsIgnoreCase(method)){
			//放行请求
			chain.doFilter(request,response);
		}
	}
	
	@Override
	public void destroy() {
	}
	
}








