package com.gdcp.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.gdcp.po.Book;

public class updateBookTest {

	public static void main(String[] args) throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		Book book = new Book();
		book.setId(5);
		book.setName("你好");
		book.setAuthor("憨憨");
		book.setPrice(100);
		book.setPublish("出版社1");
		
		int rows = sqlSession.update("com.gdcp.mapper.BookMapper.updateBook",book);
		
		if(rows>0){
			System.out.println("修改了"+rows+"条数据");
		}else{
			System.out.println("修改失败");
		}
		sqlSession.commit();
		
		sqlSession.close();
	}

}
