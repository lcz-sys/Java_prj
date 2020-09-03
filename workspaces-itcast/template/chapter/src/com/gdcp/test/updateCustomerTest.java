package com.gdcp.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.gdcp.po.Customer;

public class updateCustomerTest {

	public static void main(String[] args) throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		Customer customer = new Customer();
		customer.setId(7);
		customer.setUsername("sssss");
		customer.setJob("122222222222111111");
		customer.setPhone("55555555");
		
		int rows = sqlSession.update("com.gdcp.mapper.CustomerMapper.updateCustomer",customer);
		
		if(rows>0){
			System.out.println("修改了"+rows+"条数据");
		}else{
			System.out.println("修改失败");
		}
		sqlSession.commit();
		
		sqlSession.close();
	}

}
