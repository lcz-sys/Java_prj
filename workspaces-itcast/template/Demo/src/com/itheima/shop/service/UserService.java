package com.itheima.shop.service;

import com.itheima.shop.dao.UserDao;
import com.itheima.shop.entity.User;
import com.itheima.shop.util.Md5Util;

public class UserService {
	/*
	 * 用户注册
	 */
	public boolean regsiter(User user) throws Exception {
		// 获取原始密码
		String password = user.getPassword();
		// 将原始密码进行加密
		String passwordMD5 = Md5Util.encodeByMd5(password);
		// 将加密密码封装到用户中
		user.setPassword(passwordMD5);
		// 创建Dao层对象
		UserDao userDao = new UserDao();
		// 调用Dao层对象的方法
		return userDao.regsiter(user) > 0 ? true : false;
	}

	/*
	 * 用户登录
	 */
	public User login(String username, String password) throws Exception {
		// 将原始密码进行加密
		String passwordMD5 = Md5Util.encodeByMd5(password);
		// 创建Dao层对象
		UserDao userDao = new UserDao();
		// 调用Dao层对象的方法
		return userDao.login(username, passwordMD5);
	}

}
