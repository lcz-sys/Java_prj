package com.gdcp.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.gdcp.po.Student;
import com.gdcp.utils.MybatisUtils;

public class StudentTest1 {
    
	public static void main(String args[]){
        SqlSession sqlSession = MybatisUtils.getSession();
        
        String statement = "com.gdcp.mapper.StudentMapper.selectStudentCourse";//Ó³ÉäsqlµÄ±êÊ¶×Ö·û´®
        List<Student> students = sqlSession.selectList(statement);
        for(Student student:students){
        	System.out.println(student);
        }
        sqlSession.close();
        
	}

}