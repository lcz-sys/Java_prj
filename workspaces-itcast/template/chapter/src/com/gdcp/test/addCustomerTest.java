package com.gdcp.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.gdcp.po.Customer;

public class addCustomerTest {

	public static void main(String[] args) throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		Customer customer = new Customer();
		customer.setId(2);
		customer.setUsername("jason");
		customer.setJob("programmer");
		customer.setPhone("13725392851");
		
int rows = sqlSession.update("com.gdcp.mapper.CustomerMapper.addCustomer",customer);
		
		if(rows>0){
			System.out.println("增加了"+rows+"条数据");
		}else{
			System.out.println("增加失败");
		}
		sqlSession.commit();
		
		sqlSession.close();

	}

}
