package cn.gdcp.system.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcUtil {
	
	public static Connection getConnection() throws Exception{
		//注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		//获取连接
		/*
		 * getConnection(url, user, pwd);
		 * url : 连接地址
		 * user : 用户名
		 * pwd : 密码
		 */
		String url = "jdbc:mysql://localhost:3306/booksystem";
		Connection conn = DriverManager.getConnection(url, "root", "123456");
		
		return conn;
	}
}
