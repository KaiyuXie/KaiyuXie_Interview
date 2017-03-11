package com.uso.service.user.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uso.dao.user.IUserDAO;
import com.uso.params.UserParams;
import com.uso.service.user.IUserService;

/**
 * 用户业务实现类
 * @author KaiyuXie
 *
 */
@Service("userServiceImpl")
public class UserServiceImpl implements IUserService{

	@Resource
	private IUserDAO userDAO;
	
	@Transactional
	public int saveUser(UserParams userParams) {
		return userDAO.saveUser(userParams);
	}
}