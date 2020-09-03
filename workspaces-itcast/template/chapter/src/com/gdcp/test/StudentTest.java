package com.gdcp.test;

import org.apache.ibatis.session.SqlSession;

import com.gdcp.po.Classes;
import com.gdcp.utils.MybatisUtils;

public class StudentTest {

	public static void main(String[] args) {
		
		SqlSession session = MybatisUtils.getSession();
		
		Classes clazz = session.selectOne("com.gdcp.mapper.ClassMapper.findClassesWithStudent",1);
		
		System.out.println(clazz);
		
		session.close();
	}

}
