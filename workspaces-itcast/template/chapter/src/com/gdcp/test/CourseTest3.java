package com.gdcp.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.gdcp.po.Course;
import com.gdcp.po.Student;
import com.gdcp.utils.MybatisUtils;

public class CourseTest3 {

	public static void main(String args[]) {
		SqlSession sqlSession = MybatisUtils.getSession();

		String statement = "com.gdcp.mapper.StudentMapper.selectStudentCourse";// Ó³ÉäsqlµÄ±êÊ¶×Ö·û´®
		List<Student> students = sqlSession.selectList(statement);
		for (Student student : students) {
			System.out.println(student);
		}

		Course course = new Course();
		course.setId(1);
		course.setId(2);

		List<Student> students1 = sqlSession.selectList(statement, course);

		for (Student student : students1) {
			System.out.println(student.getName());
		}
		sqlSession.close();

	}

}