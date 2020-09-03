package com.gdcp.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.gdcp.po.Course;
import com.gdcp.po.Student;
import com.gdcp.utils.MybatisUtils;

public class StudentTest2 {

	public static void main(String args[]) {
		SqlSession sqlSession = MybatisUtils.getSession();

		String statement = "com.gdcp.mapper.StudentMapper.findCourseByStudent";// Ó³ÉäsqlµÄ±êÊ¶×Ö·û´®
		Student student = new Student();
		student.setId(1);
		student.setId(2);
	
		 
	    List<Course> courses = sqlSession.selectList(statement,student);
	
	    for(Course course : courses){
	    	System.out.println(course.getName());
	    }

		sqlSession.close();

	}

}