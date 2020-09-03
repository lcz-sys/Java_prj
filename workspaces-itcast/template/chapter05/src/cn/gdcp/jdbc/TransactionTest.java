package cn.gdcp.jdbc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TransactionTest {

	@Test
	public void xmlTest() {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		AccountDao accountDao = (AccountDao) context.getBean("accountDao");

		accountDao.transfer("tom", "jhon", 1000);

		System.out.println("转账成功");

	}

	@Test
	public void annotationTest() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		AccountDao accountDao = (AccountDao) context.getBean("accountDao");

		accountDao.transfer("tom", "jhon", 3000);

		System.out.println("转账成功");
	}

}
