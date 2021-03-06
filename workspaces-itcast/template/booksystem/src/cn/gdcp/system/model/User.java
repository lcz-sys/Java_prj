package cn.gdcp.system.model;

//用户类，匹配t_user表
public class User {
	private int id; // 编号
	private String username; // 用户名
	private String password; // 密码
	private String email; // 邮箱
	private String gender; // 性别
	
	//构造方法
	public User(){}
	
	//getter setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
