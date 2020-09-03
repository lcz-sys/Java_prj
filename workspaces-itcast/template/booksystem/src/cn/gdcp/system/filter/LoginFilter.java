package cn.gdcp.system.filter;

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

import cn.gdcp.system.model.User;

@WebFilter("/*")
public class LoginFilter implements Filter {

	@Override
	public void destroy() {
	
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		//将请求响应对象换成Http的请求响应对象
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		
		//请求响应地址
		String path = req.getRequestURI();
		if(path.contains("/login.jsp") 
				|| path.contains("/register.jsp") 
				|| path.contains("/loginServlet") 
				|| path.contains("/registerServlet")
				|| path.contains("/checkServlet") 
				|| path.contains("/js") 
				|| path.contains("/css") 
				|| path.contains("/images")){
			chain.doFilter(req, resp);
		}else{
			User user = (User) req.getSession().getAttribute("USER");
			
			if(user != null){
				chain.doFilter(req, resp);
			}else{
				resp.sendRedirect(req.getContextPath()+"/login.jsp");
			}
		}
		
	}

	@Override
	public void init(FilterConfig config) throws ServletException {
	
	}

}
