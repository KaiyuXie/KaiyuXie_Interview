package com.uso.service.user.impl;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
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
	
	private static final Logger logger = Logger.getLogger(UserServiceImpl.class);
	
	@Resource
	private IUserDAO userDAO;
	
	@Transactional
	public int saveUser(UserParams userParams) {
		logger.info(userParams);
		return userDAO.saveUser(userParams);
	}
}