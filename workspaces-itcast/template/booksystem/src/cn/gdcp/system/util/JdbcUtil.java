package cn.gdcp.system.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcUtil {
	
	public static Connection getConnection() throws Exception{
		//ע������
		Class.forName("com.mysql.jdbc.Driver");
		//��ȡ����
		/*
		 * getConnection(url, user, pwd);
		 * url : ���ӵ�ַ
		 * user : �û���
		 * pwd : ����
		 */
		String url = "jdbc:mysql://localhost:3306/booksystem";
		Connection conn = DriverManager.getConnection(url, "root", "123456");
		
		return conn;
	}
}
