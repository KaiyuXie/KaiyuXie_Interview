package com.uso.ret;

import java.io.Serializable;

public class Ret implements Serializable{

	private static final long serialVersionUID = 4060249007968998886L;
	
	/**
	 * 错误码
	 */
	private int code;
	
	/**
	 * 错误信息
	 */
	private String msg;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}