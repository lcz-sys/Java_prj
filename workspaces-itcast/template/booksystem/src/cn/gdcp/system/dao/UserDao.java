package cn.gdcp.system.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import cn.gdcp.system.model.User;
import cn.gdcp.system.util.JdbcUtil;

//用户的数据访问类，t_user表的增删改查
public class UserDao {
	
	public User login(String username, String pwd) throws Exception{
		Connection conn = JdbcUtil.getConnection();
		String sql = "select * from t_user where username=? and password=?";
		PreparedStatement prps = conn.prepareStatement(sql);
		prps.setString(1,username);
		prps.setString(2, pwd);
		ResultSet set = prps.executeQuery();
		if(set.next()){
			int id = set.getInt("id");
			String name = set.getString("username");
			String password = set.getString("password");
			String email = set.getString("email");
			String gender = set.getString("gender");
			User user = new User();
			user.setId(id);
			user.setUsername(username);
			user.setPassword(password);
			user.setEmail(email);
			user.setGender(gender);
			return user; 
		}
		return null;
	}
	
	public boolean checkName(String username) throws Exception{
		Connection conn = JdbcUtil.getConnection();
		String sql = "select * from t_user where username=?";
		PreparedStatement prps = conn.prepareStatement(sql);
		prps.setString(1, username);
		ResultSet set = prps.executeQuery();
		if(set.next()){
			return false;
		}
		return true;
	}

	//完成注册功能
	public void register(User user) throws Exception{
		//获取链接
		Connection conn = JdbcUtil.getConnection();
		//获取执行者对象
		String sql = "insert into t_user(username, password, email, gender) value(?,?,?,?)";
		PreparedStatement prps = conn.prepareStatement(sql);
		prps.setString(1, user.getUsername());
		prps.setString(2, user.getPassword());
		prps.setString(3, user.getEmail());
		prps.setString(4, user.getGender());
		
		//执行sql语句
		prps.execute();
		
		//解析数据集
		//关闭数据库链接
		prps.close();
	}
}
