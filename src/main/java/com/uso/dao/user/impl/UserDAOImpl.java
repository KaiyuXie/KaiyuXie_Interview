package com.uso.dao.user.impl;

import org.springframework.stereotype.Repository;

import com.uso.dao.BaseDAOImpl;
import com.uso.dao.user.IUserDAO;
import com.uso.params.UserParams;

@Repository
public class UserDAOImpl extends BaseDAOImpl<UserParams>implements IUserDAO{
	private static final String NAMESPACE = "com.uso.User";
	
	public int saveUser(UserParams params) {
		return super.getWriteTemplate().insert(NAMESPACE + "saveUser", params);
	}
}