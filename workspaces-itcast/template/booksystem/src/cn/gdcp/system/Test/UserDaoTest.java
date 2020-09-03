package cn.gdcp.system.Test;

import org.junit.Test;

import cn.gdcp.system.dao.UserDao;
import cn.gdcp.system.model.User;

public class UserDaoTest {
	
	@Test
	public void registerTest() throws Exception{
		UserDao userDao = new UserDao();
		
		User user = new User();
		user.setUsername("admin");
		user.setPassword("123456");
		user.setEmail("admin@qq.com");
		user.setGender("ÄÐ");
		
		userDao.register(user);
		
	}

}
