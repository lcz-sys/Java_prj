package cn.gdcp.system.model;

//�û��࣬ƥ��t_user��
public class User {
	private int id; // ���
	private String username; // �û���
	private String password; // ����
	private String email; // ����
	private String gender; // �Ա�
	
	//���췽��
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
