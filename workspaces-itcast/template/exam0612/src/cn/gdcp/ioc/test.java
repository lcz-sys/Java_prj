package cn.gdcp.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	

	public static void main(String[] args) {
		ApplicationContext applicationContext =  new ClassPathXmlApplicationContext("applicationContext.xml");
	
	
		MobileDao mobileDao = (MobileDao) applicationContext.getBean("mobileDao");
	
		mobileDao.move();
	}

}