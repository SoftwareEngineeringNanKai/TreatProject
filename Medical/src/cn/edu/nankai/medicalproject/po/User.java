package cn.edu.nankai.medicalproject.po;

import java.io.Serializable;

public class User implements Serializable {
	
	private String uid;
	private String name;
	private String password;
	private int gender;
	public User(String uid, String name, String password, int gender) {
		super();
		this.uid = uid;
		this.name = name;
		this.password = password;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", name=" + name + ", password=" + password
				+ ", gender=" + gender + "]";
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	
	

}
