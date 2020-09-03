package com.gdcp.test;

import org.apache.ibatis.session.SqlSession;

import com.gdcp.po.Classes;
import com.gdcp.utils.MybatisUtils;

public class Test1 {

	public static void main(String[] args) {

		 SqlSession session = MybatisUtils.getSession();
		 
//		 String statement = "com.gdcp.mapper.ClassMapper.getClass";
		 String statement = "com.gdcp.mapper.ClassMapper.getClass2";
		 
		 Classes clazz = session.selectOne(statement,1);
		 
		 session.close();
		 
		 System.out.println(clazz);

	}

}
