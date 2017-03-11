package com.uso.params;

import java.io.Serializable;

/**
 * 用户参数类
 * @author KaiyuXie
 */
public class UserParams implements Serializable{

	private static final long serialVersionUID = 7139336253689478293L;
	
	private String username; // 姓名
	private byte gender;     // 性别1表示男 0表示女
	private int age;         // 年龄
	private String address;  // 住址
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public byte getGender() {
		return gender;
	}
	public void setGender(byte gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}