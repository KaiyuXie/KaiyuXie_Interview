package com.uso.service.user;

import com.uso.params.UserParams;

/**
 * 用户业务接口
 * @author KaiyuXie
 *
 */
public interface IUserService {
	
	/**
	 * 保存用户信息
	 * @param user
	 * @return 返回结果码
	 */
	public int saveUser(UserParams userParams);
}
