package com.gdcp.aspectj.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationAspectjTest {

	public static void main(String[] args) {
		
		String xmlPath = "com/gdcp/aspectj/annotation/applicationContext.xml";
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		
		UserDao userDao = (UserDao) applicationContext.getBean("userDao");
		userDao.addUser();
		userDao.deleteUser();
	}

}
