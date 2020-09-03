package cn.gdcp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.gdcp.po.User;

@Controller
public class UserController {
	
	@RequestMapping(value="/login",method = RequestMethod.GET)
	public String toLogin() {
		
		return "login";
		
	}
	
	@RequestMapping(value="/login",method = RequestMethod.POST)
	public String login(User user, Model model,HttpSession session) {
		String username = user.getUsername();
		String password = user.getPassword();
		System.out.println("username="+username
				+"password="+password);
		
		if(username != null && username.equals("xiaoxue")
				&& password != null && password.equals("123456")){
			session.setAttribute("user_session", user);
			return "redirect:main";
		}
		model.addAttribute("msg","用户名或密码错误");
		return "login";
		
	}
	
	@RequestMapping(value="/main")
	public String tomain() {
		
		return "main";
		
	}
	
	@RequestMapping(value="/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:login";
		
	}

}
