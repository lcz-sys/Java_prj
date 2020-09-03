package com.itheima.shop.entity;

/*
 * 用户
 */
public class User implements java.io.Serializable {

	// uid：用户的编号
	private int uid;
	// username：用户的登陆名
	private String username;
	// password：用户的登陆密码
	private String password;
	// name：用户的真实姓名
	private String name;
	// email：用户的邮件
	private String email;
	// telephone：用户的手机号
	private String telephone;
	// birthday：用户的生日
	private String birthday;
	// sex：用户的性别
	private String sex;

	public User() {
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
}
