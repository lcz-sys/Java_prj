package com.itheima.shop.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.itheima.shop.entity.User;
import com.itheima.shop.util.JdbcUtil;


public class UserDao {
	/**
	 * 用户注册
	 */
	public int regsiter(User user) throws SQLException{
		String sql = "insert into tab_user values (null,?,?,?,?,?,?,?)";
		Object[] params = {
				user.getUsername(),
				user.getPassword(),
				user.getName(),
				user.getEmail(),
				user.getTelephone(),
				user.getBirthday(),
				user.getSex()};
		QueryRunner runner = new QueryRunner(JdbcUtil.getDataSource());
		return runner.update(sql,params);
	}
	/**
	 * 用户登录
	 */
	public User login(String username, String passwordMD5) throws SQLException {
		String sql = "select * from tab_user where username=? and password=?";
		Object[] params = {username,passwordMD5};
		QueryRunner runner = new QueryRunner(JdbcUtil.getDataSource());
		return runner.query(sql,new BeanHandler<>(User.class),params);
	}


}
