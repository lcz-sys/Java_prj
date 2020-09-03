package com.gdcp.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.gdcp.po.Customer;

public class deleteCustomerTest {

	public static void main(String[] args) throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		Customer customer = new Customer();
		customer.setId(5);
		
		int rows = sqlSession.update("com.gdcp.mapper.CustomerMapper.deleteCustomer",customer);
		
		if(rows>0){
			System.out.println("ɾ����"+rows+"������");
		}else{
			System.out.println("ɾ��ʧ��");
		}
		sqlSession.commit();
		
		sqlSession.close();
	}

}
