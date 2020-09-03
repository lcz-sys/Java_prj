package cn.gdcp.jdbc;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class JDBCTemplateTest {

	@Test
	public void mainTest() {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");

		jdbcTemplate.execute("create table account(" + "id int primary key auto_increment," + "username varchar(50),"
				+ "balance double)");

		System.out.println("账户表account创建成功！");

	}

	@Test
	public void addAccount() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		AccountDao accountDao = (AccountDao) context.getBean("accountDao");

		Account account = new Account();
		account.setUsername("tom");
		account.setBalance(15000.0);
		
		int num = accountDao.addAccount(account);
		if(num>0){
			System.out.println("插入成功，插入"+num+"条数据");
		}else{
			System.out.println("插入失败");
		}
	}
	
	@Test
	public void updateAccount() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		AccountDao accountDao = (AccountDao) context.getBean("accountDao");

		Account account = new Account();
		account.setUsername("jhon");
		account.setBalance(8000.0);
		account.setId(1);
		
		int num = accountDao.updateAccount(account);
		if(num>0){
			System.out.println("更新成功，更新"+num+"条数据");
		}else{
			System.out.println("更新失败");
		}
	}
	
	@Test
	public void deleteAccount() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		AccountDao accountDao = (AccountDao) context.getBean("accountDao");

		Integer id = 4;
		
		int num = accountDao.deleteAccount(id);
		if(num>0){
			System.out.println("删除成功，删除"+num+"条数据");
		}else{
			System.out.println("删除失败");
		}
	}
	
	@Test
	public void findAccountbyId() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		AccountDao accountDao = (AccountDao) context.getBean("accountDao");

		Integer id = 5;
		Account account = accountDao.findAccountbyId(id);
		System.out.println("id为5的是"+account);
		
		
	}
	
	@Test
	public void findAccount() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		AccountDao accountDao = (AccountDao) context.getBean("accountDao");

		List<Account> list = accountDao.findAllAccount();
		
		for(Account account: list){
			System.out.println(account);
		}
		
	}

}
