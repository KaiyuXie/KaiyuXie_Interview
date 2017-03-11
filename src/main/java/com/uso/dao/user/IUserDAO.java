package com.uso.dao.user;

import com.uso.dao.IBaseDAO;
import com.uso.params.UserParams;

/**
 * User DAO实现类
 * @author KaiyuXie
 *
 */
public interface IUserDAO extends IBaseDAO<UserParams>{
	/**
	 * 保存用户信息
	 * @param params 
	 * @return 返回影响条数
	 */
	public int saveUser(UserParams params);
}
