package com.gdcp.po;

public class Customer {

	private Integer id;
	private String username;
	private String Job;
	private String phone;
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getJob() {
		return Job;
	}
	public void setJob(String Job) {
		this.Job = Job;
	}
	
	public String toString (){
		return "["+this.getUsername()+","+this.getJob()+","+this.getPhone()+"]";
	}
	
	
}
