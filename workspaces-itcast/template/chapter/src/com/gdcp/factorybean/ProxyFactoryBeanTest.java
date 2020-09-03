package com.gdcp.factorybean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gdcp.jdk.UserDao;

public class ProxyFactoryBeanTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String xmlPath = "com/gdcp/factorybean/applicationContext.xml";
		
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

		UserDao userDao = (UserDao) applicationContext.getBean("userDaoProxy");
		
		userDao.addUser();
		userDao.deleteUser();
		
	}

}
