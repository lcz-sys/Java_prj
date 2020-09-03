package com.gdcp.jdk;

public class JdkTset {
	
	public static void main(String[] args) {
		JdkProxy jdkProxy = new JdkProxy();
		
		UserDao userDao = new UserDaoImpl();
		
		UserDao userDao1 = (UserDao) jdkProxy.createProxy(userDao);
		
		userDao1.addUser();
		userDao1.deleteUser();
	}

}
