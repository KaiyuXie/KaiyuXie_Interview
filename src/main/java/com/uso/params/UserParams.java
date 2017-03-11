package com.uso.params;

import java.io.Serializable;

import lombok.Data;

/**
 * 用户参数类
 * @author KaiyuXie
 */
@Data
public class UserParams implements Serializable{

	private static final long serialVersionUID = 7139336253689478293L;
	
	private String username; // 姓名
	private byte gender;     // 性别1表示男 0表示女
	private int age;         // 年龄
	private String address;  // 住址
}