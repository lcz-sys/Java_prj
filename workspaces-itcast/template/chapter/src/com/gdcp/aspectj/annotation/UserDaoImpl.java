package com.gdcp.aspectj.annotation;

import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

	@Override
	public void addUser() {
		System.out.println("����û�");

	}

	@Override
	public void deleteUser() {
		System.out.println("ɾ���û�");
	}

}
