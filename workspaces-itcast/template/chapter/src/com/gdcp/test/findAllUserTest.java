package com.gdcp.test;

import org.apache.ibatis.session.SqlSession;

import com.gdcp.po.User;
import com.gdcp.utils.MybatisUtils;
import java.util.*;
public class findAllUserTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//ªÒ»°session
		SqlSession  sqlSession = MybatisUtils.getSession();
		List<User>  list =
				sqlSession.selectList("cn.gdcp.mapper.UserMapper.findAllUser");
		for (User user:list){
			System.out.println(user.getName());
		}
		
	}

}
