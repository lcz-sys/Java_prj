package cn.gdcp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.gdcp.po.User;

@Controller
public class UserController3 {
	
	@RequestMapping(value="/toUser")
	public String selectUsers() {
		
		return "user";
		
	}
	
	@RequestMapping(value="/deleteUsers")
	public String deleteUsers(Integer[] ids) {
		if(ids!= null){
			for(Integer id: ids){
				System.out.println("删除了id为"+id+"的用户");
			}
		}else{
			System.out.println("ids=null");
		}
		return "success";
		
	}

}
