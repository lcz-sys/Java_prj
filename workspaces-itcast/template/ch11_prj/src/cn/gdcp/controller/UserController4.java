package cn.gdcp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.gdcp.po.User;
import cn.gdcp.vo.UserVo;

@Controller
public class UserController4 {
	
	@RequestMapping(value="/toUserEdit")
	public String toUserEdit() {
		
		return "user_edit";
		
	}
	
	@RequestMapping(value = "/editUsers")
	public String editUsers(UserVo userList) {
		List<User> users = userList.getUsers();

		for (User user : users) {
			if (user.getId() != null) {
				System.out.println("修改了id为" + user.getId() + "的用户名为" + user.getUsername());
			}
		}

		return "success";

	}

}
