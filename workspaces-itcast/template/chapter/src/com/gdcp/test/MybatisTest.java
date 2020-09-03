package com.gdcp.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.gdcp.po.Book;
import com.gdcp.po.Customer;

public class MybatisTest {

	public static void main(String[] args) throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
//		//id查询
//		Customer customer = sqlSession.selectOne("com.gdcp.mapper.CustomerMapper.findCustomerById",0);
//		System.out.println(customer.getUsername());
//		
		//模糊查询
		List<Customer> customers = sqlSession.selectList("com.gdcp.mapper.CustomerMapper.findCustomerByName","j");
 		for(Customer customer2 : customers){
 			System.out.println(customer2.getUsername());
 		}
		
//		List<Book> books = sqlSession.selectList("com.gdcp.mapper.BookMapper.findBookByAuthor", "作者1");
//		for(Book book : books){
// 			System.out.println(book.getName());
// 		}
// 		
		sqlSession.close();
	}

}
