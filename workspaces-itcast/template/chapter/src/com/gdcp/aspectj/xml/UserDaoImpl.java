package com.gdcp.aspectj.xml;

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
