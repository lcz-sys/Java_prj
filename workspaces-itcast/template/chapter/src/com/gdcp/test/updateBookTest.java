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
		book.setName("���");
		book.setAuthor("����");
		book.setPrice(100);
		book.setPublish("������1");
		
		int rows = sqlSession.update("com.gdcp.mapper.BookMapper.updateBook",book);
		
		if(rows>0){
			System.out.println("�޸���"+rows+"������");
		}else{
			System.out.println("�޸�ʧ��");
		}
		sqlSession.commit();
		
		sqlSession.close();
	}

}
