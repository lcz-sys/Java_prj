package cn.gdcp.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
	
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import cn.gdcp.po.User;
public class LoginInterceptor implements HandlerInterceptor{

	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
		System.out.println("进入拦截器");
		String url = arg0.getRequestURI();
		if(url.indexOf("/login")>=0){
			return true;
		}
		
		HttpSession session = arg0.getSession();
		User user = (User) session.getAttribute("user_session");
		if(user != null){
			return true;
		}
		arg0.setAttribute("msg", "您还没有登录");
		arg0.getRequestDispatcher("/jsp/login.jsp").forward(arg0, arg1);
		return false;
	}
	

}
